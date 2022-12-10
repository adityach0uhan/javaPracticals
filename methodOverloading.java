class A{
    void add(){
        int a=10, b=20,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y){
        int c=x+y;
        System.out.println(c);
    }
    void add(int x , double y){
        double c= x+y;
        System.out.println(c);
    }
   
}
public class methodOverloading {
    public static void main(String[] args) {
      
        A a=new A();
        a.add();
        a.add(5,7);
        a.add(10,11.9);


        
    }
    
}
