package Polymorphism;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal fox = new Fox();
        animal.makeSound();
        dog.makeSound();
        fox.makeSound();
    }
}
