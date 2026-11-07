public class Main {
    public static void main(String[] args) {
        // 1. SMS orqali yuborish
        NotificationService smsService = new SmsNotificationService();
        NotificationManager smsManager = new NotificationManager(smsService);
        smsManager.sendNotification("+998901234567", "Salom, bu SMS xabar!");

        // 2. Telegram orqali yuborish (Adapter yordamida)
        TelegramClient telegramClient = new TelegramClient();
        NotificationService telegramAdapter = new TelegramAdapter(telegramClient);
        NotificationManager telegramManager = new NotificationManager(telegramAdapter);
        telegramManager.sendNotification("@dilmurod_dev", "Salom, bu Telegram xabar!");

        // 3. Email orqali yuborish (Adapter yordamida)
        EmailClient emailClient = new EmailClient();
        NotificationService emailAdapter = new EmailAdapter(emailClient);
        NotificationManager emailManager = new NotificationManager(emailAdapter);
        emailManager.sendNotification("dilmurod@gmail.com", "Salom, bu Email xabar!");
    }
}