interface ITeacher{
    void task();
}
class Student implements ITeacher{
    public void task(){
        System.out.println("Student is learning ......");
    }
}
public class a_interface_abstraction {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.task();

    }
}
