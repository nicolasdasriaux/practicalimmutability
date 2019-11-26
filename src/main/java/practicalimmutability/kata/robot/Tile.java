package practicalimmutability.kata.robot;

import org.immutables.value.Value;

public interface Tile {
    @Value.Immutable(singleton = true)
    abstract class Empty implements Tile {
        public static Empty of() {
            return ImmutableEmpty.of();
        }
    }

    @Value.Immutable(singleton = true)
    abstract class Start implements Tile {
        public static Start of() {
            return ImmutableStart.of();
        }
    }

    @Value.Immutable(singleton = true)
    abstract class Booth implements Tile {
        public static Booth of() {
            return ImmutableBooth.of();
        }
    }

    @Value.Immutable(singleton = true)
    abstract class Obstacle implements Tile {
        public static Obstacle of() {
            return ImmutableObstacle.of();
        }
    }

    @Value.Immutable(singleton = true)
    abstract class BreakableObstacle implements Tile {
        public static BreakableObstacle of() {
            return ImmutableBreakableObstacle.of();
        }
    }

    @Value.Immutable
    abstract class DirectionModifier implements Tile {
        @Value.Parameter
        public abstract Direction direction();

        public static DirectionModifier of(final Direction direction) {
            return ImmutableDirectionModifier.of(direction);
        }
    }

    @Value.Immutable(singleton = true)
    abstract class CircuitInverter implements Tile {
        public static CircuitInverter of() {
            return ImmutableCircuitInverter.of();
        }
    }

    @Value.Immutable(singleton = true)
    abstract class Beer implements Tile {
        public static Beer of() {
            return ImmutableBeer.of();
        }
    }

    @Value.Immutable(singleton = true)
    abstract class Teleporter implements Tile {
        public static Teleporter of() {
            return ImmutableTeleporter.of();
        }
    }

    /**
     * Get the code for this tile
     *
     * Difficulty: *
     */
    default char toCode() {
        return io.vavr.API.TODO();
    }

    /**
     * Get tile from a code
     *
     * Difficulty: *
     */
    static Tile fromCode(final char code) {
        return io.vavr.API.TODO();
    }
}
