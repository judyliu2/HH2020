import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Help {
    private FlowPane bottom;
    private TextField health, energy, money, gpa;
    private Button help;

    public Help(Student student){
        health = new TextField("Health: " + student.getHealth());
        energy = new TextField("Energy: " + student.getEnergy());
        money = new TextField("Money: " + student.getMoney());
        gpa = new TextField("GPA: " + student.getGpa());
        help = new Button("help");
        makeHelpAction();
    }

    public void makeHelpAction(){
        help.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });
    }
}

