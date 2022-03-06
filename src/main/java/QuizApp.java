import java.util.Scanner;

public class QuizApp {



    private static boolean isAnswerValid(Scanner sc, int length) {
        if (sc.hasNextInt()) {
            int digit = sc.nextInt();
            if (digit < 1 || digit > length ) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        String[] questionsArray = new String[3];
        questionsArray[0] = "Что такое бюджет семьи?";
        questionsArray[1] = "Целью страхования является:";
        questionsArray[2] = "Проработанный детализированный план по обеспечению личной финансовой безопасности и независимости - это:";

        String[][] answerOptionsArray = {{"1) план, содержащий роспись всех доходов и расходов семьи за определённый период времени;", "2) сумма всех доходов, которыми может распоряжаться семья;", "3) подробный отчёт о расходах за определённый период времени;", "4) план, учитывающий все доходы и возможные накопления, позволяющий рассчитать время, необходимое для совершения крупной покупки."}, {"1) обеспечение гражданам возможности дополнительного заработка при наступлении неблагоприятного события;", "2) обеспечение гражданам возможности компенсации ущерба при наступлении страхового случая;", "3) ускорение обращения денежных средств в экономике государства."}, {"1) персональная инвестиционная стратегия;", "2) инвестирование;", "3) финансирование;", "4) размещение денежных средств во вклады."}};

        int[] answersArray = {1, 2, 1};

        System.out.println("Пожалуйста, введите Ваше имя: ");
        user.setUsername(sc.next());
        for (int qa = 0; qa < questionsArray.length; qa++) {
            Answer answer = new Answer(answersArray[qa]);
            Question question = new Question(questionsArray[qa], answerOptionsArray[qa], answer);

            System.out.println(question.getDescription());

            int length = question.getOptions().length;
            for (int j = 0; j < question.getOptions().length; j++) {
                System.out.println(question.getOptions()[j]);
            }

            System.out.println("Введите номер выбранного Вами варианта ответа: ");

            while (!isAnswerValid(sc, length)) {

            }

            if (question.getAnswer().getCorrectOption() == answerNumber) user.addCorrectAnswer();
            System.out.println("Количество правильных ответов: " + user.getCorrectAnswersCount());
        }
    }
}
