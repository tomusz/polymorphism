public class ConstantsMsgProvider {

    private static final String SPEED_SHOULD_NOT_BE_LESS_THEN_ONE_MSG = "Speed should not be less then one";
    private static final String OBJECT_SHOULD_NOT_BE_NULL_MSG = "Object was not provided correctly";
    private static final String LIST_SHOULD_NOT_BE_EMPTY_MSG = "List should not be empty";

    public static String getSpeedShouldNotBeLessThenOneMsg() {
        return SPEED_SHOULD_NOT_BE_LESS_THEN_ONE_MSG;
    }

    public static String getObjectShouldNotBeNullMsg() {
        return OBJECT_SHOULD_NOT_BE_NULL_MSG;
    }

    public static String getListShouldNotBeEmptyMsg() {
        return LIST_SHOULD_NOT_BE_EMPTY_MSG;
    }
}
