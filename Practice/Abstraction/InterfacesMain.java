package Abstraction;

interface FirstInterface {
    public void myMethod(); // interface method (does not have a body)
}

interface SecondInterface {
    public void myOtherMethod(); // interface method (does not have a body)
}

class TestInterfaces implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("My name is");
    }
    public void myOtherMethod() {
        System.out.println("Irfan Syafiq.");
    }
}

class InterfaceMain {
    public static void main(String[] args){
        TestInterfaces myObj = new TestInterfaces();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}