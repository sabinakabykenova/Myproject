package Lesson_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvLoader {

    public AppData load(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Чтение заголовков
            String line = reader.readLine();
            String[] header = line.split(";");
            System.out.println("Заголовки: ");
            for (String h : header) {
                System.out.print(h + " ");
            }
            System.out.println();

            // Чтение данных
            String[] tempData = reader.lines().toArray(String[]::new);
            int[][] data = new int[tempData.length][header.length];

            // Преобразование строки данных в целые числа
            for (int i = 0; i < tempData.length; i++) {
                String[] values = tempData[i].split(";");
                System.out.println("Чтение данных: " + tempData[i]);  // Вывод данных, которые считываются
                for (int j = 0; j < values.length; j++) {
                    try {
                        data[i][j] = Integer.parseInt(values[j]);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка преобразования в число: " + values[j] + " (строка " + (i + 1) + ", столбец " + (j + 1) + ")");
                        data[i][j] = 0;  // Если ошибка, заменим на 0
                    }
                }
            }

            return new AppData(header, data);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return null;
        }
    }
}
