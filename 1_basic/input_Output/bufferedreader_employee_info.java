import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//uses of Buffferedreader Program sir formate ma
class Employee{
    int Eid;
    String name;
    int salary;
    Employee(int Eid,String name,int salary){
        this.Eid =Eid;
        this.name =name;
        this.salary =salary;
    }
    void displaysDetails(){
        System.out.println("Employee Id =" +this.Eid);
        System.out.println("Employee Name = " +this.name);
        System.out.println("Employee Salary = " +this.salary);

    }
}

public class bufferedreader_employee_info {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Eid :");
        int id = Integer.parseInt(reader.readLine());

        System.out.println("Enter name :");
        String name = (reader.readLine());

        System.out.println("Enter salary :");
        int salary = Integer.parseInt(reader.readLine());

        Employee Emp = new Employee(id,name,salary);
        Emp.displaysDetails();

    }
}
