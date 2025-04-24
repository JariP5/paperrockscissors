package nl.hartwigmedicalfoundation.rps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter 'rock', 'paper', 'scissors', or 'exit' to quit.");

        while (true) {
            System.out.print("\nYour move: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("EXIT")) break;

            try {
                Move userMove = Move.valueOf(input);
                RoundResult result = game.playRound(userMove);

                System.out.printf("Computer played: %s%n", result.getPlayer2Move());
                System.out.printf("You %s!%n", result.getResult());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter rock, paper, scissors, or exit.");
            }
        }
    }
}
