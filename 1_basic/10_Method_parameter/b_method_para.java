public class b_method_para{
    String name;
    void input(String n){
        name = n;
    }
    void display(){
        System.out.println("Your name is " +name);
    }

public static void main(String[] args){
b_method_para obj = new b_method_para();
obj.input("Ram");
obj.display();
}
}