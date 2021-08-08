package gamePractice;

import javax.swing.JOptionPane;

public class gamePractice01 {

    public static void main(String[] args) {
    	
    	int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Type your birth year."));
    	
    	int currentYear = Integer.parseInt(JOptionPane.showInputDialog("What is current year?"));
    	
    	int age = currentYear - birthYear + 1;
        
        JOptionPane.showMessageDialog(null, "Your age is " + age);
        
    }
 
}