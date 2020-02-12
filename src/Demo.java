public class Demo {
    public static void main(String[] args){
        int[] array = {1,3,4,5,6};
        String[] stringArray = {"A","B","C"};
        float[] a = new float[30];
        // repetition
//        for(int i = 0 ; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//
//        // iteration
//        for(int element: array){
//            System.out.println(element);
//        }
//
//        for(String el: stringArray){
//            System.out.println(el);
//        }

        Student[] students = new Student[10];
        Student first = new Student("name","last",10);
        students[0] = first;

        System.out.println("Name:" + students[0].name);
        System.out.println("Last name: " + students[0].lastname);
    }
}
