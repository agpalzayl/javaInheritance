package com.packages;

public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }

    public void swordBones(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Sword Bones (Damage - 80)");
        int damagePoints = 70;
        damageTarget(enemyCharacter, damagePoints);

    }
    public void spatialMagic(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Spatial Magic (Damage - 10)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void demonHealing(Character warlockCharacter, int healthPoints, int manaPoints){
        System.out.println(super.characterName + " casted Demon Healing. " + super.characterName + " increases HP and Mana points.");
        add(warlockCharacter, healthPoints, manaPoints);
    }
    public void add(Character warlockCharacter, int healthPoints,int manaPoints){
        warlockCharacter.healthPoints += healthPoints;
        warlockCharacter.manaPoints += manaPoints;
    }
    public void status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" Hp = "+healthStatus+ " Mana = "+manaStatus);
    }
}

