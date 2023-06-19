import java.util.Scanner;

public class q_number_swap {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a  :");
        double a =sc.nextDouble();
        System.out.println("Enter b  :");
        double b =sc.nextDouble();
        double temp =a;
        a=b;
        b=temp;
        System.out.println("The value is ="+a);
        System.out.println("The value is ="+b);

        sc.close();
        }
}
