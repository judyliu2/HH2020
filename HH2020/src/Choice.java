import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Choice {
    private String choice;
    private int health, energy, social, money;
    private double gpa;
    private Student student;
    private Button button;

    public Choice(Student student, String choice, int health, int energy, int social, int money, double gpa) {
        this.choice = choice;
        this.health = health;
        this.energy = energy;
        this.social = social;
        this.money = money;
        this.gpa = gpa;
        this.button = new Button(choice);
        makeButtonAction();
    }

    private void makeButtonAction() {
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                student.changeHealth(health);
                student.changeEnergy(energy);
                student.changeSocial(social);
                student.changeMoney(money);
                student.changeGpa(gpa);
            }
        });
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