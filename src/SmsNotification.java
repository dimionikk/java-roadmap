public class SmsNotification extends Notification implements Retryable {
    private final String text;
    public SmsNotification(String recipient,String text) {
        super(recipient);
        this.text = text;

    }

    @Override
    public String format() {
        return "[SMS] " + text;
    }

    @Override
    public int maxAttempts() {
        return 3;
    }


}