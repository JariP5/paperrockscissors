package nl.hartwigmedicalfoundation.rps.model;

public enum Move {
    ROCK, PAPER, SCISSORS;

    public boolean beats(Move opponent) {
        return (this == ROCK && opponent == SCISSORS)
                || (this == SCISSORS && opponent == PAPER)
                || (this == PAPER && opponent == ROCK);
    }
}