package nl.hartwigmedicalfoundation.rps.player;

import nl.hartwigmedicalfoundation.rps.model.Move;

import java.util.function.Supplier;

public class ComputerPlayer implements Player {
    private final String name;
    private final Supplier<Move> moveSupplier;

    public ComputerPlayer(Supplier<Move> moveSupplier) {
        this.name = "Bot";
        this.moveSupplier = moveSupplier;
    }

    @Override
    public Move chooseMove() {
        return moveSupplier.get();
    }

    @Override
    public String getName() {
        return name;
    }
}
