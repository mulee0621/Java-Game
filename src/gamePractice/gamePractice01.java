//gamePractice01.java

package gamePractice;

import javax.swing.JOptionPane;

public class gamePractice01 {

    public static void main(String[] args) {
    	
    	Slime s = null;
    	
    	// Slime and Human Object created
    	Slime s1 = new Slime("Slammi");
    	Slime s2 = new Slime("Sladdi");
    	Human h = new Human("Alex");
    	
    	System.out.println(s1.name + " and " + s2.name + "is created!! And your name is " + h.name + "\n");
    
    	while(true) {
    		
    		// Input Box
    		String sTarget = JOptionPane.showInputDialog("Which Slime will you attack?");
    		
    		//For cancle
    		if(sTarget == null || sTarget.equals("")) {
    			System.exit(0);
    		}
    			
    		int target = Integer.parseInt(sTarget);
        	
        	if(target == 1) {
        		
        		s = s1;
        		
        	} else if(target == 2) {
        		
        		s = s2;
        		
        	} else {
        		
        		JOptionPane.showMessageDialog(null, "Please insert proper number.");
        	} 
        	
        	if(s.hp < 1) {
        		
        		System.out.println(s.name + "is already dead. \n");
        	
        	} else {
        		
        		h.attack(s);
            	s.attack(h);
    
        	}
        	
        	//If all slimes are dead, it is Game Clear!
        	if(s1.hp < 1 && s2.hp < 1) {
        		
        		JOptionPane.showMessageDialog(null, "***Game Clear!***");
        		System.exit(0);
        		
        	}
    	} // while END
    }
}