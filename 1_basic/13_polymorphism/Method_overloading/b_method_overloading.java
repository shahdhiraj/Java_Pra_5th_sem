package polymorphism.Method_overloading;
class Sum{
    public int sum(int a, int b) {
        return a+b;
    }
    public int sum(int a, int b, int c) {
        return (a+b+c);
    }
    public double sum(double a, double b) {
        return (a+b);
    }
}
public class b_method_overloading {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(45,20,60));
        System.out.println(s.sum(4.5,4.0));
    }
}
