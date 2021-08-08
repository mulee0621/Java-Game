// gamePractice02.java

package gamePractice;

import javax.swing.JOptionPane;

public class gamePractice02 {

	public static void main(String[] args) {
		int hp = 100;
		
		while(true) {
			if(hp < 1) {
				JOptionPane.showMessageDialog(null, "!!Game Over!!");
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Your current Hp is " + hp);
			hp = hp - 20;
		}
		
	}

}
