public class Main {
    public static void main(String[] args) {
        // 🔹 Задание 1: Работа со студентами
        Set<Student> students = new HashSet<>();
        students.add(new Student("Алексей", "A1", 1, Arrays.asList(4, 5, 3)));
        students.add(new Student("Мария", "B2", 2, Arrays.asList(2, 2, 3)));
        students.add(new Student("Иван", "C3", 1, Arrays.asList(5, 4, 5)));

        System.out.println("🎓 Студенты до фильтрации:");
        students.forEach(System.out::println);

        StudentUtils.removeLowPerformers(students);
        StudentUtils.promoteStudents(students);

        System.out.println("\n🎓 Студенты после фильтрации и перевода:");
        students.forEach(System.out::println);

        System.out.println();
        StudentUtils.printStudents(students, 2);

        // 🔹 Задание 2: Телефонный справочник
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Иванов", "789-012");
        phoneBook.add("Петров", "555-555");

        System.out.println("\n Телефоны Иванова:");
        phoneBook.get("Иванов").forEach(System.out::println);

        System.out.println("\n Телефоны Петрова:");
        phoneBook.get("Петров").forEach(System.out::println);
    }
