package com.GameCharacter;

public class Warrior extends GameCharacter {

	
	private String weaponType;
	Warrior(String name, int level, int healthPoints,String weapon) {
		super(name, level, healthPoints);
		this.weaponType=weapon;
		
	}

	@Override
	public void attack() {
		System.out.println("Performing  attack with "+weaponType);
		
	}

}
