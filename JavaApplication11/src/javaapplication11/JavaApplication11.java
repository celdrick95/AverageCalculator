package javaapplication11;
import javax.swing.JOptionPane;

public class JavaApplication11 {

    public static void main(String[] args) {
    
        String input;
        int num1, num2;
        double average;
        
        input=JOptionPane.showInputDialog("First Number: ");
        num1= Integer.parseInt(input);
        
        input=JOptionPane.showInputDialog("Second Number: ");
        num2= Integer.parseInt(input);
        
        average = (num1 +num2)/ 2;
        
        JOptionPane.showMessageDialog(null, "The total Average of " + num1 + "AND" + num2 + " is " + average);
    }   
}
