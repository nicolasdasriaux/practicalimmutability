package practicalimmutability.kata.robot;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Position {
    /**
     * Column coordinate (x)
     */
    @Value.Parameter
    public abstract int x();

    /**
     * Row coordinate (y)
     */
    @Value.Parameter
    public abstract int y();

    /**
     * Get position when moving to a direction
     *
     * Difficulty: *
     */
    public Position move(final Direction direction) {
        return io.vavr.API.TODO();
    }

    /**
     * Create a position
     *
     * Difficulty: *
     */
    public static Position of(final int x, final  int y) {
        return io.vavr.API.TODO();
    }
}
