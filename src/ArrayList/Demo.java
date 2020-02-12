package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void printData(ArrayList data){
        for(int i = 0 ; i < data.size();i++){
            System.out.println(data.get(i));
        }
        System.out.println("\n");
    }
    public static void main (String[] args){
        ArrayList<String> myStrings = new ArrayList<String>();

        // add new elements
        myStrings.add("A");
        myStrings.add("B");

        printData(myStrings);
        // remove element by index
        myStrings.remove(0);
        printData(myStrings);

        // show element value by index
        System.out.println(myStrings.get(0));

        // size()
        myStrings.add("C");
        myStrings.add("D");
        System.out.println("After Add Size() = " + myStrings.size());

        myStrings.remove(0);
        myStrings.remove(1);
        System.out.println("After Remove Size() = " + myStrings.size());

        // create with Person Class

        ArrayList<Person> listPersons = new ArrayList<Person>();
        Person a = new Person("male",10);
        Person b = new Person("female", 10);
        listPersons.add(a);// index = 0
        listPersons.add(b);// index = 1

        System.out.println("Person A: Gender = " + listPersons.get(0).getGender() + ", Age = " + listPersons.get(0).getAge());
        System.out.println("Person B: Gender = " + listPersons.get(1).getGender() + ", Age = " + listPersons.get(1).getAge());

    }
}
