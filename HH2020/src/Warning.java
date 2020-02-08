import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Popup;

public class Warning {
    private VBox fullLayout;
    public static Popup popup;

    public Warning(){
        Label label = new Label("At least one of your stats is running low. Please make sure to take care of yourself.");
        popup.getContent().add(label);
    }
}
