// Slime.java

package gamePractice;

import javax.swing.JOptionPane;

public class Slime {
	
	String name;
	int hp = 80;
	
	// Creator
	public Slime(String n) {
		name = n;	
	}
	
	// Attack
	public void attack(Human h) {
		
		if(hp > 0) {
			System.out.println(name + " attacked "+h.name);
			h.hp = h.hp - 10;
			
			if(h.hp <1) {
				JOptionPane.showMessageDialog(null, "!!Game Over!!");
				System.exit(0);
			}
			
			System.out.println("Current Hp of "+h.name+" is "+h.hp+"\n");
		}

	}

}
