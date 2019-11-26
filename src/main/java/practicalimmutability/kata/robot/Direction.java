package practicalimmutability.kata.robot;

public enum Direction {
    North,
    South,
    West,
    East;

    /**
     * Get the code for this direction
     *
     * Difficulty: *
     */
    public char toCode() {
        return io.vavr.API.TODO();
    }

    /**
     * Get a direction from a code
     *
     * Difficulty: *
     */
    public static Direction fromCode(final char code) {
        return io.vavr.API.TODO();
    }
}
