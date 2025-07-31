public class Circle implements Shape {
    double radius;
    String fill, border;

    public Circle(double radius, String fill, String border) {
        this.radius = radius;
        this.fill = fill;
        this.border = border;
    }

    public String getFillColor() { return fill; }
    public String getBorderColor() { return border; }

    public void show() {
        double perimeter = calculatePerimeterCircle(radius);
        double area = Math.PI * radius * radius;
        printInfo("Круг", perimeter, area);
    }
}