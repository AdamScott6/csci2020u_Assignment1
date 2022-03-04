public class Truck implements Vehicle {

    /**
     * Overrides the drive() method in the vehicle interface
     * Outputs a string stating the class of vehicle and its speed.
     */
    @Override
    public void drive() {
        System.out.println("The truck is driving at 60kph.");
    }
}
