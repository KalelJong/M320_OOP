package ch.gugus.v2_football;

public class Goalie extends Player {
    double KoerperGroesse;
    int HeldBalls;

    public Goalie(String name) {
        super(name);
    }

    @Override
    public int getRoleSeasonData() {
        return HeldBalls;
    }

    public void setHeldBalls(int heldBalls) {
        this.HeldBalls = heldBalls;
    }

    public double getKoerperGroesse() {
        return KoerperGroesse;
    }

    public void setKoerperGroesse(double koerperGroesse) {
        this.KoerperGroesse = koerperGroesse;
    }
}
