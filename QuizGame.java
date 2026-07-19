import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args){

            String[] questions = {"1. What data type stores whole numbers?",
                                  "2. What data type stores decimal numbers?",
                                  "3. What is a method?",
                                  "4. What does ++ do to a variable?",
                                  "5. What loop always runs at least once?"};

            String[][] options = {{"A. double", "B. String", "C. int", "D. boolean", "E. char"},
                                  {"A. int", "B. float", "C. String", "D. double", "E. boolean"},
                                  {"A. A variable that stores data", "B. A reusable block of code", "C. A type of loop",
                                          "D. A way to import libraries", "E. A data type"},
                                  {"A. Multiplies by 2", "B. Subtracts 1", "C. Resets to 0", "D. Adds 1", "E. Divides by 2"},
                                  {"A. for loop", "B. while loop", "C. foreach loop", "D. do while loop", "E. repeat loop"}};

            char[] answers = {'C', 'D', 'B', 'D', 'D'};
            int score = 0;
            char guess ;

            Scanner scanner = new Scanner(System.in);

        System.out.println("*****************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("*****************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.next().charAt(0);

            if(guess == answers[i]){
                System.out.println("*****************");
                System.out.println("CORRECT!");
                System.out.println("*****************");
                score++;
            }
            else{
                System.out.println("WRONG!");
                System.out.println("*****************");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);

            scanner.close();
    }

}
