public class TelegramAdapter implements NotificationService {
    private TelegramClient telegramClient;

    public TelegramAdapter(TelegramClient telegramClient) {
        this.telegramClient = telegramClient;
    }

    @Override
    public void send(String recipient, String message) {
        // NotificationService dagi send metodi metodini TelegramClient dagi sendTelegramMessage ga ulaymiz
        telegramClient.sendTelegramMessage(recipient, message);
    }
}