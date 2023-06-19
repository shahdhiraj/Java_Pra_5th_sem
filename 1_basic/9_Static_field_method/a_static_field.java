class Student{
    int roll;
    String name;
    static String clz =  "Sanothimi";
    void input(int x,String n){
        roll = r;
        name =n;
        void output(){
            System.out.println("The rolll is "+roll);
            System.out.println("The name is "+n);
            System.out.println("The collage is "+roll);
    
        }

    }


}

public class a_static_field {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input(12,"Ram");
        Student s2 = new Student();
        s2.input(13,"Aman");
        Student s3 = new Student();
        s3.input(14,"Gita");
        Student s4 = new Student();
        s4.input(15,"Radha");
        Student s5 = new Student();
        s5.input(16,"Mohan");
        Student s6 = new Student();
        s6.input(12,"Sima");

        s1.output();
        System.out.println();
        s2.output();
        System.out.println();
        s3.output();
        System.out.println();
        s4.output();
        System.out.println();
        s5.output();
        System.out.println();
        s6.output();
        System.out.println();

    }
    
}
