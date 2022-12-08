package ch.gugus.v2_football;

public class Defender extends Player {
    int DefendedLine;

    public Defender(String name) {
        super(name);
    }

    @Override
    public int getRoleSeasonData() {
        return DefendedLine;
    }

    public void setDefendedLine(int defendedLine) {
        this.DefendedLine = defendedLine;
    }
}
