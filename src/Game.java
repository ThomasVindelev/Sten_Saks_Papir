import java.util.Random;
import java.util.Scanner;

public class Game {

    public void playGame(Scanner scanner) {
        Random random = new Random();
        int AIchoice = 0;
        boolean isOver = false;
        byte userScore = 0;
        byte AIscore = 0;
        while (!isOver) {
            System.out.println("Pick one:\n1. Rock   2. Paper   3. Scissors");
            String realChoice = scanner.nextLine();
            switch (realChoice) {
                case "1":
                    AIchoice = random.nextInt(2);
                    if(AIchoice == 0) {
                        System.out.print("AI chooses rock\nIt's a draw!\n");
                    } else if (AIchoice == 1) {
                        System.out.print("AI chooses paper\nAI gets a point!\n");
                        AIscore++;
                    } else {
                        System.out.print("AI chooses rock\nYou get a point!\n");
                        userScore++;
                    }
                    System.out.println("The score is: \nYou: " + userScore + "\nAI: " + AIscore);
                    break;
                case "2":
                    AIchoice = random.nextInt(2);
                    if(AIchoice == 0) {
                        System.out.print("AI chooses rock\nYou get a point!\n");
                        userScore++;
                    } else if (AIchoice == 1) {
                        System.out.print("AI chooses paper\nIt's a draw!\n");
                    } else {
                        System.out.print("AI chooses rock\nAI gets a point!\n");
                        AIscore++;
                    }
                    System.out.println("The score is: \nYou: " + userScore + "\nAI: " + AIscore);
                    break;
                case "3":
                    AIchoice = random.nextInt(2);
                    if(AIchoice == 0) {
                        System.out.print("AI chooses rock\nAI gets a point!\n");
                        AIscore++;
                    } else if (AIchoice == 1) {
                        System.out.print("AI chooses paper\nYou get a point!\n");
                        userScore++;
                    } else {
                        System.out.print("AI chooses rock\nIt's a draw!\n");
                    }
                    System.out.println("The score is: \nYou: " + userScore + "\nAI: " + AIscore);
                    break;
                default:
                    System.out.print("Not an option - try again.");
                    break;
            }
            if (userScore == 10) {
                System.out.println("You win!");
                isOver = true;
            } else if (AIscore == 10) {
                System.out.println("AI wins!");
                isOver = true;
            }
        }
    }
}
