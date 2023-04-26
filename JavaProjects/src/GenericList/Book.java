package GenericList;/*
 * Name: Arrhat Maharjan
 * Student ID: 3091663
 *
 */

class Book {
    //instance variables
    private String title;
    private String author;

    //constructor
    public Book(String t, String a) {
        title = t;
        author = a;
    }

    //getters
    public String title() {
        return title;
    }

    public String author() {
        return author;
    }

    //equals
    public boolean equals(Object ob) {
        //return false if ob is a Book
        if (!(ob instanceof Book)) return false;
        //cast ob to a Book
        Book b = (Book) ob;
        //return true if the title and author are the same
        return title.equals(b.title) && author.equals(b.author);
    }

    public int hashCode() {
        return 31 * title.hashCode() * author.hashCode();
    }

    public String toString() {
        return title + " " + author;
    }
}