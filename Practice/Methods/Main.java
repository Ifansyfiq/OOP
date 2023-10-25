package Methods;

public class Main {
    public void myMethod() { // public method
        System.out.println("Im a java developer");
    }

    static void myMethod2() { // static method
        System.out.println("wassup gais");
    }

    public static void main(String[] args) {
        myMethod2(); // call static method

        Main myObj = new Main(); // object
        myObj.myMethod(); // call method
        
        Other myObj2 = new Other(); // object
        myObj2.myMethod3(22); // call method

        Other2 myObj3 = new Other2(); // object
        myObj3.myMethod4("Terengganu"); // call method
    }
}
