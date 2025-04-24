// GameTest.java
package nl.hartwigmedicalfoundation.rps.game;

import nl.hartwigmedicalfoundation.rps.model.*;
import nl.hartwigmedicalfoundation.rps.player.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    static class TestPlayer implements Player {
        private final String name;
        private final Move fixedMove;

        public TestPlayer(String name, Move fixedMove) {
            this.name = name;
            this.fixedMove = fixedMove;
        }

        @Override
        public Move chooseMove() {
            return fixedMove;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    @Test
    void testPlayer1Wins() {
        Player p1 = new TestPlayer("P1", Move.ROCK);
        Player p2 = new TestPlayer("P2", Move.SCISSORS);
        Game game = new Game(p1, p2);
        RoundResult result = game.playRound();
        assertEquals(GameResult.WIN_PLAYER_1, result.getResult());
    }

    @Test
    void testPlayer2Wins() {
        Player p1 = new TestPlayer("P1", Move.SCISSORS);
        Player p2 = new TestPlayer("P2", Move.ROCK);
        Game game = new Game(p1, p2);
        RoundResult result = game.playRound();
        assertEquals(GameResult.WIN_PLAYER_2, result.getResult());
    }

    @Test
    void testDraw() {
        Player p1 = new TestPlayer("P1", Move.ROCK);
        Player p2 = new TestPlayer("P2", Move.ROCK);
        Game game = new Game(p1, p2);
        RoundResult result = game.playRound();
        assertEquals(GameResult.DRAW, result.getResult());
    }
}
