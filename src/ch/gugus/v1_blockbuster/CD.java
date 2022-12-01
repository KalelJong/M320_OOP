package ch.gugus.v1_blockbuster;

public class CD extends  Media{
    private int bandName;
    public CD(String title, int year, float price, int bandName) {
        super(title, year, price);
        this.bandName = bandName;
    }
}
