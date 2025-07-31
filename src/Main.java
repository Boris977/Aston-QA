public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog1.run(400);
        dog1.swim(8);

        cat1.run(150);
        cat1.swim(5);

        Bowl bowl = new Bowl(25);

        Cat[] cats = {cat1, cat2};
        int portion = 15;

        for (Cat cat : cats) {
            cat.eat(bowl, portion);
        }

        System.out.println("\nСостояние сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isFull() ? "сыт" : "голоден"));
        }

        System.out.println("\nСтатистика:");
        System.out.println("Всего животных: " + Animal.countAnimals);
        System.out.println("Котов: " + Cat.getCountCats());
        System.out.println("Собак: " + Dog.getCountDogs());
        System.out.println("Осталось еды: " + bowl.getFood());
    }
}