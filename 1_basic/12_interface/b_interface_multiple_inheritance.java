interface ITeacher{
    void teach();
}
interface Istudent{
    void learn();
}


public class b_interface_multiple_inheritance implements ITeacher,Istudent {
    public static void main(String[] args) {
        b_interface_multiple_inherintence obj = new b_interface_multiple_inherintence();
        obj.teach();
        obj.learn();
    }


@Override
public void learn(){
    System.out.println("Teacher is teaching .........");
}
@Override 
public void teach(){
    System.out.println("Student is learning from teacher..... ");
}

}
