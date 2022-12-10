

public class pattern {
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("next pattern");
        for (int row = 1; row <= 4; row++) {
            System.out.println();
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
        }

        System.out.println("");


        System.out.println("Pyramid Pattern");
        for(int i=0;i<5;i++){

            for(int j=5-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");



        }
    
    
    
    }
}
