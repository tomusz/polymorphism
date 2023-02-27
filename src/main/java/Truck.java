public class Truck extends Vehicle {
    public Truck(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(String.format(VehicleConstatnsProvider.getVehicleWithVehicleNameMoveMsg(),
                getMaxSpeed(),
                ConstantsProvider.getSpeedUnitOfMeasure()));
    }
}
