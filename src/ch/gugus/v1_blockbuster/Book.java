package ch.gugus.v1_blockbuster;

public class Book extends Media{
    private String ISBN;
    public Book(String title, int year, float price, String ISBN) {
        super(title, year, price);
        this.ISBN = ISBN;
    }
}
