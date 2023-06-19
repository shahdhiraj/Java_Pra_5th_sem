public class f_throws_demo {
    public int divTest(int a,int b)throws ArithmeticException{
        int result = a/b;
        return result ;
    }
    public static void main(String[] args) {
        f_throws_demo obj = new f_throws_demo();
        try {
            System.out.println(obj.divTest(20,10));
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Your cannot divide a non zero number by a zero ."+e);
        }
    }
}
