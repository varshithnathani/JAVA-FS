package DAY5.QuizControlApp;

public class Main {
    public static void main(String[] args) {

        QuestionService qs = new QuestionService();
        //qs.displayQuestions();
        qs.playQuiz();
        qs.printScore();

    }
}
