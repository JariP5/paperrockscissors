package nl.hartwigmedicalfoundation.rps;

import nl.hartwigmedicalfoundation.rps.game.Game;
import nl.hartwigmedicalfoundation.rps.game.GameStats;
import nl.hartwigmedicalfoundation.rps.model.RoundResult;
import nl.hartwigmedicalfoundation.rps.player.ComputerPlayer;
import nl.hartwigmedicalfoundation.rps.player.HumanPlayer;
import nl.hartwigmedicalfoundation.rps.player.Player;
import nl.hartwigmedicalfoundation.rps.player.supplier.RandomMoveSupplier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player human = new HumanPlayer("Bot", scanner);
        Player computer = new ComputerPlayer("User", new RandomMoveSupplier());
        Game game = new Game(human, computer);
        GameStats gameStats = new GameStats();

        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter 'exit' at any time to quit the game.");

        while (true) {
            try {
                System.out.println("\n--- New Round ---");
                RoundResult result = game.playRound();
                gameStats.record(result.getResult());
                System.out.println(result);
            } catch (Exception e) {
                break;
            }
        }

        gameStats.printSummary();
        System.out.println("Thanks for playing!");
    }
}
