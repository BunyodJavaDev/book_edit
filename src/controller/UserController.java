package controller;

import database.Database;
import enums.Role;
import model.Person;
import service.AdminService;
import service.UserService;
import utils.MyScanner;

public class UserController {
    public static void login() {
        System.out.print("Enter username: ");
        String username = MyScanner.scanner_str.nextLine();
        System.out.print("Enter your password: ");
        String password = MyScanner.scanner_str.nextLine();
        Person personBy = null;
        for (Person person: Database.personList){
            if(person.getName().equals(username) && person.getPassword().equals(password)){
                personBy=person;
            }
        }

        if(personBy!=null){
            if(personBy.getRole().equals(Role.USER)){
                UserService.start();
            } else if (personBy.getRole().equals(Role.ADMIN)) {
                AdminService.start();
            }
        }else {
            System.out.println("Invalid username or password");
        }
    }

    public static void register() {
        System.out.print("Enter user id: ");
        int id= MyScanner.scanner_num.nextInt();
        System.out.print("Enter user name: ");
        String name = MyScanner.scanner_str.nextLine();
        System.out.print("Enter user password: ");
        String password = MyScanner.scanner_str.nextLine();
        Database.personList.add(new Person(id,name,password));
        System.out.println("Person succesfuly created");

    }
}
