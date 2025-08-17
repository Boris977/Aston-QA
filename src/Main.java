public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "X", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }


        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Индекс вне диапазона
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Иключение: выход за пределы массива — " + e.getMessage());
        }
    }
    }
=======
        System.out.println("=== Задание 1: Животные ===");

        Dog dog1 = new Dog("Бобик");
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Том");

        dog1.run(300);
        dog1.swim(5);

        cat1.run(150);
        cat1.swim(2);

        System.out.println("Создано животных: " + Animal.countAnimals);
        System.out.println("Котов: " + Cat.getCountCats());
        System.out.println("Собак: " + Dog.getCountDogs());

        Bowl bowl = new Bowl(25);
        Cat[] cats = {cat1, cat2, cat3};
        int portionSize = 10;

        System.out.println("\nКоты кушают из миски:");
        for (Cat cat : cats) {
            cat.eat(bowl, portionSize);
        }

        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            String status = cat.isFull() ? "сыт" : "голоден";
            System.out.println(cat.name + " — " + status);
        }

        bowl.addFood(15);

        System.out.println("\n=== Задание 2: Геометрические фигуры ===");

        Shape circle = new Circle(3, "Голубой", "Синий");
        Shape rectangle = new Rectangle(4, 6, "Жёлтый", "Чёрный");
        Shape triangle = new Triangle(3, 4, 5, "Зелёный", "Красный");

        circle.show();
        rectangle.show();
        triangle.show();
    }
>>>>>>> 16067633e0192d209c153167c28ae7fe9345c913
