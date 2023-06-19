class Teacher {
    public void task(){
        System.out.println("I am a teacher  and teaching");
    }
}

public class c_final_method extends Teacher{
    @Override
    public void task(){
        System.out.println("I am student and learning.");
    }
    public static void main(String[] args) {
        c_final_method obj =new c_final_method();
        Teacher t1 =new Teacher();
        Teacher t2 =new c_final_method();
        t1.task();
        t2.task();
        obj.task();
    }
}
