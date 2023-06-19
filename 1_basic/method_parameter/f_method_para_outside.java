package method_parameter;
class calc{
    static int sum(int a,int b){
        return (a+b);
    }
}

public class f_method_para_outside {
    public static void main(String[] args) {
    int x=67,y=89;
    int s = calc.sum(x,y);
    System.out.println("The sum is ="+s);
    }
}