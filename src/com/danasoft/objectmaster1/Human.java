package com.danasoft.objectmaster1;

public class Human {
    int strength = 3;
    int stealth = 3;
    int intelligence = 3;
    int health = 100;

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    void attack(Human h) {
        h.health -= this.strength;
    }

    @Override
    public String toString() {
        return String.format("\t%s -\r\n\tStrength: %d, Stealth: %d, Intelligence: %d, Health: %d",
                this.getClass().getSimpleName(), strength, stealth, intelligence, health);
    }
}
