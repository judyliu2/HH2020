package sample;

public class Prompt {
    private String prompt;
    private Choice [] choices;

    public Prompt(String prompt, Choice[] choices) {
        this.prompt = prompt;
        this.choices = choices;
    }

    public String getPrompt() {
        return prompt;
    }

    public Choice[] getChoices() {
        return choices;
    }
}
