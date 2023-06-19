import java.util.Scanner;

public class p_areaoftriangle {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a base :");
        double b =sc.nextDouble();
        System.out.println("Enter a height :");
        double h =sc.nextDouble();
        double area=(double)0.5*b*h;
    
        System.out.println("The triangle ="+area);

        sc.close();
        } 
}
