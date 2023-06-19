public class e_thow_demo {
    public void voterCheck(int age){
        if (age <18){
            throw new ArithmeticException("You are not eligible to cast your vote.");
        }else{
            System.out.println("Your are eligible to cast your vote.");
        }
    }
    public static void main(String[] args) {
        e_thow_demo obj = new e_thow_demo();
        obj.voterCheck(19);
    }
}
