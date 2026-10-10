public class EmailNotification extends Notification {
    private final String subject;
    public EmailNotification(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }
    @Override
    public String format() {
        return "[EMAIL] " + subject;
    }

}