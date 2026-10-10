public class InitOrder {
    private static int loaded = log("static field");
    private int value = log("instance field");

    public InitOrder() {
        log("constructor");
    }

    private static int log(String message) {
        System.out.println(message);
        return 0;
    }

    public static void main(String[] args) {
        log("main start");
        new InitOrder();
        new InitOrder();
    }
}