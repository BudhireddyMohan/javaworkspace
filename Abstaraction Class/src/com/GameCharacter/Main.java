package com.GameCharacter;

public class Main {
    
	public static void main(String args[]) {
		
	
	
	GameCharacter gc;
	gc=new Warrior("Conan", 5, 100, "Sword");
	gc.attack();
	gc.animateAttack();
	gc.chooseTarget();
	gc=new Mage("Gandalf", 7, 120, "Fireball");
	gc.attack();
	gc.animateAttack();
	gc.chooseTarget();
}
}
