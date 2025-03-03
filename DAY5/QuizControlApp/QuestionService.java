package DAY5.QuizControlApp;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];


    public QuestionService() {
        questions[0] = new Question(1,"size of int", "2","4","6","8","4");
        questions[1] = new Question(2,"Size of double", "2","4","6","8","4");
        questions[2] = new Question(3,"Size of float", "2","4","6","8","4");
        questions[3] = new Question(4,"Size of long", "2","4","6","8","4");
        questions[4] = new Question(5, "size of char", "2","4","6","8","4");

    }
//    public void displayQuestions() {
//        for(Question q : questions) {
//            System.out.println(q.toString());
//        }
//    }

    String Selection[] = new String[5];
    int i =0;
    public void playQuiz(){

        for(Question q : questions){
            System.out.println("Question No: "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOption1());
            System.out.println(q.getOption2());
            System.out.println(q.getOption3());
            System.out.println(q.getOption4());

            Scanner SC = new Scanner(System.in);
            System.out.print("Enter Your Choice: ");
            Selection[i] = SC.nextLine();
            i++;

        }

        i=1;
        System.out.println("Your Choice: ");
        for(String str : Selection){
            System.out.println("Q"+i+" "+str);
            i++;
        }
    }

    public void printScore(){
        int Score = 0;
        for(int i=0; i<questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = Selection[i];

            if(answer.equals(userAnswer)){
                Score++;
            }
        }
        System.out.println("Score: "+Score);
    }
}


