package GenericList;/*
 * Name: Arrhat Maharjan
 * Student ID: 3091663
 *
 */

import java.util.ArrayList;
import java.util.Comparator;

public class TestMyGenericList {
    public static void main(String[] args) {
        //initial list
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        bookList.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
        MyGenericList<Book> books = new MyGenericList<>();
        //test for addAll() and add() method
        System.out.println("Adding 6 Books...");
        books.addAll(bookList);
        books.add(new Book("Adventures of Huckleberry Finn", "Mark Twain"));
        //test for get() method
        System.out.println("Getting the book 'The Great Gatsby' using index 2:");
        System.out.println(books.get(2));
        //test for remove() and indexOf()
        System.out.println("Removing 'The Great Gatsby'.");
        books.remove(books.indexOf(new Book("The Great Gatsby", "F. Scott Fitzgerald")));
        System.out.println(books);
        //test of size()
        System.out.println("There are " + books.size() + " Books in the List.");
        //test for clear()
        System.out.println("Clearing list.");
        books.clear();
        //test for isEmpty()
        System.out.println("Is the list empty?: " + books.isEmpty());
        //adding again
        System.out.println("Adding 6 Books...");
        books.addAll(bookList);
        books.add(new Book("Adventures of Huckleberry Finn", "Mark Twain"));
        //testing contains()
        System.out.print("Does the list have the 'Adventures of Huckleberry Finn'?: ");
        System.out.println(books.contains(new Book("Adventures of Huckleberry Finn", "Mark Twain")));
        System.out.print("Does the list have the 'Moby Dick'?: ");
        System.out.println(books.contains(new Book("Moby Dick", "Herman Melville")));
        //test for sort
        //making a comparator to compare authors
        Comparator<Book> authorCompare = Comparator.comparing(Book::author);
        System.out.println("Before sorting by author name: ");
        //testing toString()
        System.out.println(books.toString());
        System.out.println("After sorting by author name: ");
        books.sort(authorCompare);
        System.out.println(books.toString());
        //testing toArray()
        Book[] bookArray = books.toArray(new Book[books.size()]);
        //should show code since its not using Arrays.toString()
        System.out.println("Printing array without Arrays.toString()...");
        System.out.println("Confirmation of change to array: " + bookArray);
        //testing iterator
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
