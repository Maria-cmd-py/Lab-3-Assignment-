// SmartHome.java (Inside homeautomation.main)
package homeautomation.main;
import homeautomation.sensors.TemperatureSensor;
import homeautomation.devices.LightControl;
import homeautomation.communication.HomeNetwork;
public class SmartHome {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        LightControl light = new LightControl();
        HomeNetwork network = new HomeNetwork();
        int currentTemperature = sensor.getTemperature();
        System.out.println("Temperature Sensor Reading: " + currentTemperature + "°C");
        light.controlLight(currentTemperature);
        network.sendStatusMessage(light.isLightOn());
    }
}