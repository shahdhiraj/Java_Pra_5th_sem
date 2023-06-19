import java.io.Console;

public class f_console_Student_info {
  public static void main(String[] args) {
    Console c = System.console();
    System.out.println("Enter roll :");
    int roll = Integer.parseInt(c.readLine());

    System.out.println("Enter name :");
    String name =c.readLine();

    System.out.println("Enter faculty:");
    String faculty = c.readLine();
    System.out.println();// empty space uses 
    

    System.out.println("Roll = "+roll);
    System.out.println("name = "+name);
    System.out.println("faculty = "+faculty);
  } 
}
