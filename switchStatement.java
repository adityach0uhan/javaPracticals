public class switchStatement {
    public static void main(String args[]){

        String day="Monday";

        switch(day){
            case "Sunday":System.out.println("It is Sunday");
            break;
        //break must be added or code will continue to flow after it finds out matchingcase
            case "Monday":System.out.println("It is Monday");
            break;
            case "Tuesday":System.out.println("It is Tuesday");
            break;
            case "Wednesday":System.out.println("It is Wednesday");
            break;
            case "Friday":System.out.println("It is friday");
            break;
            case "Saturday":System.out.println("It is Saturday");
            break;
            default:System.out.println("it's not a day");

        }
    }
}
