public interface Shape {
    String getFillColor();
    String getBorderColor();

    //круг
    default double calculatePerimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    // Прямоугольник
    default double calculatePerimeterRectangle(double width, double height) {
        return 2 * (width + height);
    }

    // Треугольник
    default double calculatePerimeterTriangle(double a, double b, double c) {
        return a + b + c;
    }

    default void printInfo(String name, double perimeter, double area) {
        System.out.println("Фигура: " + name);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площадь: " + area);
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("------------------------");
    }
}