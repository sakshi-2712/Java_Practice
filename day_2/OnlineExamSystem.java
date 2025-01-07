import java.util.ArrayList;
import java.util.Scanner;


class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

class Quiz {
    ArrayList<Question> questions;
    int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!\n");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.questionText);

            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Enter your answer (1-" + q.options.length + "): ");
            int answer = scanner.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + q.options[q.correctAnswer - 1] + "\n");
            }
        }

        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.size());
        scanner.close();
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 3));
        quiz.addQuestion(new Question("What is 5 + 3?", new String[]{"5", "8", "10", "15"}, 2));
        quiz.addQuestion(new Question("Which programming language is used for Android development?", new String[]{"Python", "Java", "C++", "Ruby"}, 2));

        quiz.start();
    }
}
