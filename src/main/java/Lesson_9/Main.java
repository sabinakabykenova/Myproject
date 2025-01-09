package Lesson_9;

public class Main {
    public static void main(String[] args) {
        // Animals
        Dog dog = new Dog("Хатико");
        dog.run(150);
        dog.swim(10);

        Cat cat = new Cat("Лео");
        cat.run(150);
        cat.swim(5);

        // Plates
        Plate plate = new Plate(100);
        Cat[] cats = {new Cat("Лео"), new Cat("Симба"), new Cat("Муфаса")};

        for (Cat c : cats) {
            if (c.eat(plate)) {
                System.out.println(c.name + " поел");
            } else {
                System.out.println(c.name + " не поел");
            }
        }

        // Payment
        Payment payment = new Payment();
        Payment.Product bread = payment.new Product("Прикорм", 2.5);
        payment.addProduct(bread.getPrice());
        System.out.println("Итого: " + payment.getTotalAmount());

        // Пример работы с парком
        Park park = new Park("Диснейленд");
        Park.Attraction rollerCoaster = park.new Attraction("Карусель", 120, 15.0);
        System.out.println("Аттракцион: " + rollerCoaster.getName());
    }
}
