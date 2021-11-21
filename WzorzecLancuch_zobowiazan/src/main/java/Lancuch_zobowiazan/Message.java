package Lancuch_zobowiazan;

public class Message {
    private String message;
    private String type;

    public Message() {
    }

    public Message(String type) {
        this.type = type;
    }

    public Message(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    
}
