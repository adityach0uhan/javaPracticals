import java.util.Scanner;

public class helloworld{

public static void main(String[] args) {
	
	// System.out.println("hello there");
    // System.out.println("hello again");
    // int a = 32;
    // double b = 1234.23d;
    // String name = "aditya chauhan";
    // System.out.println(b);
    // System.out.println(a);
    // System.out.println(name);
    


    // making a calculator to add two number 

    // for getting first number input
    System.out.println("enter first number");
    Scanner a= new Scanner(System.in);
    int firstnum=a.nextInt();

    // for getting second number input 
    System.out.println("Enter Second number");
    int secondnum=a.nextInt();
    System.out.println(firstnum + secondnum);

    a.close();


}

}
