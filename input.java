import java.util.Scanner;
public class input{
  public static void main(String[] args){
      
      //program for adding two numbers
      System.out.println(" Enter first number");
      Scanner firstnum= new Scanner(System.in);
      int a=firstnum.nextInt();
      
      System.out.println(" Enter second number");
      Scanner secondnum= new Scanner(System.in);
      int b=secondnum.nextInt();
      
      System.out.println(a+b);
      firstnum.close();
      secondnum.close();
    }

}