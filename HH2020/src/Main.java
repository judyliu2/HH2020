import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private BorderPane root = new BorderPane();
    private Button start = new Button("Start Game");
    private Label title = new Label("Student Life");

    @Override
    public void start(Stage primaryStage) throws Exception{
        root.setStyle("-fx-background-color: #ccff99");
        root.setCenter(start);
        root.setTop(title);
        start.setStyle("-fx-font-size: 15pt;");
        title.setStyle("-fx-font-size: 25pt;");
        root.setAlignment(title, Pos.CENTER);
        primaryStage.setTitle("Student Life");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}