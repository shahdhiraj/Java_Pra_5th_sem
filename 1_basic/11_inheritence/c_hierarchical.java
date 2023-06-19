import javax.management.monitor.Monitor;
class Vehicle{
    public void accelerate(){
        System.out.println("I am moving towards my destination.");
    }
}
class Aerophane extends Vehicle{
    public void fly(){
        System.out.println("I am flying..");
    }
}
class Motorbike extends Vehicle{
    public void run(){
        System.out.println("I am running on road....");
    }
}
public class c_hierarchical {
    public static void main(String[] args) {
        Motorbike ducati = new Motorbike();
        ducati.accelerate();
        ducati.run();
    }
}
