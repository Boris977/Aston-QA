public class Cat extends Animal {
    private static int countCats = 0;
    private static final int MAX_RUN = 200;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        countCats++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int portion) {
        if (bowl.decreaseFood(portion)) {
            isFull = true;
            System.out.println(name + " поел " + portion + " еды.");
        } else {
            System.out.println(name + " остался голодн. Недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCountCats() {
        return countCats;
    }
}