package Inheritence;

public class Oyen extends Cat {
    private int leg = 3;

    public static void main(String[] args) {

        Oyen myCat = new Oyen();

        myCat.sound();

        System.out.println("My cat color is" + " " + myCat.color + "it have" + " " + myCat.leg);
    }
}
