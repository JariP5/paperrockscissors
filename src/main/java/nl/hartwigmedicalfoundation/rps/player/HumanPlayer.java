package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.Move;

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
            try {
                return Move.valueOf(scanner.nextLine().trim().toUpperCase());
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
