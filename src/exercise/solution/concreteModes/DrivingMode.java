package exercise.solution.concreteModes;

import be.abullah.state.exercise.solution.TravelMode;

public class DrivingMode implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }
}
