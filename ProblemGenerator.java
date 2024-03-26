/* Object to create and check problems
 * Markos Trujillo
 * 3/26/2024
 */
import java.util.Random;

public class ProblemGenerator {

    // Declared variables to be used in all methods
    private String operator;
    private int result;
    private String resultString;

    // Mutator method
    public void setOperator(String op) {
        operator = op;
    }

    // Method to generate practice problem
    public void addProblem() {
        Random rand = new Random();
        int num1, num2;

        num1 = rand.nextInt(10 - 1 + 1) + 1;
        num2 = rand.nextInt(10 - 1 + 1) + 1;
        
        if (operator.equals(" + ")) {
            result = num1 + num2;
            resultString = num1 + operator + num2 + " = " + result; // Answer stored to be output if user gets incorrect
            System.out.print(num1 + operator + num2 + " = ");
        }
        else if (operator.equals(" - ")) {
            result = num1 - num2;

            if (result < 0) { // prevent negative answers
                addProblem();
            }
            else {
                resultString = num1 + operator + num2 + " = " + result; // Answer stored to be output if user gets incorrect
                System.out.print(num1 + operator + num2 + " = ");
            }
        }
        else if (operator.equals(" x ")) {
            result = num1 * num2;
            resultString = num1 + operator + num2 + " = " + result; // Answer stored to be output if user gets incorrect
            System.out.print(num1 + operator + num2 + " = ");
        }
        else {
            result = num1 / num2;

            if (num1 % num2 != 0) { // prevent fractional answers
                addProblem();
            }
            else {
                resultString = num1 + operator + num2 + " = " + result; // Answer stored to be output if user gets incorrect
                System.out.print(num1 + operator + num2 + " = ");
            }
        }
        
    }

    // Method to check if user answer is correct
    public boolean checkAnswer(int input) {
        if (input == result) {
            System.out.println("Correct.");
            System.out.println(); // space for user-friendliness
            return true;
        }
        else {
            System.out.print("Incorrect. ");
            System.out.println(resultString);
            System.out.println(); // space for user-friendliness
            return false;
        }
    }

    // Method that prints user-friendly percentage output
    public void printScore(int num) {
        double score = num;
        double percent = (score / 5) * 100;

        System.out.print("You got ");
        System.out.printf("%.0f%%", percent);
        System.out.println(" of the problems correct.");
        System.out.println(); // space for user-friendliness
    }

}
