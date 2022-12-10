class parentclass{
    int a=10;
    void parentMethod(){
        System.out.println(" this is the parent class and the value of a is :");
    }
}
class childclass extends parentclass{
    int a=30;
    void childMethod(){
        System.out.println(" Value of a in child class :"+ this.a+ " \n"+" Value of a in parent class is:"+ super.a);
    }
}



public class SuperKeyword {
    public static void main(String[] args) {
        
  
    childclass obj1= new childclass();
    obj1.childMethod();
   
}

    
}
