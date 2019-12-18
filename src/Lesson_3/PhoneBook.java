package Lesson_3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber){//добавляем контакт в книгу
        HashSet<String> pBook = phoneBook.getOrDefault(name, new HashSet<>());
        pBook.add(phoneNumber);
        phoneBook.put(name, pBook);
    }
    public void printContact(String name){//метод поиска по имени контакта
        System.out.println("Имя контакта: " + name + " // Номер телефона " + phoneBook.getOrDefault(name, new HashSet<>()));
    }

    public static void main(String[] args) {//точка входа
        PhoneBook phoneBook = new PhoneBook();//создаем новую книгу
        phoneBook.addContact("Павел", "+79321230823");
        phoneBook.addContact("Артём", "+79121234567");
        phoneBook.addContact("Павел", "+7915736856");
        phoneBook.addContact("Александр", "+79550523515");
        phoneBook.addContact("Александр", "+79250533525");
        //поиск телефонов по имени контакта
        phoneBook.printContact("Павел");
        phoneBook.printContact("Артём");
        phoneBook.printContact("Александр");


    }

}
