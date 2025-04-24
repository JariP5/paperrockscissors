package nl.hartwigmedicalfoundation.rps;

import nl.hartwigmedicalfoundation.rps.model.Move;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoveTest {

    @Test
    void testBeats() {
        assertTrue(Move.ROCK.beats(Move.SCISSORS));
        assertTrue(Move.PAPER.beats(Move.ROCK));
        assertTrue(Move.SCISSORS.beats(Move.PAPER));
    }
}
