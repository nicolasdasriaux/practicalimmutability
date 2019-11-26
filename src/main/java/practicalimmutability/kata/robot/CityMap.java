package practicalimmutability.kata.robot;

import io.vavr.collection.*;
import io.vavr.control.Option;
import org.immutables.value.Value;
import practicalimmutability.kata.robot.Tile.Empty;
import practicalimmutability.kata.robot.Tile.Start;
import practicalimmutability.kata.robot.Tile.Teleporter;

import java.util.function.Function;
import java.util.function.Predicate;

@Value.Immutable(prehash = true)
public abstract class CityMap {
    /**
     * Seq of rows, each row is a seq of tiles
     * Coordinate y is the row index.
     * Coordinate x is the column index.
     */
    public abstract IndexedSeq<IndexedSeq<Tile>> rows();

    /**
     * Start position of robot
     */
    public abstract Position start();

    /**
     * Teleporter positions (exactly 2)
     */
    public abstract Seq<Position> teleporters();

    /**
     * Get tile at position
     *
     * Difficulty: *
     * Hints:
     * Use {@link IndexedSeq#get(int)}
     */
    public Tile tile(final Position position) {
        return io.vavr.API.TODO();
    }

    /**
     * Get out-teleporter position from in-teleporter position
     *
     * Difficulty: *
     * Hints:
     * Use {@link Seq#find(Predicate)}
     * Use {@link Option#get()}
     */
    public Position teleporterOutPosition(final Position inPosition) {
        return io.vavr.API.TODO();
    }

    /**
     * Break obstacle at position
     *
     * Difficulty: **
     * Hints:
     * Use {@link IndexedSeq#update(int, Function)}
     */
    public CityMap breakObstacle(final Position position) {
        return io.vavr.API.TODO();
    }

    /**
     * Create a city map from a seq of lines
     *
     * Difficulty: **
     * Hints:
     * Use {@link CharSeq#of(CharSequence)} to wrap a <code>String</code> into a <code>CharSeq</code>
     * Use {@link CharSeq#map(Function)}
     * Use {@link IndexedSeq#map(Function)}
     * Use {@link #findPosition(IndexedSeq, Tile)} and {@link IndexedSeq#head()} to find start position
     * Use {@link #findPosition(IndexedSeq, Tile)} to find teleporter positions
     */
    public static CityMap fromLines(final IndexedSeq<String> lines) {
        return io.vavr.API.TODO();
    }

    /**
     * Create a city map from lines
     *
     * Difficulty: *
     * Hints:
     * Use {@link Array#of(Object[])}
     * Use {@link #fromLines(IndexedSeq)}
     */
    public static CityMap fromLines(final String... lines) {
        return io.vavr.API.TODO();
    }

    /**
     * Get all positions of a tile
     *
     * Difficulty: ****
     * Hints:
     * Use {@link Iterator#range(int, int)} to get an iterator over y coordinate (rows) and an iterator over x coordinate (columns)
     * Use {@link Iterator#flatMap(Function)} to combine both iterators over y and x coordinates into a single iterator
     * Use {@link Iterator#filter(Predicate)} to identify matching tiles
     * Use {@link Iterator#map(Function)} to transform x an y coordinates to positions
     * Use {@link IndexedSeq#get(int)} to access rows and tiles
     * Use {@link Iterator#toList()} to run iterator and get a list of positions
     */
    private static Seq<Position> findPosition(final IndexedSeq<IndexedSeq<Tile>> rows, final Tile tile) {
        return io.vavr.API.TODO();
    }
}
