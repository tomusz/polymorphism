public class HumanConstantsProvider {
    private static final String HUMAN_MOVE_MSG = "I'm %s I can run with %d %s";
    private static final String HUMAN_INTRODUCTION_MSG = "Hello, nice to meet you %s";

    public static String getHumanMoveMsg() {
        return HUMAN_MOVE_MSG;
    }

    public static String getHumanIntroductionMsg() {
        return HUMAN_INTRODUCTION_MSG;
    }
}
