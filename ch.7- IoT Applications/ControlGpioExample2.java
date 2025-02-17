// ex. 7.3 
import com.pi4j.io.gpio.*;

public class ControlGpioExample2 {
  // create gpio controller
  final static GpioController gpio = GpioFactory.getInstance();
  // provison gpio pin 1 as an output pin and turn on
  final static GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
  public static void main(String[] args) throws InterruptedException {
    // set shutdown state for this pin
    pin.setShutdownOptions(true, PinState.LOW);
    // toggle current state of gpio pin
    for(int i = 0; i < 10; i++) {
      pin.toggle();
      Thread.sleep(1000);
    }
    gpio.shutdown();
  }
}
