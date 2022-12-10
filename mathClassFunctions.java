import java.util.Scanner;

public class mathClassFunctions {

    public static void main(String args[]){

        /* there are several math functions available
        Math.ceil();
        Math.round();
        Math.sqrt();
        Math.min();
        Math.max();
        Math.abs();
        Math.floor();
        Math.pow();
        Math.random();
        */

        // program to find greater of the given two values
        Scanner scan=new Scanner(System.in);
        System.out.print(" enter the first number:");
        int firstnum=scan.nextInt();

        System.out.print(" enter the second number:");
        int secondnum=scan.nextInt();

        int result  = Math.max(firstnum, secondnum);
        System.out.println("the greatest between "+firstnum + " and " + secondnum + " is :"+result);

          scan.close();
    }
    
}
