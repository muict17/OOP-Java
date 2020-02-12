package Generic;

public class Account {
    private int work;
    private String position;

    Account(int work, String position){
        this.work = work;
        this.position = position;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
