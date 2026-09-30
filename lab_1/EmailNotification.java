public class EmailNotification extends TextNotification {
    private String emailSubject;
    private String senderAddress;
    private boolean hasAttachment;

    public EmailNotification(int notificationId, String creationDate, String recipientName,String messageText, String messageTopic,String subject, String sender, boolean attachment) {
        super(notificationId, creationDate, recipientName, messageText, messageTopic);
        setEmailSubject(subject);
        setSenderAddress(sender);
        hasAttachment = attachment;
    }

    public void attachFile(String fileName) {
        if (fileName == null || fileName.equals("")) {
            System.out.println("Error: File name cannot be empty.");
            return;
        }
        hasAttachment = true;
        System.out.println("File \"" + fileName + "\" attached to email #" + getId() + ".");
    }

    public void validateEmail() {
        if (getRecipient().contains("@")) {
            System.out.println("Recipient email is valid.");
        } else {
            System.out.println("Recipient email is invalid!");
        }
    }

    public void showSenderInfo() {
        System.out.println("Sender: " + senderAddress);
        System.out.println("Subject: " + emailSubject);
    }

    @Override
    public void send() {
        System.out.println("Email \"" + emailSubject + "\" sent from " + senderAddress
                + " to " + getRecipient()
                + (hasAttachment ? " with attachment." : " without attachment."));
    }

    public String getEmailSubject() { return emailSubject; }
    public String getSenderAddress() { return senderAddress; }
    public boolean isHasAttachment() { return hasAttachment; }

    public void setEmailSubject(String newSubject) {
        if (newSubject == null || newSubject.equals("")) {
            System.out.println("Error: Subject cannot be empty.");
            return;
        }
        emailSubject = newSubject;
    }

    public void setSenderAddress(String newSender) {
        if (newSender == null || newSender.equals("")) {
            System.out.println("Error: Sender cannot be empty.");
            return;
        }
        senderAddress = newSender;
    }
}
