/* User selects option for program to execute and output randomly generated problems with score
 * Markos Trujillo
 * 3/26/2024
 */
import java.util.Scanner;

public class ElementaryMath {
    public static void main(String[] args) {

        // Variables
        ProblemGenerator problems = new ProblemGenerator();
        Scanner input = new Scanner(System.in);
        int userChoice, answer, score;

        // Main program loop that repeats until user chooses to quit
        userChoice = 0;
        while (userChoice != 5) {

            // User Input
            System.out.println("Please choose an operation to practice:");
            System.out.println("    1. Addition");
            System.out.println("    2. Subtraction");
            System.out.println("    3. Multiplication");
            System.out.println("    4. Division");
            System.out.println("    5. Quit");
            System.out.print("Enter the number of your choice: ");
            userChoice = input.nextInt();
            System.out.println(); // space for user-friendliness

            // Prevent user from entering a number other than 1 to 4
            while (userChoice < 1 || userChoice > 5) {
                System.out.print("Enter the number of your choice: ");
                userChoice = input.nextInt();
            }

            // Switch case to select option
            switch (userChoice) {
                case 1:
                    score = 0;
                    problems.setOperator(" + "); // Addition

                    for (int i = 0; i < 5; i++) { // Outputs 5 problems
                        problems.addProblem();
                        answer = input.nextInt();

                        if (problems.checkAnswer(answer)) {
                            score++;
                        }
                    }

                    problems.printScore(score);
                    break;
                case 2:
                    score = 0;
                    problems.setOperator(" - "); // Subtraction

                    for (int i = 0; i < 5; i++) { // Outputs 5 problems
                        problems.addProblem();
                        answer = input.nextInt();

                        if (problems.checkAnswer(answer)) {
                            score++;
                        }
                    }

                    problems.printScore(score);
                    break;
                case 3:
                    score = 0;
                    problems.setOperator(" x "); // Multiplication

                    for (int i = 0; i < 5; i++) { // Outputs 5 problems
                        problems.addProblem();
                        answer = input.nextInt();

                        if (problems.checkAnswer(answer)) {
                            score++;
                        }
                    }

                    problems.printScore(score);
                    break;
                case 4:
                    score = 0;
                    problems.setOperator(" / "); // Division

                    for (int i = 0; i < 5; i++) { // Outputs 5 problems
                        problems.addProblem();
                        answer = input.nextInt();

                        if (problems.checkAnswer(answer)) {
                            score++;
                        }
                    }

                    problems.printScore(score);
                    break;
            }

        }

        System.out.println("Goodbye.");
    }
}
