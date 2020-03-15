package geekbrains.homework.collections.phonebook;

public class MainBook {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.putPerson("Yazgevich", "yazgevich@mail.ru", "+79806569561");
        phoneBook.putPerson("Ivanov", "ivanov76@yandex.ru", "+79996523245 +79625325517");
        phoneBook.putPerson("Ronaldo", "soccerchpoker@gmail.com", "+74852322477");
        phoneBook.putPerson("Yazgevich", "runner76rus@gmail.ru", "+79653255514");

        phoneBook.printPhoneNumbers("Ivanov");
        phoneBook.printEmail("Yazgevich");
        phoneBook.info();
    }
}
