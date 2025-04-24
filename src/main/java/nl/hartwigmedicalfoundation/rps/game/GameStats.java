package nl.hartwigmedicalfoundation.rps.game;

import nl.hartwigmedicalfoundation.rps.model.GameResult;

public class GameStats {
    private int winsPlayer1;
    private int winsPlayer2;
    private int draws;

    public void record(GameResult result) {
        switch (result) {
            case WIN_PLAYER_1 -> winsPlayer1++;
            case WIN_PLAYER_2 -> winsPlayer2++;
            case DRAW -> draws++;
        }
    }

    public void printSummary() {
        System.out.println("\nGame Summary:");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d%n", winsPlayer1, winsPlayer2, draws);
    }
}
