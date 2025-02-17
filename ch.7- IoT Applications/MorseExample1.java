// ex 7.2; morse code demo program

import com.pi4j.iop.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class MorseExample1 {
  // create gpio controller
  final static GpioController gpio = GpioFactory.getInstance();
  // provision gpio pin 1 as an output pin and turn on
  final static GpioPinDigitalOutput pin = gpio.provisonDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);

  public static void main(String[] args) throws InterruptedException {
    // set shutdown state for this pin
    pin.setShutdownOption(true, PinState.LOW);

    System.out.println("morse code 'a' - dot, dash shortspace");
    dot();
    dash();
    shortspace();
    gpio.shutdown();
  }
  static void dot() throws InterruptedException {
    pin.high();
    Thread.sleep(300);
    pin.low();
    Thread.sleep(300);
  }
  static void dash() throws InterruptedException {
    pin.high();
    Thread.sleep(900);
    pin.low();
    Thread.sleep(300);
  }
  static void shortspace() throws InterruptedException {
    Thread.sleep(600);
  }
}
