public class InputUsingConsole {
    public static void main(String[] args) {

        System.out.print("enter your name:");
        String name=System.console().readLine();
        System.out.println(name);
    }
}
