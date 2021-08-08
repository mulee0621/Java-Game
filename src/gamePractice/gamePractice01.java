//gamePractice01.java

package gamePractice;

public class gamePractice01 {

    public static void main(String[] args) {
    	Slime.name = "Slammi";
    	Slime.hp = 100;
    	
    	System.out.println("The name of slime is " + Slime.name);
    	System.out.println("The Hp of " + Slime.name + " is " + Slime.hp);

    	Slime.attack();
    }
 
}