abstract class Teacher {
    public abstract void teach();
}

public class d_abstract_class extends  Teacher {
    public static void main(String[] args) {
        d_abstract_class obj = new d_abstract_class();
        obj.teach();
    }
    /**
     * 
     */
    @Override
    public void teach(){
        System.out.println("Teacher is teaching ..........");
    }
}
