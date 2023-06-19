class Sum{
    protected int add(int a ,int b){
        return (a+b);
    }
}
public class c_access_demo {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        System.out.println("Sum = "+s1.add(23,67));
    }
}
