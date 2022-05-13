package com.packages;

public class Wizard extends Character {

    Wizard(String name){
        super(name);
    }

    public void spiritStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Spirit Storm (Damage - 60)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void sylphsBreath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Sylph's Breath (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void holyHealing(Character wizardCharacter, int manaPoints, int healthPoints){
        System.out.println(super.characterName + " casted Holy Healing. " + super.characterName + " increases HP and Mana points.");
        add(wizardCharacter, healthPoints, manaPoints);
    }
    public void add(Character wizardCharacter, int healthPoints,int manaPoints){
        wizardCharacter.healthPoints += healthPoints;
        wizardCharacter.manaPoints += manaPoints;
    }
    public void status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" HP = "+healthStatus+ " Mana Points = "+manaStatus);
    }
}
