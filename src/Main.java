public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "Красный", "Чёрный");
        Rectangle rect = new Rectangle(4, 5, "Синий", "Белый");
        Triangle tri = new Triangle(3, 4, 5, "Зелёный", "Жёлтый");

        circle.show();
        rect.show();
        tri.show();
    }
}