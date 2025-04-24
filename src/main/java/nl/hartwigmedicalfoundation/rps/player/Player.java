package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.Move;

public interface Player {
    Move chooseMove();
    String getName();
}
