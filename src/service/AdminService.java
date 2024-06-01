package service;

import controller.MainController;
import utils.MyScanner;

public class AdminService {
    public static void start(){
        boolean flag = true;
        while (flag){
            menu();
            int num = MyScanner.scanner_num.nextInt();
            switch (num){
                case 1:
                    BookService.createBook();
                    break;
                case 2:
                    BookService.updateBook();
                    break;
                case 3:
                    BookService.deleteBook();
                    break;
                case 4:
                    BookService.bookList();
                    break;
                case 0:
                    MainController.start();
                    break;
            }

        }
    }

    private static void menu() {
        System.out.println("\nAdmin Menu\n");
        System.out.println("1 --- Add book");
        System.out.println("2 --- Update book");
        System.out.println("3 --- Delete book");
        System.out.println("4 --- Book list");
        System.out.println("0 --- Back to main menu");
        System.out.print("Enter your choice: ");
    }
}
