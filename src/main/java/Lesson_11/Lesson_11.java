package Lesson_11;

// Класс исключения для неверного размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Класс исключения для неверных данных в массиве
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

// Класс для работы с массивом
class ArrayProcessor {

    // Метод для обработки двумерного массива
    public int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка на размер массива
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    // Преобразование строки в число
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Выброс исключение с деталями, если ошибка при преобразовании
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }
}

public class Lesson_11 {

    public static void main(String[] args) {
        // Массив
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Создание объекта для обработкм массива
        ArrayProcessor processor = new ArrayProcessor();

        try {
            int result = processor.processArray(array);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            // Обработка исключения для неверного размера массива
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            // Обработка исключения для неверных данных в ячейке
            System.out.println(e.getMessage());
        }
    }
}
