package InnerClasses;

public class Main {
    public static void main(String[] args){
        OuterClass myClass = new OuterClass();
        OuterClass.InnerClasses myInnerClasses = myClass.new InnerClasses();
        System.out.println(myInnerClasses.y * myClass.x);
    }
}
