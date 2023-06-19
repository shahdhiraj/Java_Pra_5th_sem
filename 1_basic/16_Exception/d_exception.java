public class d_exception {
    public static void main(String[] args) {
        try {
            int result =20/0;
            System.out.println("The result is = "+result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception is handled "+e);
        }finally{
            System.out.println("Finally block is runnning with exception handled");
        }
    }
}
