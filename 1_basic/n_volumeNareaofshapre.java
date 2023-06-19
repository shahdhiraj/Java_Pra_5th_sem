import java.util.Scanner;

public class n_volumeNareaofshapre {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a radius :");
        double r =sc.nextDouble();
        double vol =(4/3)*3.14*(Math.pow(r,3));
        double area =4*3.14*(Math.pow(r,2));
        System.out.println("Area ="+area);
        System.out.println("peri ="+vol);
        sc.close();
        }
        }
