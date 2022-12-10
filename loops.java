
public class loops{
    
    public static void main(String[] args){
        System.out.print("using whileloop");
        //while loop
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        
        //do while
        System.out.println("using  do-while loop");
        int j=11;
        do{
            System.out.println(j);
            j++;
        
        }while(j<=20);
        
        //for loop
        
        System.out.println("using for loop");
    
        for(int z=21;z<=30;z++){
            System.out.println(z);
        }
        
        
        //using the break and continue 
        
        for(int k=0; k<10;k++){
            if(k==5){
                continue;
            }
            else if(k==7){
                break;
            }
            System.out.println(k);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}