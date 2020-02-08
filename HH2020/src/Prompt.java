import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;

public class Prompt {
    private String prompt;
    private Choice [] choices;
    private TilePane choicesPane;
    private BorderPane border;

    public Prompt(String prompt, Choice[] choices) {
        this.prompt = prompt;
        this.choices = choices;
        for(Choice x: choices)
        {
            choicesPane.getChildren().add(x.getButton());
        }
        TextField promptText = new TextField(prompt);
    }

    public String getPrompt() {
        return prompt;
    }

    public Choice[] getChoices() {
        return choices;
    }
}
