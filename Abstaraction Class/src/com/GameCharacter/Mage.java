package com.GameCharacter;

public class Mage extends GameCharacter{

	private String spelltype;
	
	
	Mage(String name, int level, int healthPoints,String spelltype) {
		super(name, level, healthPoints);
		this.spelltype=spelltype;

	}

	@Override
	public void attack() {
		System.out.println("Performing melee attack with "+spelltype);

		
	}

}
