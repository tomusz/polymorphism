public class VehicleConstatnsProvider {
    private static final String VEHICLE_GENERAL_MOVE_MSG = "My max speed is %d %s";
    private static final String VEHICLE_WITH_VEHICLE_NAME_MOVE_MSG = "I'm %s, my max speed is %d %s";
    private static final String VEHICLE_CHECK_TRUE_MSG = "It is a vehicle with max speed  %d %s";
    private static final String VEHICLE_CHECK_FALSE_MSG = "It is not a vehicle";

    public static String getVehicleGeneralMoveMsg() {
        return VEHICLE_GENERAL_MOVE_MSG;
    }

    public static String getVehicleWithVehicleNameMoveMsg() {
        return VEHICLE_WITH_VEHICLE_NAME_MOVE_MSG;
    }

    public static String getVehicleCheckTrueMsg() {
        return VEHICLE_CHECK_TRUE_MSG;
    }

    public static String getVehicleCheckFalseMsg() {
        return VEHICLE_CHECK_FALSE_MSG;
    }
}
