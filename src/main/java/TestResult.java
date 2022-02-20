import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        Answer answer = new Answer();

        int correctAnswer = 0;

        for (int q = 0; q < question.getQuestionsArray().length; q++) {
            System.out.println(question.getQuestionsArray()[q]);
            System.out.println("Пожалуйста, введите номер выбранного Вами варианта ответа:");

            if (sc.hasNextInt()) {
                int answerNumber = sc.nextInt();
                for (int a = 0; a < answer.getAnswersArray().length; a++) {
                    if (a == q & answerNumber == answer.getAnswersArray()[a]) correctAnswer++;
                }
            } else {
                System.out.println("Некорректный ввод данных! Пожалуйста, перезапустите программу и попробуйте ещё раз.");
                break;
            }
        }
        System.out.println("Количество правильных ответов: " + correctAnswer);
        sc.close();
    }
}
