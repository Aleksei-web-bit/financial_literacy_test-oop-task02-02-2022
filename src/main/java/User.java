public class User {

    private String username;
    private int correctAnswersCount;

    public User() {
    }

    public User(String username, int correctAnswersCount) {
        this.username = username;
        this.correctAnswersCount = correctAnswersCount;
    }

    public void addCorrectAnswer() {
        correctAnswersCount++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCorrectAnswersCount() {
        return correctAnswersCount;
    }
}
