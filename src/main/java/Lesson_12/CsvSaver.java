package Lesson_12;

import java.io.FileWriter;
import java.io.IOException;

public class CsvSaver {

    public void save(AppData appData, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Заголовки: ");
            for (String header : appData.header) {
                System.out.print(header + " ");
            }
            System.out.println("\nДанные:");
            for (int[] row : appData.data) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < appData.header.length; i++) {
                writer.write(appData.header[i]);
                if (i < appData.header.length - 1) writer.write(";");
            }
            writer.write("\n");

            for (int[] row : appData.data) {
                for (int i = 0; i < row.length; i++) {
                    writer.write(row[i]);
                    if (i < row.length - 1) writer.write(";");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
