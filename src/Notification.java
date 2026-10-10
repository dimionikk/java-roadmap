public abstract class Notification {
    private final String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }
    public String getRecipient() {
        return recipient;
    }
    public abstract String format();
    public void send(){
        System.out.println("To " + recipient + ": " + format());
    }
}