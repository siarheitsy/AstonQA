public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message, int row, int column) {
        super(message + " [" + row + "][" + column + "]");
    }

}
