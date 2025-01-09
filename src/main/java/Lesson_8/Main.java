package Lesson_8;

public class Main {
    public static void main(String[] args) {
        // Массив сотрудников
        Employee[] employees = new Employee[5];

        // Заполнение массива объектами
        employees[0] = new Employee("Amanov Aman", "Engineer", "amanov.aman@gmail.com", "87014568978", 760, 45);
        employees[1] = new Employee("Asanova Aliya", "Web-designer", "asanova92@gmail.com", "87714897655", 1600, 33);
        employees[2] = new Employee("Maksatov Abylai", "Lawyer", "maksatov.a@gmail.com", "87022335441", 1400, 42);
        employees[3] = new Employee("Kosolapov Andrey", "Accountant", "macan@gmail.com", "87774587714", 1090, 28);
        employees[4] = new Employee("Armanova Asylai", "HR", "armanovaasylai@gmail.com", "87012968346", 500, 23);

        // Вывод информации о сотрудниках старше 40 лет
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}