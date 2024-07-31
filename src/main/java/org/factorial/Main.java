package org.factorial;

public class Main {

    public static void main(String[] args) {

        int value = 0;
        try {
            System.out.printf("Factorial of number %d is %d", value, Factorial.factorial(value));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
