package nl.hartwigmedicalfoundation.rps;

public class RoundResult {
    private final Move player1Move;
    private final Move player2Move;
    private final GameResult result;

    public RoundResult(Move player1Move, Move player2Move, GameResult result) {
        this.player1Move = player1Move;
        this.player2Move = player2Move;
        this.result = result;
    }

    public Move getPlayer1Move() {
        return this.player1Move;
    }

    public Move getPlayer2Move() {
        return this.player2Move;
    }

    public GameResult getResult() {
        return this.result;
    }
}
