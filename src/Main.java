import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean endApp = false;

        while(!endApp) {
            Scanner scanner = new Scanner(System.in);
            Game game = new Game();
            System.out.println("Hello - welcome to rock - paper - scissors!\n1. Start game   2. Exit game");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                game.playGame(scanner);
            } else {
                System.out.println("Closing game...");
                endApp = true;
            }
        }
    }
}
