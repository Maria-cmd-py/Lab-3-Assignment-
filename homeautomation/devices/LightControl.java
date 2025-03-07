// LightControl.java (Inside homeautomation.devices)
package homeautomation.devices;
public class LightControl {
    private boolean lightStatus = false; // Default: Light OFF
    public void controlLight(int temperature) {
        if (temperature > 25) {
            lightStatus = true;
            System.out.println("Light Status: ON");
        } else {
            lightStatus = false;
            System.out.println("Light Status: OFF");
        }
    }
    public boolean isLightOn() {
        return lightStatus;
    }
}