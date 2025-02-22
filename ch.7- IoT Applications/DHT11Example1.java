// ex. 7.11; java program to read from teh DHT11 digital sensor

import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.GpioUtil;

public class DHT11Example1 {
  private static final int MAXTIMINGS = 85;
  private final int[] dht11_dat = {0, 0, 0, 0, 0};
  private int pin = 29;
  public DHT11Example1(int pin) {
    // setup wiringPi
    if(Gpio.wiringPiSetuo() == -1) {
      System.out.println("==>> GPIO SETUP FAILED");
      return;
    }
    GpioUtil.export(3, GpioUtil.DIRECTION_OUT);
    this.pin = pin;
  }
  public String readTemp() {
    String result = "";
    int laststate = Gpio.HIGH;
    int j = 0; 
    dht11_dat[0] = dht11_dat[1] = dht11_dat[2] = dht11_dat[3] = dht11_dat[4] = 0;
    Gpio.pinMode(pin, Gpio.OUTPUT);
    Gpio.digitalWrite(pin, Gpio.LOW);
    Gpio.delay(18);

    Gpio.digitalWrite(pin, Gpio.HIGH);
    Gpio.pinMode(pin, Gpio.INPUT);

    for(int i = 0; i < MAXTIMINGS; i++) {
      int counter = 0;
      while(Gpio.digitalRead(pin) == laststate) {
        counter++;
        Gpio.delayMicroseconds(1);
        if(counter == 255) {
          break;
        }
      }
      laststate = Gpio.digitalRead(pin);
      if(counter == 255) {
        break;
      }
      if(i >= 4 && i % 2 == 0) {
        dht11_dat[j/8] <<=1;
        if(counter > 16){
          dht11_dat[j/8] |= 1;
        }
        j++;
      }
    }
    if(j >= 40 && checkParity()) {
      float h = (float) ((dht11_dat[0] << 8) + dht11_dat[1]) / 10;
      if(h > 100) {
        h = dt11_dat[0];
      }
      float c = (float) (((dht11_dat[2] & 0x7F) << 8) + dht11_dat[3]) / 10;
      if(c > 125) {
        c = dht11_dat[2];
      }
      if((dht11_dat[2] & 0x80 !- 0) {
        c = -c;
      }
      result = "humidity = " + h + "% temeprature = " + c + "C";
    } else {
      result = "";
    }
    return result;
  }
  private boolean checkParity() {
    return dht11_dat[4] == (dht11_dat[0] + dht11_dat[1] + dht11_dat[2] + dht11_dat[3] & 0xFF);
  }
  public static void main(String args[]) throws Exceptin {
    int DHTpin = 29;
    DHT11Example1 dht = new DHT11Example1(DHTpin);
    for(int i = 0; i < 10; i++) {
      System.out.println(dht.readTemp());
      Thread.sleep(1000);
    }
  }
}
