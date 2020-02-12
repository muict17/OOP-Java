package Generic.Question;

public class NormalContent {
    private String receiverName;
    private String message;

    NormalContent(String receiverName, String message){
        this.receiverName = receiverName;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}
