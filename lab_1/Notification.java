public class Notification {
    private int id;
    private String dateCreate;
    private String recipient;

    public Notification(int notificationId, String creationDate, String recipientName) {
        setId(notificationId);
        setDateCreate(creationDate);
        setRecipient(recipientName);
    }

    public void send() {
        System.out.println("Notification #" + id + " has been sent to " + recipient + ".");
    }

    public void markAsRead() {
        System.out.println("Notification #" + id + " has been marked as read.");
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Created: " + dateCreate);
        System.out.println("Recipient: " + recipient);
    }

    public int getId() { return id; }
    public String getDateCreate() { return dateCreate; }
    public String getRecipient() { return recipient; }

    public void setId(int newId) {
        if (newId <= 0) {
            System.out.println("Error: ID must be positive.");
            return;
        }
        id = newId;
    }

    public void setDateCreate(String newDateCreate) {
        if (newDateCreate == null || newDateCreate.equals("")) {
            System.out.println("Error: Date cannot be empty.");
            return;
        }
        dateCreate = newDateCreate;
    }

    public void setRecipient(String newRecipient) {
        if (newRecipient == null || newRecipient.equals("")) {
            System.out.println("Error: Recipient cannot be empty.");
            return;
        }
        recipient = newRecipient;
    }
}

