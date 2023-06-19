package input_Output;

import java.io.Console;

public class d_Console_integer {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter a roll :");
        int num = Integer.parseInt(c.readLine());
        System.out.println("Number =" +num);
    }
}
