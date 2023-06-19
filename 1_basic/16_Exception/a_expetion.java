public class a_expetion {
    public static void main(String[] args) {
        int a=0,b=6,result=0;
        try {
            result =a/b;
            System.out.println("The Result is = "+result);
            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
