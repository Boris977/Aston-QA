public class Main {
    public static void main(String[] args) {
        TaskSet.printThreeWords();
        TaskSet.checkSumSign();
        TaskSet.printColor();
        TaskSet.compareNumbers();
        System.out.println(TaskSet.isSumBetween10And20(5, 7));
        TaskSet.printPositiveOrNegative(-4);
        System.out.println(TaskSet.isNegative(0));
        TaskSet.printStringNTimes("Привет", 3);
        System.out.println(TaskSet.isLeapYear(2020));
    }
}