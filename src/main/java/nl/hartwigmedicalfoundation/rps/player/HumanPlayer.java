package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.model.Move;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final String name;
    private final Scanner scanner;

    public HumanPlayer(Scanner scanner) {
        this.name = "User";
        this.scanner = scanner;
    }

    @Override
    public Move chooseMove() {
        while (true) {
            System.out.printf("%s, enter your move (rock, paper, scissors): ", name);
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                throw new RuntimeException("User exited the game");
            }

            try {
                return Move.valueOf(input.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
