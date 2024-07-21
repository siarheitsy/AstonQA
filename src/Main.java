public class Main {

    public static void main(String[] args) {
        int dimension = 4;
        int result;
        String[][] array = new String[dimension][dimension];
        fillArray(array);
        try {
            result = arraySummation(array);
            System.out.println("Результат суммирования элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String[][] fillArray(String[][] array) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = Integer.toString(-1);
            }
        }
        array[1][2] = "ABBA";
        return array;
    }

    public static int arraySummation(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length == 4) {
            for (String[] nestedArray : array) {
                if (nestedArray.length != 4) {
                    throw new MyArraySizeException("Размерность вложенного массива не равна 4");
                }
            }
            int sumArrayElements = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        sumArrayElements += Integer.valueOf(array[i][j]);
                    } catch (Exception ex) {
                        throw new MyArrayDataException("Ошибка при преобразовании значения из ячейки", i, j);
                    }
                }
            }
            return sumArrayElements;
        } else {
            throw new MyArraySizeException("Размерность массива не равна 4");
        }
    }
}