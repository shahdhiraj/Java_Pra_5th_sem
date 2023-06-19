import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    int roll;
    String name;
    int age;

Student(int roll, String name, int age){
    this.roll =roll;
    this.name =name;
    this.age =age;

}
void displaysDetails(){
    System.out.println("Roll = "+this.roll);
    System.out.println("name = "+this.name);
    System.out.println("age = "+this.age);
    
}
}
public class j_bufferedreader_student_info {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter roll :");
    int roll = Integer.parseInt(reader.readLine());

    System.out.println("Enter name :");
    String name = reader.readLine();

    System.out.println("Enter age :");
    int age = Integer.parseInt(reader.readLine());

    Student std = new Student(roll,name,age);
    std.displaysDetails();
  }  
}
