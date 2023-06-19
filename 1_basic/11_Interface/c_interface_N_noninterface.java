interface ITeacher{
    void  teach();
}
interface IStudent{
    void learn();
}
class Collage{
    void manage(){
        System.out.println("It message teachers and students");
    }
}
public class c_interface_N_noninterface extends Collage implements ITeacher,IStudent{
    public static void main(String[] args) {
        c_interface_N_noninterface obj = new c_interface_N_noninterface();
        obj.teach();
        obj.learn();
        obj.manage();
    }
    @Override
    public void learn() {
        System.out.println("Student is learning.........");
    }
    @Override
    public void teach() {
        System.out.println("Teacher is teaching to students......");
    }
}
