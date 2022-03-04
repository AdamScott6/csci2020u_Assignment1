/**
 * VehicleFactoryDemo
 * The VehicleFactoryDemo program implements the Factory design pattern, by creating a VehicleFactory which then
 * is called to create four Vehicle object, whose class is based on the parameter passed to the createVehicle method.
 *
 * The objects are then used to call their drive() methods which they have overridden, which output a String stating
 * their vehicle type and speed. The outputted Strings are found to be different for each object, are correspond to
 * the class type returned in the createVehicle() method - based on the String parameter passed to it.
 */

public class VehicleFactoryDemo {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.createVehicle("Car");
        vehicle1.drive();

        Vehicle vehicle2 = vehicleFactory.createVehicle("Bus");
        vehicle2.drive();

        Vehicle vehicle3 = vehicleFactory.createVehicle("Motorcycle");
        vehicle3.drive();

        Vehicle vehicle4 = vehicleFactory.createVehicle("Truck");
        vehicle4.drive();
    }
}
