package Classes;

public class Main {
    int x = 5;
    int y = 3;

    public static void main(String[] args) {
        Main myObj = new Main();
        Main myobj2 = new Main();
        myObj.x = 102; //overide object value
        System.out.println(myObj.x); 
        System.out.println(myobj2.x); //default value
        System.out.println("x*y:" + myObj.y * myObj.x); //default value
    }
}
