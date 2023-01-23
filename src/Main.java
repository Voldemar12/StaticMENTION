import staticmember.OtherClass;
import staticmember.SomeClass;

public class Main {
    public static void main(String[] args) {

        SomeClass.staticIntField = 10;
        SomeClass.staticStringField = "it's a static member";
        OtherClass otherClass1 = new OtherClass();

        System.out.println(SomeClass.staticIntField);
        System.out.println(SomeClass.staticStringField);
        //System.out.println(OtherClass.lastCreated);
        System.out.println(otherClass1.LastCreated);
    }
}