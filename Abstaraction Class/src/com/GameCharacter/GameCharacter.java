package com.GameCharacter;


public abstract class GameCharacter {
     private String name;
     private  int level;
     private int healthPoints;
     
     GameCharacter(String name,int level,int healthPoints){
    	 this.healthPoints=healthPoints;
    	 this.level=level;
    	 this.name=name;
     }
     
     public abstract void attack();
     
     public void chooseTarget() {
    	 System.out.println("Target selected");
     }
     
     public void animateAttack() {
    	 System.out.println("Attack animation played");
     }
}
