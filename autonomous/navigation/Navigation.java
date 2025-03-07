// Navigation.java (Inside autonomous.navigation)
package autonomous.navigation;
import autonomous.sensors.SensorData;

public class Navigation extends SensorData {
    public void calculatePath() {
        System.out.println("Processing sensor data...");
        System.out.println("Navigation Decision: Move Forward - " + getSensorReadings());
    }
}