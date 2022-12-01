package ch.gugus.v1_blockbuster;

public class Media {
    private String title;
    private int year;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Media(String title, int year, float price)
    {
        this.title = title;
        this.year = year;
        this.price = price;
    }
}
