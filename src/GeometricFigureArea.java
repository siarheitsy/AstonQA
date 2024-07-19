public interface  GeometricFigureArea {

    default double calculateArea(double sideA) {
        return sideA * sideA;
    }

}
