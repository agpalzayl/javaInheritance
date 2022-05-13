package com.packages;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         *
         *
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         *
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         *
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         *
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Merlin = new Wizard("Merlin");
         * Warlock Saruman = new Warlock("Saruman");
         *
         * Merlin.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */

        Wizard Yuno = new Wizard("Yuno");
        Warlock Zenon = new Warlock("Zenon");
        Character ch = new Character();

        System.out.println("Wizard");
        ch.displayCharacter("Yuno");

        System.out.println("\nWarlock");
        ch.displayCharacter("Zenon");

        System.out.println("\n");
        Zenon.spatialMagic(Yuno);
        Yuno.status(90, 200);
        Zenon.status(100, 110);

        Yuno.sylphsBreath(Zenon);
        Yuno.status(90, 110);
        Zenon.status(50, 160);
        Zenon.demonHealing(Zenon, 20, 20);
        Yuno.status(90, 110);
        Zenon.status(70, 180);

        Zenon.swordBones(Yuno);
        Yuno.status(20, 110);
        Zenon.status(70, 90);
        Yuno.spiritStorm(Zenon);
        Yuno.status(20, 10);
        Zenon.status(10, 90);
        Yuno.holyHealing(Yuno, 20, 20);
        Yuno.status(40, 30);
        Zenon.status(10, 90);
        Zenon.swordBones(Yuno);
        Yuno.status(0, 30);
        Zenon.status(10, 0);

        System.out.println("The Demon-Host Zenon Zogratis defeated the Prince of the Spade Kingdom Yuno Grinberryall. ");
        System.out.println("Zenon's level increases!");
        System.out.println("Level 1 to Level =  "+ch.levelUp(1));


    }
}