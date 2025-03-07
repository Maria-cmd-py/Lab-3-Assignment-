// TemperatureSensor.java (Inside homeautomation.sensors)
package homeautomation.sensors;
import java.util.Random;
public class TemperatureSensor {
    public int getTemperature() {
        Random random = new Random();
        return 18 + random.nextInt(15); // Generates a temperature between 18°C and 32°C
    }
}