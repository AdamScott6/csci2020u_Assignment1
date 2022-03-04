public class VehicleFactory {

    /**
     * Returns a Vehicle-implementing class based on the String parameter.
     *
     * @param  vehicleType  a String indicating the kind of Vehicle. Corresponds to a Vehicle-implementing class.
     * @return              a class which implements the Vehicle interface. Based on the vehicleType param.
     */
    public Vehicle createVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "Bus" -> new Bus();
            case "Car" -> new Car();
            case "Motorcycle" -> new Motorcycle();
            case "Truck" -> new Truck();
            default -> null;
        };
    }
}
