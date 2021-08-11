//gamePractice01.java

package gamePractice;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class gamePractice01 {

    public static void main(String[] args) {
    	
    	// Creat Frame
    	JFrame frm = new JFrame("Killing Slimes");
    	
    	// Size of Frame
    	frm.setSize(350,300);
    	
    	// Set Frame location in the middle
    	frm.setLocationRelativeTo(null);
    	
    	// By closing Frame deleted from memory***
    	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//Layout Setting
    	frm.getContentPane().setLayout(null);
    	
    	// Make a button
    	JButton btn1 = new JButton("Slappi");
    	btn1.setBounds(30, 170, 122, 30);
    	frm.getContentPane().add(btn1);
    	
    	JButton btn2 = new JButton("Sladdi");
    	btn2.setBounds(182, 170, 122, 30);
    	frm.getContentPane().add(btn2);
    	
    	// Make frame visible***
    	frm.setVisible(true);
    	
    	// Set size of Content pane
    	System.out.println(frm.getContentPane().getSize());
    }
}