public class Rectangle implements Shape {
    double width, height;
    String fill, border;

    public Rectangle(double width, double height, String fill, String border) {
        this.width = width;
        this.height = height;
        this.fill = fill;
        this.border = border;
    }

    public String getFillColor() { return fill; }
    public String getBorderColor() { return border; }

    public void show() {
        double perimeter = calculatePerimeterRectangle(width, height);
        double area = width * height;
        printInfo("Прямоугольник", perimeter, area);
    }
}