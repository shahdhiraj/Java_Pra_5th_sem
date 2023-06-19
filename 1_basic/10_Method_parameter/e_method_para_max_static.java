import java.util.Scanner;

public class e_method_para_max_static {
    static int maximum(int x,int y){
        int max;
        if (x>y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();

        int c = maximum(a,b);
        System.out.println("The maximum is = "+c);
        sc.close();

    }
}
