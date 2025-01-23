package Lesson_12;

public class Main {
    public static void main(String[] args) {
        // Создание данных
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        AppData appData = new AppData(header, data);

        // Сохранение в CSV
        CsvSaver csvSaver = new CsvSaver();
        csvSaver.save(appData, "data.csv");

        // Загрузка на CSV
        CsvLoader csvLoader = new CsvLoader();
        AppData loadedData = csvLoader.load("data.csv");

        // Вывод загруженных данных
        if (loadedData != null) {
            System.out.println("Заголовки:");
            for (String col : loadedData.header) {
                System.out.print(col + " ");
            }
            System.out.println("\nДанные:");
            for (int[] row : loadedData.data) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
