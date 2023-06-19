package input_Output;

import java.io.Console;

public class E_Console_String {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Enter roll :");
        int num =Integer.parseInt(c.readLine());

        System.out.println("Enter your name :");
        String name = c.readLine();

        System.out.println("Enter Faculty :");
        String faculty = c.readLine();

        System.out.println("Roll = "+num);

        System.out.println("Name = "+name);

        System.out.println("Faculty = "+faculty);
        
    }
}
