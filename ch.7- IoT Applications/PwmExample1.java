// ex 7.6
import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;

public class PwmExample1 {
  public static void main(String[] args) throws InterruptedException {
    // create Gpio controller instance
    GpioController gpio = GpioFactory.getInstance();
    Pin pin = CommandArgumentParser.getPin(RaspiPin.class, RaspiPin.GPIO_01, args);
    GpioPinPwmOutput pwm = gpio.provisoinPwmOutputPin(pin);
    com.pi5j.wiringpi.Gpio.pwsmSetMode(com.pi4j.wiringpi.Gpio.PWM_MODE_MS);
    com.pi4j.wiringpi.Gpio.pwmSetRange(1000);
    com.pi4j.wiringpi.Gpio.pwmSetClock(500);
    // set PWM rate to 500
    pwm.setPwm(500);
    System.out.println("PWM rate is: " + pwm.getPwm());
    Thread.sleep(10000);
    pwm.setPwm(0);
    System.out.println("PWM rate is: " + pwm.getPwm());
    // stop all gpio activity/threads
    gpio.shutdown();
  }
}
