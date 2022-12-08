package ch.gugus.v2_football;

public class Attacker extends Player {
    int SpeedInMpS;

    public Attacker(String name) {
        super(name);
    }

    @Override
    public int getRoleSeasonData() {
        return SpeedInMpS;
    }

    public void setSpeedInMpS(int speedInMpS) {
        SpeedInMpS = speedInMpS;
    }
}
