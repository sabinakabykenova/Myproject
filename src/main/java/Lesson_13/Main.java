package Lesson_13;

public class Main {
    public static void main(String[] args) {
        // Создаем объект справочника
        ContactBook contactBook = new ContactBook();

        // Добавляем записи
        contactBook.add("Жолдыбаев", "459-658-789");
        contactBook.add("Ермеков", "698-654-321");
        contactBook.add("Жолдыбаев", "321-874-698");

        // Получаем телефоны по фамилии
        System.out.println("Телефоны Жолдыбаева: " + contactBook.get("Жолдыбаев"));
        System.out.println("Телефоны Ермеков: " + contactBook.get("Ермеков"));
        System.out.println("Телефоны Арманова: " + contactBook.get("Арманов"));

        Array.main(args);
    }
}
