public class b_exception {
    int divide(int a, int b)throws ArithmeticException{
        int c =a/b;
        return c;
    }
    public static void main(String[] args) {
        b_exception t1 = new b_exception();
        try {
            System.out.println(t1.divide(3,7));
        } catch (Exception e) {
            System.out.println("Cannot Divide by zero ");                
        }
    }
}
