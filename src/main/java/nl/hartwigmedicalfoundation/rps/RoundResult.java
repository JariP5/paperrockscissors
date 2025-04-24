package nl.hartwigmedicalfoundation.rps;

public class RoundResult {
    private final String player1Name;
    private final Move player1Move;
    private final String player2Name;
    private final Move player2Move;
    private final GameResult result;

    public RoundResult(
            String player1Name, Move player1Move,
            String player2Name, Move player2Move,
            GameResult result
    ) {
        this.player1Name = player1Name;
        this.player1Move = player1Move;
        this.player2Name = player2Name;
        this.player2Move = player2Move;
        this.result = result;
    }

    public GameResult getResult() {
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s played %s, %s played %s. Result: %s",
                player1Name, player1Move,
                player2Name, player2Move,
                result);
    }
}
