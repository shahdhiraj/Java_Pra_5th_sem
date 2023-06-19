import java.util.Scanner;

public class f_Calculatesi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter pricipal:");
        double p=sc.nextDouble();
        System.out.println("Enter time:");
        double t=sc.nextDouble();
        System.out.println("Enter rate:");
        double r=sc.nextDouble();
        double si=(p*t*r)/100;
        System.out.println("Simple Interest = Rs."+si);
        sc.close();

    }
}
