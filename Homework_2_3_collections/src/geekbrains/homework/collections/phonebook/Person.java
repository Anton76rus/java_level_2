package geekbrains.homework.collections.phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private String email;
    private ArrayList<String> listPhoneNumbers;

    public Person(String email, String phoneNumbers) {
        this.email = email;
        listPhoneNumbers = putPhoneNumber(phoneNumbers);
    }

    private ArrayList<String> putPhoneNumber(String strNumber) {
        return new ArrayList<>(Arrays.asList(strNumber.split(" ")));
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getListPhoneNumbers() {
        return listPhoneNumbers;
    }

    @Override
    public String toString() {
        return " email - " + email + " , phone number - " + listPhoneNumbers.toString();
    }

}
