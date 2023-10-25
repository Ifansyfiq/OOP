package Abstraction;

abstract class Animal {
    public abstract void Sound(); // Abstract method (does not have a body)
    
    public void bark() {
        System.out.println("Woof Woof");
    }
}

class Dog extends Animal {
    public void Sound() { // Subclass (inherit from Animal)
        System.out.println("The dog says: vroom vroom"); // the body of the abstract method is provided here
    }
}

public class Main {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.Sound();
        myDog.bark();
       
    }
}