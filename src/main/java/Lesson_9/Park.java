package Lesson_9;


public class Park {
    private String parkName;

    public Park(String name) {
        parkName = name;
    }

    public class Attraction {
        private String name;
        private int openTime; // время открытия в минутах
        private double price;

        public Attraction(String name, int openTime, double price) {
            this.name = name;
            this.openTime = openTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getOpenTime() {
            return openTime;
        }

        public double getPrice() {
            return price;
        }
    }
}
