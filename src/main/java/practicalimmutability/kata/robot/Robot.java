package practicalimmutability.kata.robot;

import io.vavr.collection.List;
import io.vavr.collection.Seq;
import io.vavr.control.Option;
import org.immutables.value.Value;
import practicalimmutability.kata.robot.Tile.BreakableObstacle;
import practicalimmutability.kata.robot.Tile.Obstacle;

import java.util.function.Predicate;

import static practicalimmutability.kata.robot.Direction.*;

@Value.Immutable
public abstract class Robot {
    /**
     * Current position of robot
     */
    public abstract Position position();

    /**
     * Current direction of robot
     */
    public abstract Direction direction();

    /**
     * Breaker mode
     */
    public abstract boolean breaker();

    /**
     * Priority inversion mode
     */
    public abstract boolean inverted();

    /**
     * Dead (or alive)
     * https://www.youtube.com/watch?v=PGNiXGX2nLU&feature=youtu.be&t=12
     */
    public abstract boolean dead();

    /**
     * Change direction of robot
     *
     * Difficulty: *
     */
    public Robot changeDirection(final Direction direction) {
        return io.vavr.API.TODO();
    }

    /**
     * Toggle breaker mode of robot
     *
     * Difficulty: *
     */
    public Robot toggleBreaker() {
        return io.vavr.API.TODO();
    }

    /**
     * Toggle priority inversion of robot
     *
     * Difficulty: *
     */
    public Robot invert() {
        return io.vavr.API.TODO();
    }

    /**
     * Turn robot to dead
     *
     * Difficulty: *
     */
    public Robot die() {
        return io.vavr.API.TODO();
    }

    /**
     * Non-inverted priorities
     *
     * Difficulty: *
     * Hints:
     * Use {@link List#of(Object[])}
     */
    public static final Seq<Direction> PRIORITIES =
            io.vavr.API.TODO();

    /**
     * Inverted priorities
     *
     * Difficulty: *
     * Hints:
     * Use {@link #PRIORITIES}
     * Use {@link Seq#reverse()}
     */
    public static final Seq<Direction> INVERTED_PRIORITIES =
            io.vavr.API.TODO();

    /**
     * Get current robot priorities
     *
     * Difficulty: *
     * Hints:
     * Use {@link #PRIORITIES}
     * Use {@link #INVERTED_PRIORITIES}
     */
    public Seq<Direction> priorities() {
        return io.vavr.API.TODO();
    }

    /**
     * Move robot on a city map
     * Robot keeps the same direction and move if no obstacle in this direction.
     * Otherwise robot changes direction (following its current priorities) and move to where first there is no obstacle.
     *
     * Difficulty: **
     * Hints:
     * Use {@link Seq#find(Predicate)}
     * Use {@link #obstacleInDirection(Direction, CityMap)}
     * Use {@link Option#get()}
     */
    public Robot move(final CityMap cityMap) {
        return io.vavr.API.TODO();
    }

    /**
     * Determine whether there is an obstacle or not for the robot in a direction on a city map
     *
     * Difficulty: *
     * Hints:
     * Use {@link #obstacle(Tile)}
     */
    private boolean obstacleInDirection(final Direction direction, final CityMap cityMap) {
        return io.vavr.API.TODO();
    }

    /**
     * Determine whether or not a tile is currently an obstacle for the robot
     * Remind that a breakable obstacle ceases to be an obstacle when robot is in breaker mode.
     *
     * Difficulty: *
     * Hints:
     * Use {@link #breaker()}
     */
    private boolean obstacle(final Tile tile) {
        return io.vavr.API.TODO();
    }

    /**
     * Trigger teleporter at current position and teleport robot to destination
     */
    public Robot triggerTeleporter(final CityMap cityMap) {
        return io.vavr.API.TODO();
    }

    /**
     * Create a robot in initial state (at start position, south directed, no alteration, alive)
     *
     * Difficulty: *
     */
    public static Robot fromStart(final Position position) {
        return io.vavr.API.TODO();
    }
}
