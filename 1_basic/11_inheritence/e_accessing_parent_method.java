class Teacher{
    public void study(){
        System.out.println("Teacher is Teaching ...");
    }
}
class Student extends Teacher{
    public void study(){
        System.out.println("Student is studying....");
    }
}

public class e_accessing_parent_method {
   public static void main(String[] args) {
    Student s1 = new Student();
    s1.study();
   } 
}
