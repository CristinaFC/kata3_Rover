package refactoring;

import java.util.Objects;
import java.util.Random;

import static refactoring.Rover.Position;
import static refactoring.Rover.obstacles;

public class Obstacle {

    private final Position position;

    public Obstacle(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

}
