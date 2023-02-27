public class Human implements Mobile, Talkable {

    private final int maxSpeed;

    public Human(int maxSpeed) {
        ObjectValidation.isMobileObjectSpeedMoreThenZero.accept(maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println(String.format(HumanConstantsProvider.getHumanMoveMsg(),
                ObjectNameProvider.getName(this),
                maxSpeed,
                ConstantsProvider.getSpeedUnitOfMeasure()));
    }

    @Override
    public void sayHello(String name) {
        System.out.println(String.format(HumanConstantsProvider.getHumanIntroductionMsg(), name));
    }
}