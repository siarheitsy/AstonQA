public class Circle implements GeometricFigure {

    public final static double PI = 3.14;
    public double radius;
    double perimeter;
    double area;
    String fillColour;
    String borderColour;

    Circle(double radius) {
        this.radius = radius;
        this.perimeter = calculatePerimeter(radius);
        this.area = calculateArea(radius);
        this.fillColour = "черный";
        this.borderColour = "хаки";
    }

    @Override
    public double calculatePerimeter(double radius) {
        return PI * radius;
    }

    @Override
    public double calculateArea(double radius) {
        return PI * radius * radius;
    }

    @Override
    public void print() {
        if (check()) {
            System.out.printf("\nКруг с радиусом %.2fсм. Длина окружности составит %.2fсм, а площадь %.2fсм. Цвет заливки %s, а цвет границы %s.\n", this.radius, this.perimeter, this.area, this.fillColour, this.borderColour);
        } else {
            System.out.println("Некорректные данные круга.");
        }
    }

    @Override
    public boolean check() {
        if (this.radius > 0 && this.perimeter > 0 && this.area > 0) {
            return true;
        } else {
            return false;
        }
    }
}
