package nl.hartwigmedicalfoundation.rps.model;

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
        return formatResultMessage();
    }

    private String formatResultMessage() {
        return switch (result) {
            case WIN_PLAYER_1 -> String.format("%s played %s, %s played %s. %s wins!",
                    player1Name, player1Move,
                    player2Name, player2Move, player1Name);
            case WIN_PLAYER_2 -> String.format("%s played %s, %s played %s. %s wins!",
                    player1Name, player1Move,
                    player2Name, player2Move, player2Name);
            case DRAW -> String.format("%s played %s, %s played %s. It's a draw!",
                    player1Name, player1Move,
                    player2Name, player2Move);
        };
    }
}
