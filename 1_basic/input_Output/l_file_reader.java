import java.io.FileReader;
import java.io.IOException;

public class l_file_reader {
   private static int f;

/**
 * @param args
 * @throws IOException
 */
public static void main(String[] args)throws IOException {
    int ch;
    FileReader fr =null;
    try {
        fr = new FileReader("d:/radha.txt");
    } catch (Exception e) {
        System.out.println("File bhetiyana hai hjur ..");
    }
    while ((ch = fr.read()) != -1 ) {
        System.out.print((char) ch);
    }
    fr.close();
   } 
}
