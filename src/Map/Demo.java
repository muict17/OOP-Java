package Map;

import java.util.HashMap;
import java.util.Map;

public class Demo {

    public static void printData(Map data){
        for(Object key: data.keySet()){
            System.out.println(data.get(key));
        }

        System.out.println("\n");
    }
    public static void main(String[] args){
        Map<String, String> myMap = new HashMap<String, String>();

        // add new element with key and value
        myMap.put("A","Tar");
        myMap.put("B","Palm");
        myMap.put("C","Beam");
        myMap.put("D","Plan");

        // get element
        System.out.println("Key A: Value = " + myMap.get("A"));

        // remove by key
        printData(myMap);
        myMap.remove("B");
        printData(myMap);
    }
}
