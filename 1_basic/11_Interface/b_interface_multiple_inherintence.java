interface ITeacher{
    void teach();
}
interface IStudent{
    void learn();
}
public class b_interface_multiple_inherintence implements ITeacher,IStudent {
   public static void main(String[] args) {
    b_interface_multiple_inherintence obj = new b_interface_multiple_inherintence();
    obj.teach();
   } 
   @Override
   public void learn() {
    System.out.println("Teacher is teaching......");
    
   }

@Override
   public void teach() {
    
    System.out.println("Student is learning ........");
   }
}
