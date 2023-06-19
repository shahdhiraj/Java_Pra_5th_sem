//abstract parent class
abstract class Teacher{
    // abstract method
    public abstract void teach();
}

//a_abstract_class_one class Extends Teacher class
public class a_abstract_class extends Teacher {
    public void teach(){
        System.out.println("Teaching .....");
    }
  public static void main(String[] args) {
    Teacher obj = new a_abstract_class();
    obj.teach();
  }
public void display() {
}  
}
