package sport.obstracles.impl;

import sport.obstracles.Obstacle;
import sport.participants.Participant;

public class Racetrack implements Obstacle {

    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(length, "racetrack");
    }
}
