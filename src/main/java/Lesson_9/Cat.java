package Lesson_9;

public class Cat extends Animal {
    public static int catCount = 0;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean eat(Plate plate) {
        if (plate.getFood() > 0) {
            isFull = true;
            plate.decreaseFood(10); // каждый кот съедает 10 еды
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return isFull;
    }
}
