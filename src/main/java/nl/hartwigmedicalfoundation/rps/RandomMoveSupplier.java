package nl.hartwigmedicalfoundation.rps;

import java.util.Random;
import java.util.function.Supplier;

public class RandomMoveSupplier implements Supplier<Move> {
    private final Random random = new Random();

    @Override
    public Move get() {
        return Move.values()[random.nextInt(Move.values().length)];
    }
}

