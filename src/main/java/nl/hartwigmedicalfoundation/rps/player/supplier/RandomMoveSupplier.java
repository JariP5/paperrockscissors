package nl.hartwigmedicalfoundation.rps.player.supplier;

import nl.hartwigmedicalfoundation.rps.model.Move;

import java.util.Random;
import java.util.function.Supplier;

public class RandomMoveSupplier implements Supplier<Move> {
    private final Random random = new Random();

    @Override
    public Move get() {
        return Move.values()[random.nextInt(Move.values().length)];
    }
}

