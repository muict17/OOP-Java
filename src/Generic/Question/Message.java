package Generic.Question;

public class Message<T> {
    private String name;
    private T content;
    Message(){
        this.name = "";
    }

    Message(String name, T content){
        this.name = name;
        this.content = content;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
