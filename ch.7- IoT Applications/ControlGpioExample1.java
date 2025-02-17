// ex 7.1; control gpio example 
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class ControlGpioExample1 {
  // create gpio controller 
  final static GpioController gpio = GpioFactory.getInstance();
  final static GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "Myled", PinState.HIGH);
  public static void main(String[] args) throws InterruptedException {
    pin.setShutdownOptions(true, PinState.LOW);
    pin.high();
    Thread.sleep(500);
    pin.low();
    Thread.sleep(500);
    pin.high();
    Thread.sleep(500);
    gpio.shutdown();
  }
}
