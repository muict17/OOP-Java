package Generic;

public class Employee<T> {
    private String name;
    private String lastName;
    private T info;
    // T = Sale, T = Account

    Employee(String name, String lastName, T info){
        this.lastName = lastName;
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
