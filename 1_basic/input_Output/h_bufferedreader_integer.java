import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class h_bufferedreader_integer {
   public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter roll :");
    int roll =Integer.parseInt(reader.readLine());

    System.out.println("Roll = "+roll);
   } 
}
