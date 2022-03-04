public class Car implements Vehicle{

    /**
     * Overrides the drive() method in the vehicle interface
     * Outputs a string stating the class of vehicle and its speed.
     */
    @Override
    public void drive() {
        System.out.println("The car is driving at 80kph.");
    }
}
