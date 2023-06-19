import java.util.Scanner;

public class j_volumeofcube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter of Lenght :" );
        int l=sc.nextInt();
        int volume = (int)(Math.pow(l,3));
        System.out.println("The Volume ="+volume);
        sc.close();
        }
}
