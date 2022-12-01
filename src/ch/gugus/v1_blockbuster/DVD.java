package ch.gugus.v1_blockbuster;

import java.util.Collection;

public class DVD extends Media {
    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    private int movieLength;
    public DVD(String title, int year, float price, int movieLength) {
        super(title, year, price);
        this.movieLength = movieLength;
    }
}
