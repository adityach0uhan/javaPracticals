import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderInput {

    public static void main(String args[]) throws IOException{
         System.out.print("enter your name:");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("welcome " + name);   
    }
}
