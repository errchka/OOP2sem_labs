public class Main {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification(
                101, "2025-01-15", "user@mail.com",
                "Hello world, this is a test message.",
                "Greeting",
                "Test Subject",
                "admin@service.com",
                false
        );

        email.printInfo();
        email.preview();
        email.countWords();
        email.validateEmail();
        email.attachFile("report.pdf");
        email.send();

        System.out.println("Check out");
        email.setId(-5);             
        email.setTopic("");            
        email.setEmailSubject(null);   

        System.out.println("ID remained unchanged: " + email.getId());
    }
}