package gamePractice;

import javax.swing.JOptionPane;

public class gamePractice01 {

    public static void main(String[] args) {
    	
    	int birthYear = Integer.parseInt(JOptionPane.showInputDialog("Type your birth year."));
    	
    	int currentYear = Integer.parseInt(JOptionPane.showInputDialog("What is current year?"));
    	
    	int age = currentYear - birthYear + 1;
        
        JOptionPane.showMessageDialog(null, "Your age is " + age);
        
        //with more option
        
        if(age >= 20) {
        	JOptionPane.showMessageDialog(null, "You are adult");
        } else if (age >= 15) {
        	JOptionPane.showMessageDialog(null, "You are youth");
        } else {
        	JOptionPane.showMessageDialog(null, "You are kid");	
        }   
    }
 
}