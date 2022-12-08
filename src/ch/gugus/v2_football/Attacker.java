package ch.gugus.v2_football;

public class Attacker extends Player {
    int speedInMpS;

    public Attacker(String name) {
        super(name);
    }

    @Override
    public int getRoleSeasonData() {
        return speedInMpS;
    }

    public void setSpeedInMpS(int speedInMpS) {
        this.speedInMpS = speedInMpS;
    }
}
