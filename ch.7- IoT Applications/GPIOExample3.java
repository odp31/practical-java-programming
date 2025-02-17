// ex 7.4
import com.pi4j.io.gpio.*;
public class ControlGpioExample3 {
  public static void main(String[] args) throws InterruptedExceptino{
    // create gpio controller
    final GpioController gpio = GpioFactory.getInstance();
    // provision gpio pin 29 as an input pin
    final GpioPinDigitalInput Inp = gpio.provisionDigitalInputPin(RaspiPin.GPIO_29, PinPullResistance.PULL_DOWN);
    for(int i = 0; i < 10; i++) {
      // get state of pin, high or low
      System.out.println(Inp.getState());
      Thread.sleep(1000);
    }
    // this will shutdown all gpio monitoring threads and scheudled tasks
    gpio.shutdown();
  }
}
