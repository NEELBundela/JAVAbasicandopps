package opps.Aggregation;

public class Main {
    public static void main(String[] args) {

        //Aggregation- ite represents a "has-a" relationship between objects

        Book book =new Book("Programming in ANSI c",560);
        Book book2 = new Book("DSA with java",500);
        Book book3 = new Book("Head First java",700);

        Book[] books = {book,book2,book3};

        Library library =new Library("MJ Library",1970,books);

        library.show();
    }
}
