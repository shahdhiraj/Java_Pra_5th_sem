import java.util.Scanner;

public class d_method_para_max {
    int maxnum(int x,int y){
        int max;
        if(x>y){
            max = x;
        }
        else{
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
        d_method_para_max obj =new d_method_para_max();
        int c = obj.maxnum(a,b);
        System.out.println("The maximum value is ="+c);
        sc.close();

    }
        
    }
