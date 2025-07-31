public class Triangle implements Shape {
    double a, b, c;
    String fill, border;

    public Triangle(double a, double b, double c, String fill, String border) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fill = fill;
        this.border = border;
    }

    public String getFillColor() { return fill; }
    public String getBorderColor() { return border; }

    public void show() {
        double perimeter = calculatePerimeterTriangle(a, b, c);
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        printInfo("Треугольник", perimeter, area);
    }
}