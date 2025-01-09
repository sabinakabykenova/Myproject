package Lesson_9;


public class Payment {
    private double totalAmount;

    public Payment() {
        totalAmount = 0.0;
    }

    public void addProduct(double price) {
        totalAmount += price;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }
}
