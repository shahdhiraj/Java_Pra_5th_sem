package polymorphism.Method_overloading;
class Num{
    void output(int a){
        System.out.println("a =" +a);
    }
    void output(int a,int b){
        System.out.println("a="+a+"and b="+b);
    }
    double output(double a){
        System.out.println("double a="+a);
        return (a*a);
    }
}

public class a_calculator_method_overloading {
    

    public static void main(String[] args) {

        Num n1 = new Num();
        double result;
        n1.output(23);
        n1.output(23,34);
        result = n1.output(23.4);
        System.out.println("The Result ="+result);
    }
}
