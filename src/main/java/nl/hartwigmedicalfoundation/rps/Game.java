package nl.hartwigmedicalfoundation.rps;

import java.util.Random;

public class Game {
    private final Random random = new Random();

    public RoundResult playRound(Move userMove) {
        Move computerMove = Move.values()[random.nextInt(Move.values().length)];
        GameResult result = evaluateRound(userMove, computerMove);
        return new RoundResult(userMove, computerMove, result);
    }

    private GameResult evaluateRound(Move movePlayer1, Move movePlayer2) {
        if (movePlayer1 == movePlayer2) return GameResult.DRAW;
        return movePlayer1.beats(movePlayer2) ? GameResult.WIN_PLAYER_1 : GameResult.WIN_PLAYER_2;
    }
}
