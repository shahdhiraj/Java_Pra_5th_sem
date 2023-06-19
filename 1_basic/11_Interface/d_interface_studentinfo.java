import java.util.Scanner;

interface IStudent{
    void getdata();
    void showdata();
}
public class d_interface_studentinfo implements IStudent {
    int roll;
    String name;
    
    public static void main(String[] args) {
        IStudent st1 = new d_interface_studentinfo();
        st1.getdata();
        st1.showdata();

}

    @Override
    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number :");
        roll = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
        sc.close();
    }

    @Override
    public void showdata() {
        System.out.println("Roll = " +roll);
        System.out.println("Name = " +name);
    }
}
