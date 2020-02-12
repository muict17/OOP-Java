package ArrayList;

public class Person {
    private String gender;
    private int age;

    Person(String gender, int age){
        this.age = age;
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
