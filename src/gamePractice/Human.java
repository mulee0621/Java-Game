//Human.java

package gamePractice;

class Human {

	String name;
	int hp = 100;
	
	public Human(String n) {
		name = n;
	}
	
	public void attack(String slimeName) {
		System.out.println("A human attacked " + slimeName);
	}
}
