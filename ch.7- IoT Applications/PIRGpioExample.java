// ex. 7.7; raspberry pi and java smart lighting system 

import com.pi4j.io.gpio.*;

public class PIRGpioExample {
  public static void main(String[] args) throws InterruptedException {
    // create gpio controller
    final GpioController gpio = GpioFactory.getInstance();

    // provision gpio pin 1 as an output pin and turn on 
    final GpioPinDigitalOutput LEDpin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);

    // set shutdown state for this pin
    LEDpin.setShutdownOptions(true, PinState.LOW);

    // provision gpio pin 40 as an PIR input pin
    final GpioPinDigitalInput PIRpin = gpio.provisionDigitalInputPin(RaspiPin.GPIO_29, PinPullResistance.PULL_DOWN);

    for(int i = 0; i < 10; i++) {
      // get state of pin, high or low
      System.out.println(PIRpin.getState());

      if(PIRpin.getState() == PinState.HIGH) {
        LEDpin.high();
      }
      else {
        LEDpin.low();
      }
      Thread.sleep(1000);
    }
    gpio.shutdown();
  }
}
