public class MoneyDemo  {
    public static void main(String[] args) {
        Money a = new Money(500, "UAH");
        Money b = new Money(500, "UAH");
        Money c = new Money(250, "UAH");

        System.out.println(a);

        System.out.println(a.cents());

        System.out.println(a.equals(b));

        System.out.println(a==b);

        System.out.println(a.plus(c));

        System.out.println(a);
    }
}