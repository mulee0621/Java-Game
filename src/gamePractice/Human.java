//Human.java

package gamePractice;

class Human {

	String name;
	int hp = 80;
	
	//Creator
	public Human(String n) {
		name = n;
	}
	
	public void attack(Slime s) {
		
		System.out.println("Human attacked "+ s.name);
		s.hp = s.hp - 30;
		
		if(s.hp < 1) {
			
			System.out.println(s.name + " is dead.");
			
		} else {
			
			System.out.println("Current Hp of "+ s.name +" is "+ s.hp + "\n");		
		
		}
	}
}
