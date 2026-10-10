public class Product {
    private static int created;

    private final String name;
    private long priceInCents;
    private int quantity;

    public Product(String name, long priceInCents, int quantity) {
        this.name = name;
        this.priceInCents = priceInCents;
        this.quantity = quantity;
        created++;
    }

    public Product(String name, long priceInCents) {
        this(name, priceInCents, 0);
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    public boolean sell(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }

    public String getName() {
        return name;
    }

    public long getPriceInCents() {
        return priceInCents;
    }

    public int getQuantity() {
        return quantity;
    }


    public static int getCreated() {
        return created;
    }
}



