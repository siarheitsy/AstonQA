public class Rectangle implements GeometricFigure {

    public double sideA;
    public double sideB;
    double perimeter;
    double area;
    String fillColour;
    String borderColour;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.perimeter = calculatePerimeter(sideA);
        this.area = calculateArea(sideA);
        this.fillColour = defaultFillColour();
        this.borderColour = defaultBorderColour();
    }

    @Override
    public double calculatePerimeter(double sideA) {
        return (sideA * 2 + this.sideB * 2);
    }

    @Override
    public double calculateArea(double sideA) {
        return sideA * this.sideB;
    }

    @Override
    public void print() {
        if (check()) {
            System.out.printf("\nПрямоугольник со сторонами %.2fсм и %.2fсм. Периметр составит %.2fсм, а площадь %.2fсм. Цвет заливки %s, а цвет границы %s.\n", this.sideA, this.sideB, this.perimeter, this.area, this.fillColour, this.borderColour);
        } else {
            System.out.println("Некорректные данные прямоугольника.");
        }
    }

    @Override
    public boolean check() {
        if (this.sideA > 0 && this.sideB > 0 && this.perimeter > 0 && this.area > 0) {
            return true;
        } else {
            return false;
        }
    }
}
