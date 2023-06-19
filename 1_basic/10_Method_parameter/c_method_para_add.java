import java.util.Scanner;


public class c_method_para_add {
    int add(int x, int y){
        return (x+y);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a :");
        int a =sc.nextInt();
        System.out.println("Enter b :");
        int b =sc.nextInt();

        c_method_para_add obj = new c_method_para_add();
        System.out.println("The Sum is "+obj.add(a,b));
        sc.close();
    }
}
