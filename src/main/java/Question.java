
public class Question {

    private String description;
    private String[] options;
    private Answer answer;

    public Question() {
    }

    public Question(String description, String[] options, Answer answer) {
        this.description = description;
        this.options = options;
        this.answer = answer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
