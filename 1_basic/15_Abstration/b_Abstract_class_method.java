abstract class Dad{
    abstract void hello();
}
class Son extends Dad{
    void hello(){
        System.out.println("Hello From Son");
    }
}
class Daughter extends Dad{
    void hello(){
        System.out.println("Hi From Daughter ");
    }
}
public class b_Abstract_class_method {
    public static void main(String[] args) {
        Dad ch1 = new Son();
        // Dad ch2 = new Daughter();
        ch1.hello();
        // ch2.hello();
    }
}
