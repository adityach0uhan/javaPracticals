import java.util.Scanner;
public class ifelse{
    
    
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=scan.nextInt();
        if(marks>=80){
            System.out.println("You scored A grade");
        }else if(marks>=60){
            System.out.println("You scored B grade");
        }else{
            System.out.println("You are failed");
        }
        scan.close();
    }
}