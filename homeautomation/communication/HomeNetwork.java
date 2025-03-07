// HomeNetwork.java (Inside homeautomation.communication)
package homeautomation.communication;
public class HomeNetwork {
    public void sendStatusMessage(boolean lightStatus) {
        if (lightStatus) {
            System.out.println("System Message: Lights turned ON based on temperature.");
        } else {
            System.out.println("System Message: Lights remain OFF.");
        }
    }
}