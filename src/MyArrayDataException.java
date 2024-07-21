public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message, int raw, int column) {
        super(message + " [" + raw + "][" + column + "]");
    }

}
