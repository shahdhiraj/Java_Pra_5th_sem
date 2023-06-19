package input_Output;

import java.util.Scanner;

public class c_Scanner_student_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll :");
        int roll = sc.nextInt();
        
        System.out.println("Enter your name :");
        String name = sc.next();
        

        System.out.println("Enter Faculty :");
        String faculty = sc.next();

        // System.out.println("Roll = " +roll);
        // System.out.println("Name = " +name);
        // System.out.println("Faculty = " +faculty);
        System.out.println( "Roll no = " +roll+  " Name = " +name+ "Faculty = "+faculty);
        sc.close();

    }
        
    }
