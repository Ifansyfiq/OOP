package Modifiers;

public class Final {
    final double PI = 3.14;

    public static void main(String[] args) {
        Final myObj = new Final();
        //  myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.PI);
    }
}
