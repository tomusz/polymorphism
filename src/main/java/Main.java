import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        var notARobot = new Human(150);
        var john = new Human(13);
        var fishingBoat = new Boat(65);
        var submarine = new Boat(56);
        var redLorry = new Truck(90);
        var superTruck = new Truck(350) {
            @Override
            public void move() {
                System.out.println(String.format("Im super truck I can drive with %d %s",
                        this.getMaxSpeed(),
                        ConstantsProvider.getSpeedUnitOfMeasure()));
            }
        };

        ObjectValidation.isNotNull.accept(null);

        List<Mobile> mobileList = List.of(notARobot, fishingBoat, redLorry, john, submarine, superTruck);

        System.out.println("\nVehicle check");
        var randomObject = isItVehicle(mobileList);
        System.out.println("\nRandom object");
        randomObject.move();
        System.out.println("\nLambda execution");
        print(() -> System.out.println("I cannot run at all"));
        System.out.println("\nLambda execution with parameter");
        introduce((name) -> System.out.printf("Hello %s%n", name));
    }

    public static void print(Mobile mobile) {
        ObjectValidation.isNotNull.accept(mobile);
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        ObjectValidation.isNotNull.accept(talkable);
        talkable.sayHello(ConstantsProvider.getHumanName());
    }

    public static <T extends Mobile> Mobile isItVehicle(List<T> mobileObjects) {
        ObjectValidation.isNotEmpty.accept(Collections.singletonList(mobileObjects));
        mobileObjects.forEach(x -> System.out.println(ObjectValidation.isVehicle.apply(x)));
        return getRandomElementFromList(mobileObjects);
    }

    public static <T extends Mobile> Mobile getRandomElementFromList(List<T> mobileObjects) {
        return mobileObjects.get(ThreadLocalRandom.current().nextInt(0, mobileObjects.size() - 1));
    }
}