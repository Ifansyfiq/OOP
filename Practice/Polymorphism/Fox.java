package Polymorphism;

public class Fox extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Ring-ding-ding-ding-dingeringeding!\r\n" + //
                            "Gering-ding-ding-ding-dingeringeding!\r\n" + //
                            "Gering-ding-ding-ding-dingeringeding");
    }
}
