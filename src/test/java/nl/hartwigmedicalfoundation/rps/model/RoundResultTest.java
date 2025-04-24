package nl.hartwigmedicalfoundation.rps.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoundResultTest {
    @Test
    void testToStringPlayer1Wins() {
        RoundResult result = new RoundResult("User", Move.ROCK, "Bot", Move.SCISSORS, GameResult.WIN_PLAYER_1);
        assertTrue(result.toString().contains("User wins!"));
    }

    @Test
    void testToStringPlayer2Wins() {
        RoundResult result = new RoundResult("User", Move.ROCK, "Bot", Move.PAPER, GameResult.WIN_PLAYER_2);
        assertTrue(result.toString().contains("Bot wins!"));
    }

    @Test
    void testToStringDraw() {
        RoundResult result = new RoundResult("User", Move.ROCK, "Bot", Move.ROCK, GameResult.DRAW);
        assertTrue(result.toString().contains("It's a draw!"));
    }
}
