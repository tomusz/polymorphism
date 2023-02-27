public class Vehicle implements Mobile {

    private final int maxSpeed;

    public Vehicle(int maxSpeed) {
        ObjectValidation.isMobileObjectSpeedMoreThenZero.accept(maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void move() {
        System.out.println(String.format(VehicleConstatnsProvider.getVehicleGeneralMoveMsg(),
                maxSpeed,
                ConstantsProvider.getSpeedUnitOfMeasure()));
    }
}
