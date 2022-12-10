public class ArraysConcept {

  public static void main(String[] args) {
    // Arrays are collection of elements of same data type stored inside a single variable 
    String[] students={"Aditya ", "pushkar","ravi","rumman"};

    // to access the elements of an array 

    // System.out.println(students[0]); 
    // System.out.println(students[3]);
    //computers always start counting from 0


    //iterate through arrays using for loop
    for(int i=0;i<students.length;i++){
        System.out.println(students[i]);
    }

    
  }
    
}
