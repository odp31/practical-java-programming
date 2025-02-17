import java.util.*;
import com.pi4j.io.i2c.*;

public class I2CScan {
  public static void main(String[] args) throws Exception {
    final I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1);
    for(int i = 1; i < 128; i++) {
      try {
        I2CDevice device = bus.getDevice(i);
        device.write((byte)0);
        System.out.println("found address: " + Integer.toHexString(i));
      } catch (Exception ignore) {}
    }
  }
}
