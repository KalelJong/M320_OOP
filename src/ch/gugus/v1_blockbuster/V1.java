package ch.gugus.v1_blockbuster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class V1 {
    public void run(){
        DVD dvd = new DVD("Paul Blart, Mall Cop", 2007, 20f, 120);
        CD cd = new CD("OK Computer", 1997, 20f, "Radiohead");
        Book book = new Book("Solitaire Mystery", 1990, 20f, "9781858816364");

        ArrayList<Media> mediaList  = new ArrayList<>();
        mediaList.add(dvd);
        mediaList.add(cd);
        mediaList.add(book);

        while (true){
            String extraProperty = "";
            String path = "ch.gugus.v1+";
            for (var media : mediaList) {
                if (media.getClass() == DVD.class){
                    DVD dvd1 = (DVD) media;
                    extraProperty = Integer.toString(dvd1.getMovieLength());
                } else if (media.getClass() == CD.class) {
                    CD cd1 = (CD) media;
                    extraProperty = cd1.getBandName();
                }else{
                    Book book1 = (Book) media;
                    extraProperty = book1.getISBN();
                }
                System.out.println("[" + mediaList.indexOf(media) + "] " + media.getTitle() + " " + media.getPrice() +
                        " " + media.getYear() + " " + extraProperty);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Select number of media to delete");
            int mediaToDelete = scanner.nextInt();
            mediaList.remove(mediaToDelete);
        }



    }
}
