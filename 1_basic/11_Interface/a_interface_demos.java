import java.text.NumberFormat.Style;

interface Teacher{
    void teach();
}
interface Student{
    void study();
}
class Collage{
    void manager(){
        System.out.println("It manages the student and the teacher");
    }
}
public class a_interface_demos extends Collage implements Teacher,Student{
    public static void main(String[] args) {
        a_interface_demos obj =new a_interface_demos();
        obj.teach();
        obj.study();
        obj.manager();

    }
    @Override 
    public void teach(){
        System.out.println("I am teaching .......");

    }
    @Override 
    public void study(){
        System.out.println("I am Studying .........");
    }
}
