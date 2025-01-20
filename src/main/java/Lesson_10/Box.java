package Lesson_10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    // Метод для добавления фрукта в коробку
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Метод для вычисления веса коробки
    public float getWeight() {
        float weight = 0;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f; // вес яблока
            } else if (fruit instanceof Orange) {
                weight += 1.5f; // вес апельсина
            }
        }
        return weight;
    }

    // Метод для сравнения коробок по весу
    public boolean compare(Box<Orange> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    // Метод для пересыпания фруктов из одной коробки в другую
    public void transferFruitsTo(Box<T> otherBox) {
        if (this.fruits.get(0) instanceof Apple && otherBox.fruits.size() > 0 && !(otherBox.fruits.get(0) instanceof Apple)) {
            System.out.println("Невозможно пересыпать яблоки в коробку с апельсинами");
            return;
        }
        if (this.fruits.get(0) instanceof Orange && otherBox.fruits.size() > 0 && !(otherBox.fruits.get(0) instanceof Orange)) {
            System.out.println("Невозможно пересыпать апельсины в коробку с яблоками");
            return;
        }

        // Пересыпаем фрукты в другую коробку
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear(); // После пересыпания в текущей коробке не остается фруктов
    }
}
