public class c_exception {
    public static void main(String[] args) {
        try {
            int a[] =null;
            System.out.println(a[9]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Exception handled");
        }
        catch(Exception e){
            System.out.println("Exception handle bhayo..");

        }
    }
}
