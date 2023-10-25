package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Second myObj = new Second();
        myObj.setName("Irfan"); // set the value of the name variable to "John"
        System.out.println(myObj.getName());

        // System.out.println(myObj.name); // error
    }
}
