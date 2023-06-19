class Student{
    // private int roll =67; // this is not accessible 
    int roll =67; // default is accessible
}
public class b_Access_modifier {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll ="+s1.roll);
        
    }
}
