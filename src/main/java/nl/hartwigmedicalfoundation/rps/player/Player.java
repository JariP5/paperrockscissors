package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.model.Move;

public interface Player {
    Move chooseMove();
    String getName();
}
