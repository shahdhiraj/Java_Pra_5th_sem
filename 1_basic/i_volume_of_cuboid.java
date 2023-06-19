import java.util.Scanner;

public class i_volume_of_cuboid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a lenght :");
        int l =sc.nextInt();  
        System.out.println("Enter a breath:");
        int b =sc.nextInt();  
        System.out.println("Enter a height :");
        int h =sc.nextInt();
        int volume=l*b*h;
        System.out.println("The volume ="+volume);
        sc.close();  
    }
    
    
}
