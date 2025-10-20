import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?"
        };
        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"},
            {"1. William Shakespeare", "2. Leo Tolstoy", "3. Mark Twain", "4. Charles Dickens"}
        };
        int[] answers = {3, 2, 1};
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Wrong! The correct answer is " + answers[i] + ".\n");
            }
        }
        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
