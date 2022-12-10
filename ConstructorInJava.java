class parentclass{

    parentclass(){
        System.out.println("I called Myself because I am a Constructor :) ");
    }

}

public class ConstructorInJava {
    public static void main(String[] args) {
        
        parentclass object1=new parentclass();
        //constructor call themself as soon as the object is created
        
    }

    
}
