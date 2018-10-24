
import java.util.Scanner;

public class RoshamboApp {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!\n");
        System.out.print("Enter your name? ");
        UserPlayer user = new UserPlayer();
        user.playerName = scanner.nextLine();
        Player opponent = null;
        System.out.print("Would you like to play against Thejets or TheSharks(j/s)");
        char option = Validator.checkUserChoice();
        if (option == 'j') {
            opponent = new Thejets();
        } else if (option == 's') {
            opponent = new TheSharks();
        }
        String choice = null;
        do {
            System.out.print("Rock,Paper,Scissors?(R/P/S):");
            user.RoshamboValue = user.generateRoshambo();
            System.out.println(user.playerName + ": " + user.RoshamboValue);
            System.out.println(opponent.playerName + ": " + opponent.RoshamboValue);
            if (user.RoshamboValue == opponent.RoshamboValue) {
                System.out.println("Draw");
            } else if (user.RoshamboValue == Roshambo.PAPER && opponent.RoshamboValue == Roshambo.ROCK) {
                System.out.println(user.playerName + " Wins!");
            } else if (user.RoshamboValue == Roshambo.PAPER && opponent.RoshamboValue == Roshambo.SCISSOR) {
                System.out.println(opponent.playerName + " Wins!");
            } else if (user.RoshamboValue == Roshambo.ROCK && opponent.RoshamboValue == Roshambo.SCISSOR) {
                System.out.println(user.playerName + " Wins!");
            } else if (user.RoshamboValue == Roshambo.ROCK && opponent.RoshamboValue == Roshambo.PAPER) {
                System.out.println(opponent.playerName + " Wins!");
            } else if (user.RoshamboValue == Roshambo.SCISSOR && opponent.RoshamboValue == Roshambo.ROCK) {
                System.out.println(opponent.playerName + " Wins!");
            } else if (user.RoshamboValue == Roshambo.SCISSOR && opponent.RoshamboValue == Roshambo.PAPER) {
                System.out.println(user.playerName + " Wins!");
            }
            System.out.print("Play Again?(y/n)");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Y"));
        System.out.println("Program exits Here..");
    }
}
