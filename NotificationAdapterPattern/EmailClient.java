public class EmailClient {
    public void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Email yuborildi (" + emailAddress + "): Mavzu -> [" + subject + "], Xabar -> " + body);
    }
}