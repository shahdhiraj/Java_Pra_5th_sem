class GrandFather {
    public void grand(){
        System.out.println("I am Grandfather.");
    }
}
class Father extends GrandFather{
    public void dad(){
        System.out.println("I am Dad.");

    }
}
class Child extends Father{
    public Void baby(){
        System.out.println("I am baby.");
        return null;
    }
}
public class b_multilevel {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.baby();
        c1.dad();
        c1.grand();
    }
}
