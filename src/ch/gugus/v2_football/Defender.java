package ch.gugus.v2_football;

public class Defender extends Player {
    int defendedLine;

    public Defender(String name) {
        super(name);
    }

    @Override
    public int getRoleSeasonData() {
        return defendedLine;
    }

    public void setDefendedLine(int defendedLine) {
        this.defendedLine = defendedLine;
    }
}
