
import java.util.Scanner;
public class logicalOperators{

    public static void main(String args[]){

        System.out.println("Hey we are conducting a survey . Are you a Student? :");
        Scanner scan = new Scanner(System.in);

        String response=scan.nextLine();
        
        if( response.equals("yes") || response.equals("Yes")){
            System.out.println("Okay so what college are u studying in ?");
            String reply=scan.nextLine();
            
            System.out.println(reply+"  Okay thank you for participating");

        }else{
            System.out.println("okay thanks !");
        }

        scan.close();

    }
}