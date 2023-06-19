package input_Output;

import java.util.Scanner;

public class a_Scanner_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll:");
        int roll = sc.nextInt();
        System.out.println("Roll = "+roll);
        sc.close();
    }
}
