abstract class Collage {
     abstract int marks();
}
class Ram extends Collage{
    int marks(){
        return 67;
    }
}
class Sita extends Collage {
    int marks(){
        return  89;
    } 
}
public class c_abstract_class_method {
    public static void main(String[] args) {
        Collage c1;
        c1 =new Ram();
        System.out.println("Marks of Ram ="+c1.marks());
        c1 =new Sita();
        System.out.println("Marks of sita = "+c1.marks());
    }

}
