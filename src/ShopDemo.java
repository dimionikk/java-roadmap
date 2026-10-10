public class ShopDemo {
    public static void main(String[] args) {
        Product item1 = new Product("phone1", 100, 3);
        Product item2 = new Product("phone2", 200);

        System.out.println(item2.getQuantity());
        item2.addStock(5);
        System.out.println(item2.getQuantity());
        System.out.println(item2.sell(10));
        System.out.println(item2.getQuantity());
        System.out.println(item1.sell(1));
        System.out.println(item1.getQuantity());
        System.out.println(Product.getCreated());

    }
}