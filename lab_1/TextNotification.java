
public class TextNotification extends Notification {
    private String text;
    private String topic;
    private int textLength;

    public TextNotification(int notificationId, String creationDate, String recipientName,String messageText, String messageTopic) {
        super(notificationId, creationDate, recipientName);
        setText(messageText);
        setTopic(messageTopic);
    }

    public void format() {
        System.out.println("Text notification \"" + topic + "\" has been formatted.");
    }

    public void preview() {
        if (text.length() > 30) {
            System.out.println("Preview: " + text.substring(0, 30) + "...");
        } else {
            System.out.println("Preview: " + text);
        }
    }

    public void countWords() {
        String[] words = text.split(" ");
        System.out.println("Word count: " + words.length);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Topic: " + topic);
        System.out.println("Text length: " + textLength);
    }

    public String getText() { return text; }
    public String getTopic() { return topic; }
    public int getTextLength() { return textLength; }

    public void setText(String newText) {
        if (newText == null || newText.equals("")) {
            System.out.println("Error: Text cannot be empty.");
            return;
        }
        text = newText;
        textLength = newText.length();   
    }

    public void setTopic(String newTopic) {
        if (newTopic == null || newTopic.equals("")) {
            System.out.println("Error: Topic cannot be empty.");
            return;
        }
        topic = newTopic;
    }

}
