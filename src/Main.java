public class Main {

    public static void main(String[] args) {
        System.out.println("Task1:");
        printThreeWords();

        System.out.println("\nTask2:");
        checkSumSign();

        System.out.println("\nTask3:");
        printColor();

        System.out.println("\nTask4:");
        compareNumbers();

        System.out.println("\nTask5:");
        int sumArgument1 = 13;
        int sumArgument2 = 45;
        boolean result = sumBetween10n20(sumArgument1, sumArgument2);
        System.out.println(result);

        System.out.println("\nTask6:");
        int value = 8;
        ifPositive(value);

        System.out.println("\nTask7:\n" + String.valueOf(isNegative(value)));

        System.out.println("\nTask8:");
        String repeatString = "I love bananas";
        int repeatNumber = 5;
        stringsPrint(repeatString, repeatNumber);

        int year = 2024;
        System.out.println("\nTask9:\n" + String.valueOf(isLeap(year)));

        System.out.println("\nTask10:");
        reverseArray();

        System.out.println("\n\nTask11: ");
        fillArray();

        System.out.println("\n\nTask12: ");
        doubleNumbersLesserThan6();

        System.out.println("\n\nTask13: ");
        fillDiagonals();

        System.out.println("\nTask14:");
        int len = 6;
        int initialValue = 5;
        int[] array = initialArray(len, initialValue);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumBetween10n20(int value1, int value2) {
        if ((value1 + value2) >= 10 && (value1 + value2) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void ifPositive(int value) {
        if (value < 0) {
            System.out.println("Переданное число отрицательное");
        } else {
            System.out.println("Переданное число положительное");
        }
    }

    public static boolean isNegative(int value) {
        return value < 0 ? true : false;
    }

    public static void stringsPrint(String repeatString, int repeatNumber) {
        for (int i = 0; i < repeatNumber; i++) {
            System.out.println(repeatString);
        }
    }

    public static boolean isLeap(int year) {
        if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void reverseArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Initial array: ");
        printIntArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("\nFinal array: ");
        printIntArray(array);
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        printIntArray(array);
    }

    public static void doubleNumbersLesserThan6() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        printIntArray(array);
    }

    public static void fillDiagonals() {
        int dimension = 7;
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if ((i == j) || ((i + j) == (dimension - 1))) {
                    matrix[i][j] = 1;
                }
            }
        }
        printMatrix(matrix, dimension);
    }

    public static int[] initialArray(int len, int initialValue) {
        int[] tempArr;
        tempArr = new int[len];
        for (int i = 0; i < len; i++) {
            tempArr[i] = initialValue;
        }
        printIntArray(tempArr);
        return tempArr;
    }

    public static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }

    public static void printMatrix(int[][] matrix, int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
