package ClassesAndObjects;
public class Main{ // Main class
    int x = 5; // Create a class attribute
    public static void main(String[] args){ // Main method
        Second myObj2 = new Second(); // Create an object of class Second (This will call the constructor)
        Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print out "Hello World!"
        System.out.println(myObj2.x); // Print out "Hello World!"

    }
}