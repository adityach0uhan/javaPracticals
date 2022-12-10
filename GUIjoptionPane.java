import javax.swing.JOptionPane;

public class GUIjoptionPane {

    public static void main(String args[]) {

        String name = JOptionPane.showInputDialog("what is your name");
        JOptionPane.showMessageDialog(null, "hello there " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you "+name+ "?"));
        JOptionPane.showMessageDialog(null, " okay "+ name +" so you are "+age+" years old");

        double height=Double.parseDouble(JOptionPane.showInputDialog("How  tall are you "+ name));
        JOptionPane.showMessageDialog(null,name+" you are "+ height + "CM in height");

    }
}