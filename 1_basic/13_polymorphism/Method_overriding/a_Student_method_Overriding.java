package polymorphism.Method_overriding;
class Teacher{
    public void task(){
        System.out.println("I am a teacher and teaching");

    }
}
public class a_Student_method_Overriding extends Teacher{
    @Override
    public void task(){
        System.out.println("I am student and learning");
    }
    public static void main(String[] args) {
        a_Student_method_Overriding obj =new a_Student_method_Overriding();
        Teacher t1 =new Teacher();
        Teacher t2 =new a_Student_method_Overriding();
        t1.task();
        t2.task();
        obj.task();
    }
}
