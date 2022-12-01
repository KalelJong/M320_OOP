package ch.gugus.v1_blockbuster;

public class DVD extends Media{
    private int movieLength;
    public DVD(String title, int year, float price, int movieLength) {
        super(title, year, price);
        this.movieLength = movieLength;
    }
}
