package ch.gugus.v1_blockbuster;

public class Book extends Media{
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    private String ISBN;
    public Book(String title, int year, float price, String ISBN) {
        super(title, year, price);
        this.ISBN = ISBN;
    }
}
