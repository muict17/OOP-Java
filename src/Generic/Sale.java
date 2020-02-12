package Generic;

public class Sale {
    private String[] hobbies;
    private double salary;

    Sale(String[] hobbies, double salary){
        this.hobbies = hobbies;
        this.salary = salary;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
