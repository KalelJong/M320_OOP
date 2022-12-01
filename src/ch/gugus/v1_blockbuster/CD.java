package ch.gugus.v1_blockbuster;

public class CD extends  Media{
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    private String bandName;
    public CD(String title, int year, float price, String bandName) {
        super(title, year, price);
        this.bandName = bandName;
    }
}
