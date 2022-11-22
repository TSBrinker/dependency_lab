package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello there!");

        Sword excalibur = new Sword();
        Bow bow = new Bow();
        Axe axe = new Axe();

        Robot robot_one = new Robot("Hogarth", excalibur);
        Robot robot_two = new Robot("Dominus", bow);
        Robot robot_three = new Robot("Allen", axe);

        robot_one.Attack();
        robot_two.Attack();
        robot_three.Attack();
    }


}