import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class k_file_writer {
    public static void main(String[] args) throws IOException  {
         /*Scanner sc= new Scanner(System.in);
        System.out.println("write something :");
        String w = sc.nextLine();
        */
        String str ="Hello Student,how are you?";
        FileWriter fw = new FileWriter("d:/radha.txt");

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
            
        }
        System.out.println("Data written Success.");
        fw.close();

    }
}
