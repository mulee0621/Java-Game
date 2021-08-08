//gamePractice01.java

package gamePractice;

import javax.swing.JOptionPane;

public class gamePractice01 {

    public static void main(String[] args) {

    	Slime s1 = new Slime("Slammi");
    	
    	Slime s2 = new Slime("Sladdi");
    	
    	Slime s3 = new Slime("Slabbi");
    	
    	Human h = new Human("Alex");
    	
    	System.out.println(s1.name + " and " + s2.name + "is created!! And your name is " + h.name + "\n");
    
    	while(true) {
    		int target = Integer.parseInt(JOptionPane.showInputDialog("Which Slime will you attack?"));
        	
        	if(target == 1) {
        		
        		h.attack(s1.name);
        		s1.hp = s1.hp - 10;
        		System.out.println("Current Hp of " +s1.name+ " is " +s1.hp);
        		
        		s1.attack();
        		h.hp = h.hp - 10;
        		if(h.hp < 1) {
        			JOptionPane.showMessageDialog(null, "!!Game Over!!");
        			break;
        		}
        		System.out.println("Current Hp of " +h.name+ " is " +h.hp);
        		
        	}
        	else if(target == 2) {
        		
        		h.attack(s2.name);
        		s2.hp = s2.hp - 10;
        		System.out.println("Current Hp of " +s2.name+ " is " +s2.hp);
        		
        		s2.attack();
        		h.hp = h.hp - 10;
        		if(h.hp < 1) {
        			JOptionPane.showMessageDialog(null, "!!Game Over!!");
        			break;
        		}
        		System.out.println("Current Hp of " +h.name+ " is " +h.hp);
        	}
        	else if(target == 3) {
        		
        		h.attack(s3.name);
        		s3.hp = s3.hp - 10;
        		System.out.println("Current Hp of " +s3.name+ " is " +s3.hp);
     
        		s3.attack();
        		h.hp = h.hp - 10;
        		if(h.hp < 1) {
        			JOptionPane.showMessageDialog(null, "!!Game Over!!");
        			break;
        		}
        		System.out.println("Current Hp of " +h.name+ " is " +h.hp);
        	
        	}
        	else {
        		
        		System.out.println("Please insert proper number.");
        		
        	}
    	} // while END
    	
    } 
 
}