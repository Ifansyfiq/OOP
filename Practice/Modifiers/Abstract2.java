package Modifiers;

public class Abstract2 {
    public static void main(String[] args){
        Passed myObj = new Passed(); // Create a Passed object

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.x);
        myObj.study(); // Call abstract method
    }
}
