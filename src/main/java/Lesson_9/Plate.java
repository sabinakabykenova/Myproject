package Lesson_9;


public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            food = 0;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }
}
