import java.util.Scanner;
import java.util.Random;

public class NIM {
    public static void main(String[] args) {
        System.out.println("Get Ready to Play Nim!");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int sticks = 7;
        System.out.println("Starting Stick amount: " + sticks);
        int Round = 1;
        while (sticks > 0) {
            int User1Moves = 0;
            while (User1Moves < 1 || User1Moves > 2 || User1Moves > sticks) {
                System.out.println("How many sticks do you want to remove?: ");
                User1Moves = in.nextInt();

                if (User1Moves < 1 || User1Moves > 2) {
                    System.out.println("Try again, invalid amount!");

                }
            }
            sticks -= User1Moves;
            System.out.println("Round: " + Round);
            System.out.println("Users Choice: " + User1Moves);
            System.out.println("Sticks Remaining: " + sticks);
            if (sticks == 0) {
                System.out.print("Winner Winner!You win!");
                break;
            }
            int ComputerMove = rand.nextInt(2) + 1;
            if (ComputerMove > sticks) {
                ComputerMove = sticks;
            }
            sticks -= ComputerMove;
            System.out.println("Round: " + Round);
            System.out.println("Computers Choice: " + ComputerMove);
            System.out.println("Sticks Remaining: " + sticks);
            if (sticks == 0) {
                System.out.println("Computer Wins! You Lose :(");
                break;
            }
            Round++;
        }

    }

}
