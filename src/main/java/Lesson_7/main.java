package Lesson_7;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // task 1
        System.out.println(task1.isSumBetween10And20(10, 5)); // true

        // task 2
        task2.checkPositiveOrNegative(-5); // Число отрицательное.

        // task 3
        System.out.println(task3.isNegative(0)); // false

        // task 4
        task4.printStringNTimes("Hello", 3);

        // task 5
        System.out.println(task5.isLeapYear(2024)); // true

        // task 6
        int[] array = {1, 0, 1, 0, 1};
        task6.invertArray(array);
        System.out.println(Arrays.toString(array)); // [0, 1, 0, 1, 0]

        // task 7
        int[] filledArray = task7.fillArray();
        System.out.println(Arrays.toString(filledArray));

        // task 8
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task8.multiplyIfLessThanSix(numbers);
        System.out.println(Arrays.toString(numbers)); // Числа < 6 умножены на 2

        // task 9
        int[][] matrix = task9.fillDiagonal(5);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
