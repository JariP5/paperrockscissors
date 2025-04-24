package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.model.Move;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerPlayerTest {
    @Test
    void testFixedMoveSupplier() {
        ComputerPlayer bot = new ComputerPlayer("Bot", () -> Move.PAPER);
        assertEquals(Move.PAPER, bot.chooseMove());
    }
}
