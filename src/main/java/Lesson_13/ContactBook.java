package Lesson_13;

import java.util.*;

public class ContactBook {
    private Map<String, List<String>> contacts;

    public ContactBook() {
        contacts = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        contacts.putIfAbsent(lastName, new ArrayList<>());
        contacts.get(lastName).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, Collections.emptyList());
    }
}
