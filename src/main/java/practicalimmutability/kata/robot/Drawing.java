package practicalimmutability.kata.robot;

import io.vavr.collection.Iterator;

public class Drawing {
    /**
     * Get city map drawing as ASCII-Art
     */
    public static String cityMapDrawing(final CityMap cityMap) {
        return cityMap.rows().map(row ->
                row.map(Tile::toCode).mkString()
        ).mkString("\n");
    }

    /**
     * Get scene drawing as ASCII-Art
     */
    public static String sceneDrawing(final Scene scene) {
        final String robotStatus = robotStatusDrawing(scene.robot());
        final String sceneGrid = sceneGridDrawing(scene);
        return robotStatus + "\n" + sceneGrid;
    }

    private static String robotStatusDrawing(final Robot robot) {
        final String directionStatus = Character.toString(robot.direction().toCode());
        final String breakerStatus = robot.breaker() ? "B" : "-";
        final String invertedStatus = robot.inverted() ? "I" : "-";
        final String priorities = robot.priorities().map(Direction::toCode).mkString();
        final String deadStatus = robot.dead() ? "$" : "-";
        return String.format("| %s | %s | %s (%s) | %s |", directionStatus, breakerStatus, invertedStatus, priorities, deadStatus);
    }

    private static String sceneGridDrawing(final Scene scene) {
        final CityMap cityMap = scene.cityMap();
        final Robot robot = scene.robot();

        return Iterator.range(0, cityMap.rows().size()).map(y ->
                Iterator.range(0, cityMap.rows().get(y).size()).map(x -> {
                    final Position position = Position.of(x, y);
                    return robot.position().equals(position) ? '*' : cityMap.tile(position).toCode();
                }).mkString()).mkString("\n");
    }
}
