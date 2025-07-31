public abstract class Animal {
    protected String name;
    public static int countAnimals = 0;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}