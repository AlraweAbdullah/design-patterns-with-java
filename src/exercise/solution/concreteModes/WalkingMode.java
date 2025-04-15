package exercise.solution.concreteModes;

import be.abullah.state.exercise.solution.TravelMode;

public class WalkingMode implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
