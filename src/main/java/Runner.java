import db.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Author author1 = new Author("Iain Banks");
        DBHelper.save(author1);

        Author author2 = new Author("Muriel Spark");
        DBHelper.save(author2);

        Book book1 = new Book("The Wasp Factory", author1);
        DBHelper.save(book1);

        Book book2 = new Book("The Prime of Miss Jean Brodie", author2);
        DBHelper.save(book2);

        book1.setTitle("Complicity");
        DBHelper.update(book1);

        DBHelper.deleteById(book2.getId(),"Book");

        List<Book> books = DBHelper.getAll("Book");

        List<Author> authors = DBHelper.getAll("Author");

    }
}
