import java.util.Scanner;
class calc{
    static int sum(int a,int b){
        return (a+b);
    }
}

public class f_method_para_outside {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // custom values integer to be summed up
        int x =45, y=87;
        /*
         * calling the start method of above class and
         * storing sum in interger variable
         */
        int s = calc.sum(x,y);
        System.out.println("The Sum is "+s);
        sc.close();
    }
}
