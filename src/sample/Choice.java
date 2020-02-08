package sample;

import javafx.scene.control.Button;

public class Choice{
    private String choice;
    private int health, energy, social, money;
    private double gpa;
    private Button button;

    public Choice(String choice, int health, int energy, int social, int money, double gpa) {
        this.choice = choice;
        this.health = health;
        this.energy = energy;
        this.social = social;
        this.money = money;
        this.gpa = gpa;
        this.button = new Button(choice);
    }

    public String getChoice() {
        return choice;
    }

    public int getHealth() {
        return health;
    }

    public Button getButton() {
        return button;
    }

    public int getEnergy() {
        return energy;
    }

    public int getSocial() {
        return social;
    }

    public int getMoney() {
        return money;
    }

    public double getGpa() {
        return gpa;
    }
}
