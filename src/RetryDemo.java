public class RetryDemo {
    public static void main(String[] args) {
        Retryable[] items = {
                new SmsNotification("+380991234567", "Hello!"),
                new PaymentRequest(15000)
        };
        for (Retryable item : items) {
            System.out.println(item.retryInfo());
        }
    }
}