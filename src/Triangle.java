public class Triangle implements GeometricFigure, GeometricFigurePerimeter, GeometricFigureArea, GeometricFigureColour {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideHeight;
    private double perimeter;
    private double area;
    private String fillColour;
    private String borderColour;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideHeight = calculateSideHeight();
        this.perimeter = calculatePerimeter(sideA);
        this.area = calculateArea(sideA);
        this.fillColour = defaultFillColour();
        this.borderColour = defaultBorderColour();

    }

    public double calculateSideHeight() {
        double halfPerimeter = this.calculatePerimeter(this.sideA) / 2;
        return (2 * (Math.sqrt(halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - this.sideC)))) / this.sideA;
    }

    @Override
    public double calculatePerimeter(double sideA) {
        return (sideA + this.sideB + this.sideC);
    }

    @Override
    public double calculateArea(double sideA) {
        return (this.sideHeight * sideA) / 2;
    }

    @Override
    public void print() {
        if (check()) {
            System.out.printf("\nТреугольник со сторонами %.2fсм, %.2fсм и %.2fсм. Периметр составит %.2fсм, а площадь %.2fсм. Цвет заливки %s, а цвет границы %s.\n", this.sideA, this.sideB, this.sideC, this.perimeter, this.area, this.fillColour, this.borderColour);
        } else {
            System.out.println("Некорректные данные треугольника.");
        }
    }

    @Override
    public boolean check() {
        if (this.sideA > 0 && this.sideB > 0 && this.sideC > 0 && this.sideHeight > 0 && this.perimeter > 0 && this.area > 0) {
            return true;
        } else {
            return false;
        }
    }
}
