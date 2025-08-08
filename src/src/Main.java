public class Main {
    public static void main(String[] args) {


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
