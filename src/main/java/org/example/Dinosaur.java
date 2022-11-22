package org.example;

public class Dinosaur implements Attacker {

    //Instance variables (HAS A)
    public String name;
    public int attackPower;

    public Dinosaur(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
    public void Attack(){
        System.out.println(this.name + " attacks for " + this.attackPower + " damage!");
    }
}
