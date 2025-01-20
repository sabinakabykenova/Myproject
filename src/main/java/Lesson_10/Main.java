package Lesson_10;

public class Main {
    public static void main(String[] args) {
        // Создать коробки для яблок и апельсинов
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        // Добавляем фрукты в коробки
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        // Проверка веса коробок
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        // Сравнение коробки
        System.out.println("Коробки одинаковы по весу? " + appleBox.compare(orangeBox));

        // Пересыпаем фрукты из одной коробки в другую
        Box<Apple> newAppleBox = new Box<>();
        appleBox.transferFruitsTo(newAppleBox);
        System.out.println("Коробка с яблоками после пересыпания: " + newAppleBox.getWeight());
    }
}
