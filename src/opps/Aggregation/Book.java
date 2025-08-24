package opps.Aggregation;

public class Book {
    String title;
    int pages;

    Book(String title,int pages)
    {
        this.title = title;
        this.pages = pages;
    }

    String show(){
        return "The " + this.title + " " + this.pages + " pages";
    }
}
