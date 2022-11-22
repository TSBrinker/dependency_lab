package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there!");

        Sword excalibur = new Sword();
        Bow bow = new Bow();
        Axe axe = new Axe();

        Attacker robot_one = new Robot("Hogarth", excalibur);
        Attacker robot_two = new Robot("Dominus", bow);
        Attacker robot_three = new Robot("Allen", axe);

        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();

        Attacker dinosaur_one = new Dinosaur("Yoshi", 100);

        dinosaur_one.Attack();
    }


}