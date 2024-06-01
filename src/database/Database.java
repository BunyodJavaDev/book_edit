package database;

import enums.Role;
import model.Book;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class Database {
    public static List<Person> personList = new ArrayList<>();
    public static List<Book> bookList = new ArrayList<>();


    static {
        Person person = new Person(1,"person","person");
        Person admin = new Person(2,"admin","admin",Role.ADMIN);
        personList.add(person);
        personList.add(admin);

        Book book = new Book("Java","Bunyod","Java OOP",9000d,8);
        Book book1 = new Book("Javascript","Vali","Telegram bot",6000d,9);
        bookList.add(book);
        bookList.add(book1);
    }
}
