import java.util.Scanner;

public class m_areaNperimeteraroom {

    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a lenght :");
    int l =sc.nextInt();
    System.out.println("Enter a lenght :");
    int b =sc.nextInt();
    int area =l*b;
    int peri =2*(l+b);
    System.out.println("Area ="+area);
    System.out.println("peri ="+peri);
    sc.close();
    }
    }

