package com.homework;

public class Lesson6 {

    // Задание 2: Метод, который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 3: Метод для проверки суммы a и b
    public static void checkSumSign() {
        int a = 5; // Пример значений
        int b = -3; // Пример значений
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 4: Метод для проверки цвета по значению
    public static void printColor() {
        int value = 50; // Пример значения

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 5: Метод для сравнения двух чисел
    public static void compareNumbers() {
        int a = 7; // Пример значения
        int b = 3; // Пример значения

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Метод main для вызова всех методов
    public static void main(String[] args) {
        printThreeWords(); // Вызов метода из задания 2
        checkSumSign(); // Вызов метода из задания 3
        printColor(); // Вызов метода из задания 4
        compareNumbers(); // Вызов метода из задания 5
    }
}