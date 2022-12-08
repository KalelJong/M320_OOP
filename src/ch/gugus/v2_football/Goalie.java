package ch.gugus.v2_football;

public class Goalie extends Player {
    double koerperGroesse;
    int heldBalls;

    public Goalie(String name) {
        super(name);
    }

    @Override
    public int getRoleSeasonData() {
        return heldBalls;
    }

    public void setHeldBalls(int heldBalls) {
        this.heldBalls = heldBalls;
    }

    public double getKoerperGroesse() {
        return koerperGroesse;
    }

    public void setKoerperGroesse(double koerperGroesse) {
        this.koerperGroesse = koerperGroesse;
    }
}
