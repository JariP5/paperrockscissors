package nl.hartwigmedicalfoundation.rps;

import nl.hartwigmedicalfoundation.rps.player.Player;

public class Game {
    private final Player player1;
    private final Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public RoundResult playRound() {
        Move humanMove = player1.chooseMove();
        Move computerMove = player2.chooseMove();

        GameResult result = evaluateRound(humanMove, computerMove);

        return new RoundResult(
                player1.getName(), humanMove,
                player2.getName(), computerMove,
                result
        );
    }

    private GameResult evaluateRound(Move movePlayer1, Move movePlayer2) {
        if (movePlayer1 == movePlayer2) return GameResult.DRAW;
        return movePlayer1.beats(movePlayer2) ? GameResult.WIN_PLAYER_1 : GameResult.WIN_PLAYER_2;
    }
}
