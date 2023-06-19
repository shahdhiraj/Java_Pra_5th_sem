class Super{
    public void hi(){
        System.out.println("I am super class");
    }
}
class Sub extends Super{
    public void hello(){
        System.out.println("I am sub class");

    }
}
public class b_final_class {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        s1.hello();
        s1.hi();
    }
}
