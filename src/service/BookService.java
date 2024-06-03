package service;

import database.Database;
import model.Book;
import utils.MyScanner;

import java.util.UUID;

public class BookService {
    private int id;


    public static void shortInfoBookList() {
        if(Database.bookList.isEmpty()){
            System.out.println("Books not found");
        }
        else {
            Database.bookList.forEach(book -> {
                System.out.println(book.publicInfo());
            });
        }
    }

    public static void createBook() {
        System.out.println("Enter book title: ");
        String title = MyScanner.scanner_str.nextLine();
        System.out.println("Enter book author: ");
        String author = MyScanner.scanner_str.nextLine();
        System.out.println("Enter book description: ");
        String description = MyScanner.scanner_str.nextLine();
        System.out.print("Enter price: ");
        Double price = MyScanner.scanner_str.nextDouble();
        System.out.print("Enter book count: ");
        int count = MyScanner.scanner_num.nextInt();
        Book book = new Book(title,author,description,price,count);
        Database.bookList.add(book);
    }

    public static void updateBook() {
        bookList();
        System.out.println("Enter book id: ");
        String id = MyScanner.scanner_str.nextLine();
        UUID uuid = UUID.fromString(id);
        Book bookUp = null;
        for (Book book:Database.bookList){
            if(book.getId().equals(id)){
                bookUp=book;
            }
        }
        if(bookUp==null){
            System.out.println("Book not found");
        }else{
            System.out.print("Enter book title: ");
            String title = MyScanner.scanner_str.nextLine();
            System.out.print("Enter book author: ");
            String author = MyScanner.scanner_str.nextLine();
            System.out.print("Enter book price: ");
            Double price = MyScanner.scanner_str.nextDouble();
            bookUp.setTitle(title);
            bookUp.setAuthor(author);
            bookUp.setPrice(price);
            System.out.println("Book updated!");
        }
    }

    public static void deleteBook() {
        bookList();
        System.out.print("Enter book id: ");
        String id = MyScanner.scanner_str.nextLine();
        UUID uuid = UUID.fromString(id);
        boolean flag = Database.bookList.removeIf(book -> book.getId().equals(id));
        if(flag){
            System.out.println("Book deleted succesfuly deleted");
        }else {
            System.out.println("Book could not be deleted");
        }
    }

    public static void bookList() {
        if(Database.bookList.isEmpty()){
            System.out.println("Books not found");
        }
        Database.bookList.forEach(System.out::println);
    }
}
