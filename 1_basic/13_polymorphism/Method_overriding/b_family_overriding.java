package polymorphism.Method_overriding;
class GrandPa{
    public void Greetings() {
        System.out.println("Hello greeting from grandpa");
    }
}
class Dad extends GrandPa{
    public void Greetings() {
        System.out.println("Hello greeting from dad");
    }
}
class child extends Dad{
    public void Greetings(){
        System.out.println("Hello greeting from child");
        
    }
}
public class b_family_overriding {
    public static void main(String[] args) {
        GrandPa a,b,c;
        a =new GrandPa();
        b = new Dad();
        c = new child();
        a.Greetings();
        b.Greetings();
        c.Greetings();

    }
}
