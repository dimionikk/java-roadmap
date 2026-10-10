public class WrapperTasks {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 1000;
        Integer d = 1000;

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(d));

        Integer missing = null;
        int value = missing;
    }
}