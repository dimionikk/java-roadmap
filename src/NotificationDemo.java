public class NotificationDemo {
    public static void main(String[] args) {
        Notification[] notifications = {
                new EmailNotification("test@gmail.com", "Meeting tomorrow"),
                new SmsNotification("+380991234567", "Hello"),
                new EmailNotification("admin@gmail.com", "New message")
        };
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}