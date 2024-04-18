/**
 * assignment
 */
import java.util.Scanner;
public class assignment {

    public static void main(String[] args) {

        int score;
        score = 0;

        String[] questions = {
            "What is the largest desert in Africa?",
            "Which river is the longest in Africa?",
            "Which African country is known as the 'Rainbow Nation'?",
            "What is the tallest mountain in Africa?",
            "Where is the HQ AU?"
        };
        String[] options = {
            "A. Kalahari\tB. Sahara\tC. Namibia\tD. Atacama",
            "A. Nile\tB. Congo\tC. Niger\tD. Zambezi",
            "A. Nigeria\tB. Kenya\tC. South Africa\tD. Egypt",
            "A. Mount Kenya\tB. Mount Kilimanjaro\tC. Mount Elgon\tD. Mount Cameroon",
            "A. Adis AbabatB. Nairobi\tC. Cairo\tD. Mogadishu"
        };
        char[] answers = {'B', 'A', 'C', 'B', 'A'};

        Scanner scanner = new Scanner(System.in);
        
        // Start the quiz
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Choose the correct answer by typing the corresponding letter.");
        System.out.println("------------------------------------------------------------");

        for (int numberOfQuestions = 0; numberOfQuestions < questions.length; numberOfQuestions++){
             // Display the question
            System.out.println("Question " + (numberOfQuestions + 1) + ":");
            System.out.println(questions[numberOfQuestions]);
            System.out.println("Options:");
            System.out.println(options[numberOfQuestions]);

            // Prompt the user for input
            System.out.print("Your answer (A, B, C, or D): ");
            char userAnswer = scanner.nextLine().toUpperCase().charAt(0); // Convert input to uppercase

            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == (answers[numberOfQuestions])) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Incorrect! The correct answer is " + answers[numberOfQuestions]);
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please enter A, B, C, or D.");
            }

        }
        float finalScore = ((float)score / questions.length) * 100;
        System.out.println("Actual score: " + score + " percentage score: " + finalScore);
        scanner.close();
    }
}