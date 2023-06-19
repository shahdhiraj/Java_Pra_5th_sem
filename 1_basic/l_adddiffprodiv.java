import java.util.Scanner;

public class l_adddiffprodiv {
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println(" Enter a:");
int a =sc.nextInt();
System.out.println(" Enter b:");
int b =sc.nextInt();
int add =a+b;
int diff =a-b;
int pro =a*b;
int div =a/b;
System.out.println("The Sum ="+add);
System.out.println("The diff ="+diff);
System.out.println("The pro ="+pro);
System.out.println("The div ="+div);
sc.close();
}
}