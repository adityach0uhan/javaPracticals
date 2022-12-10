class parentclass{
    String name = "aditya";
    int age= 20;
}
class child1 extends parentclass{
    String collegeName="gpkgh";
}
class child2 extends child1{
    void showInfo(){
        System.out.println(" name:" + name +"\n age:"+ age +
    "\n college:"+collegeName);
    // this class have now access to the parent and child1 class so it can use their properties
    }
}
public class SinglelevelInheritance {
    public static void main(String[] args) {
        child2 stu1= new child2(); //the object is created for the //recent class 
        stu1.showInfo();
    }
    
}
