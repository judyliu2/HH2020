package sample;

public class Student {
    private double gpa;
    private int energy;
    private int health;
    private int money;
    private int social;

    public Student() {
        gpa = 4.0;
        energy = 100;
        health = 100;
        money = (int) Math.random()*150 + 50;
        social = (int) Math.random() * 100;
    }

    
}
