// ex. 7.8
import com.pi4j.io.gpio.*;
import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.GpioUtil;

public class PIRGpioExample2 {
  public static void main(String[] args) throws InterruptedException {
    // create gpio controller
    final GpioController gpio = GpioFactory.getInstance();

    // provision gpio 1 as an output pin and turn on 
    final GpioPinDigitalOutput LEDpin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);

    // set shutdown state for this pin
    LEDpin.setShutdownOptions(true, Pinstate.LOW);

    // provision gpio pin 40 as an PIR input pin 
    Gpio.pinMode(40, Gpio.INPUT);

    for(int i = 0; i < 10; i++) {
      if(Gpio.digitalRead(30) == 1) {
        LEDpin.high();
        System.out.println("high");
      }
      else{
        LEDpin.low();
        System.out.println("LOW");
      }
      Thread.sleep(1000);
    }
    // this will shutdown all monitoring
    gpio.shutdown();
  }
}
