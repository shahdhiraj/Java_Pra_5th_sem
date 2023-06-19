import java.util.Scanner;

public class e_areaOFrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int area=0;
        System.out.println("enter  a lenght:");
        int l=sc.nextInt();
        System.out.println("enter  a breath:");
        int b=sc.nextInt();
        area=l*b;
        System.out.println("Area = " + area);
        sc.close();
        }
}
