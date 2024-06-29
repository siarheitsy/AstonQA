//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Task1:");
        printThreeWords();

        System.out.println("\nTask2:");
        checkSumSign();

        System.out.println("\nTask3:");
        printColor();

        System.out.println("\nTask4:");
        compareNumbers();

        System.out.println("\nTask5:");
        int value1 = 13;
        int value2 = 45;
        boolean result = sumBetween10n20(value1, value2);
        System.out.println(result);

        System.out.println("\nTask6:");
        value1 = 8;
        ifPositive(value1);

        System.out.println("\nTask7:\n" + String.valueOf(isNegative(value1)));

        System.out.println("\nTask8:");
        String str1 = "I love bananas";
        value1 = 5;
        stringsPrint(str1, value1);

        value1 = 2024;
        System.out.println("\nTask9:\n" + String.valueOf(isLeap(value1)));

        System.out.println("\nTask10:");
        int arr1[] = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Initial array: ");
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.printf("%d", arr1[i]);
            if (arr1[i] == 0)
            {
                arr1[i] = 1;
            }
            else {
                arr1[i] = 0;
            }
        }
        System.out.println("\nFinal array: ");
        for (int i : arr1)
        {
            System.out.printf("%d", i);
        }

        System.out.println("\n\nTask11: ");
        int arr2[] = new int [100];
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = i + 1;
            System.out.printf("%d ", arr2[i]);
        }

        System.out.println("\n\nTask12: ");
        int arr3[] = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++)
        {
            if (arr3[i] < 6)
            {
                arr3[i] = arr3[i]*2;
            }
            System.out.printf("%d ", arr3[i]);
        }

        System.out.println("\n\nTask13: ");
        value1 = 7;
        int arr4[][] = new int [value1][value1];
        for (int i = 0; i < value1; i++)
        {
            for (int j = 0; j < value1; j++)
            {
                if ((i == j) || ((i + j) == (value1 - 1)))
                {
                    arr4[i][j] = 1;
                }
                System.out.printf("%d ", arr4[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nTask14:");
        int len = 6;
        int initialValue = 5;
        int arr5[] = initialArray(len, initialValue);
        for (int i : arr5)
        {
            System.out.printf("%d ", arr5[i]);
        }
    }
    public static void printThreeWords()
    {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign()
    {
        int a = 1;
        int b = 2;
        if ((a+b) >= 0)
        {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor()
    {
        int value = 3;
        if (value <= 0)
        {
            System.out.println("Красный");
        } else if(value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if(value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers()
    {
        int a = 4;
        int b = 5;
        if (a >= b)
        {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static boolean sumBetween10n20(int value1, int value2)
    {
        if ((value1+value2) >= 10 && (value1+value2) <= 20)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void ifPositive(int value)
    {
        if (value < 0)
        {
            System.out.println("Переданное число отрицательное");
        } else {
            System.out.println("Переданное число положительное");
        }
    }
    public static boolean isNegative(int value)
    {
        return value < 0 ? true : false;
    }
    public static void stringsPrint(String value1, int value2)
    {
        for (int i = 0; i < value2; i++)
        {
            System.out.println(value1);
        }
    }
    public static boolean isLeap(int year)
    {
        if (((year % 4) == 0) && (((year % 100) != 0) || ((year % 400) == 0))) {
            return true;
        } else {
            return false;
        }
    }
    public static int[] initialArray(int len, int initialValue)
    {
        int tempArr[] = new int [len];
        for (int i = 0; i < len; i++)
        {
            tempArr[i] = initialValue;
        }
        return tempArr;
    }
}