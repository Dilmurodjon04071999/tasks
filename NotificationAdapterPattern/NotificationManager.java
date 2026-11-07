public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String recipient, String message) {
        // Hech qanday if/else yo'q, polimorfizm ishlaydi
        notificationService.send(recipient, message);
    }
}