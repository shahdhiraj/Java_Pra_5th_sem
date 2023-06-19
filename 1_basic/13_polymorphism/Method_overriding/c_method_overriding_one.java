package polymorphism.Method_overriding;
class Human{
    public void walk() {
        System.out.println("Human Walks");
    }
}
public class c_method_overriding_one extends Human {
    public void walk() {
        System.out.println("Boys walks");
    }
    public static void main(String[] args) {
        /*
         * Refrence is of Human type and object is 
         * Boys type
         */
        Human obj = new c_method_overriding_one();
        /*
         * Refrence is of Human type and object is 
         * of Human type
         */
        Human obj2 =new Human();
        obj.walk();
        obj2.walk();
    }
}
