//Slime.java

package gamePractice;

public class Slime {
	
	String name;
	int hp = 80;
	
	//creater
	public Slime(String n) {
		name = n;	
	}
	
	//attack
	public void attack() {
		System.out.println(name + " attacked a human.");	
	}

}
