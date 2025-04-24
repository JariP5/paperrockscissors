package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.model.Move;

/**
 * Represents a player in the game who can choose a move.
 */
public interface Player {
    Move chooseMove();
    String getName();
}
