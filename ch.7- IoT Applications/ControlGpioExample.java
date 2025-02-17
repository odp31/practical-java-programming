// demonstrates how to perform simple state contorl of a GPIO pin on the raspberry pi 

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class ControlGpioExample {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("<---Pi4J----> GPIO Control Example.. started");
    final GpioController gpio = GpioFactory.getInstance();
    final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
    // set shutdown state for this pin
    pin.setShutdownOptions(true, PinState.LOW);
    System.out.println("GPIO state should be: ON");
    Thread.sleep(5000):
    // turn off gpio pin #01
    pin.low();
    System.out.println("gpio state should be OFF");
    Thread.sleep(5000);
    // toggle current state of gpio pin
    pin.toggle();
    System.out.println("gpio state should be ON");
    Thread.sleep(5000);
    // toggle current satte of gpio pin 1 
    pin.toggle();
    System.out.println("gpio state should be OFF");
    Thread.sleep(5000);
    // turn on gpio pin 1 for 1 second and then off
    System.out.println("gpio state should be on for 1 second");
    pin.pulse(1000, true);
    gpio.shutdown();
    System.out.println("exiting controlGpioExample");
  }
}
