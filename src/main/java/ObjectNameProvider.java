public class ObjectNameProvider {

    public static <T> String getName(T object) {
        return object.getClass().getName();
    }
}
