public interface GeometricFigure {

    default double calculatePerimeter(double sideA) {
        return sideA * 4;
    }

    default double calculateArea(double sideA) {
        return sideA * sideA;
    }

    default String defaultFillColour() {
        return "бирюзовый";
    }

    default String defaultBorderColour() {
        return "малиновый";
    }

    void print();

    boolean check();
}
