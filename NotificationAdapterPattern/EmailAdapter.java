public class EmailAdapter implements NotificationService {
    private EmailClient emailClient;

    public EmailAdapter(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    @Override
    public void send(String recipient, String message) {
        // EmailClient 3 ta parametr talab qilgani uchun adapter ularni moslab beradi
        String subject = "Muhim xabarnoma";
        emailClient.sendEmail(recipient, subject, message);
    }
}