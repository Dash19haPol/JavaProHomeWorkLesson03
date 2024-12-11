package sport.obstracles.impl;

import sport.obstracles.Obstacle;
import sport.participants.Participant;

public class Wall implements Obstacle {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height, "wall");
    }
}
