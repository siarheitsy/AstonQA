public interface GeometricFigurePerimeter {

    default double calculatePerimeter(double sideA) {
        return sideA * 4;
    }

}
