import java.util.Random;
public class randomNumber {

    public static void main(String[] args) {
        
        Random num = new Random();

        int x= num.nextInt(7);
        System.out.println("random number between 0 to 6 is :" +x);

        double y= num.nextDouble();
        System.out.println("random number with double data type is:" + y);

        boolean z= num.nextBoolean();
        System.out.println("random boolen value is :"+ z);

    }
    
}
