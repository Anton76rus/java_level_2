package geekbrains.homework.collections.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    HashMap<String, Person> phoneBook = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    void putPerson(String lastName, String email, String numberPhone) {
        if (phoneBook.containsKey(lastName)) {
            System.out.println("A person with last name " + lastName + " already exist." +
                    "\nDo you want to overwrite the data for this last name?" +
                    "\n\nEnter \"yes\" to overwrite or \"no\" to exit");
            String reply;
            do {
                reply = scanner.nextLine();
                switch (reply) {
                    case ("yes"):
                        phoneBook.put(lastName, new Person(email, numberPhone));
                        System.out.println("Data by last name " + lastName + " were overwritten");
                        return;
                    case ("no"):
                        return;
                    default:
                        System.out.println("Command not found or entered incorrectly" +
                                "\n\nEnter \"yes\" to overwrite or \"no\" to exit");
                }
            } while (true);
        }
        phoneBook.put(lastName, new Person(email, numberPhone));
    }

    void printPhoneNumbers(String lastName) {
        System.out.println(lastName + " has following phone numbers - "
                + getPhoneNumbers(lastName));
    }

    void printEmail(String lastName) {
        System.out.println(lastName + " has following e-mail address - "
                + getEmail(lastName));
    }

    String getEmail(String lastName) {
        return phoneBook.get(lastName).getEmail();
    }

    ArrayList<String> getPhoneNumbers(String lastName) {
        return phoneBook.get(lastName).getListPhoneNumbers();
    }

    public void info() {
        phoneBook.forEach((s, person) -> {
            System.out.println("Surname - " + s + "," + person.toString());
        });
    }
}
