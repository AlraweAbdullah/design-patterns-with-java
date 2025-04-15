package exercise.solution;

import be.abullah.state.exercise.solution.concreteModes.BicyclingMode;

public class Demo {
    public static void main(String[] args) {
        var directionService = new DirectionService(new BicyclingMode());

        directionService.getDirection();
        directionService.getEta();
    }
}
