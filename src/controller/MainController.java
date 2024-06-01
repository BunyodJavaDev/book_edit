package controller;

import service.BookService;
import utils.MyScanner;

public class MainController {
    public static void start(){
        boolean flag = true;
        while (flag) {
            menu();
            int num = MyScanner.scanner_num.nextInt();
            switch (num){
                case 1:
                    UserController.login();
                    break;
                case 2:
                    UserController.register();
                    break;
                case 3:
                    BookService.shortInfoBookList();
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("\nMain menu\n");
        System.out.println("1 --- Login");
        System.out.println("2 --- Register");
        System.out.println("3 --- BookInfo");
        System.out.println("0 --- Exit");
        System.out.print("Enter your choice: ");
    }
}
