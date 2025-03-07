// AutonomousCar.java (Inside autonomous.main)
package autonomous.main;
import autonomous.navigation.Navigation;
import autonomous.communication.VehicleCommunication;
public class AutonomousCar {
    public static void main(String[] args) {
        Navigation navSystem = new Navigation();
        navSystem.calculatePath();

        VehicleCommunication comms = new VehicleCommunication();
        comms.sendSignal("Vehicle Approaching Intersection");
    }
}