package input_Output;

import java.util.Scanner;

public class b_scannner_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name =sc.nextLine();
        System.out.println(" Hello " +name);
        sc.close();
    }
}
