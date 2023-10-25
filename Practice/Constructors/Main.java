package Constructors;

public class Main {
    int x; // Create a class attribute
    String myName;

    // Create a class constructor for the Main class
    public Main(int y, String name) {
        x = y; // Set the initial value for the class attribute x
        myName = name;
    }

    public static void main(String[] args) {
        Main myObj = new Main(22,"Irfan"); // Create an object of class Main (This will call the constructor)
        System.out.println("My name is"+ " "  + myObj.myName + " " + myObj.x); // Print the value of x
    }
}
