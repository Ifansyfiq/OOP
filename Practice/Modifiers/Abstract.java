package Modifiers;

abstract class Abstract {
    public String fname = "Irfan";
    public int age = 22;

    public abstract void study(); // abstract method
}

class Passed extends Abstract {
    public int x = 2024;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
