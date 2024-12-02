package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign(-5, 15);

        compareNumbers(25, 30);

        printColor(75);

        boolean inRange = isSumInRange(11, 9);
        System.out.println(inRange);

        printNumberSign(-13);

        boolean negative = isNegative(42);
        System.out.println(negative);

        printStringNTimes("Привет!", 3);

        boolean leapYear = isLeapYear(2020);
        System.out.println(leapYear);

        int[][] diagonalMatrix = createDiagonalMatrix(5);
        for (int i = 0; i < diagonalMatrix.length; i++) {
            for (int j = 0; j < diagonalMatrix[i].length; j++) {
                System.out.print(diagonalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] invertedArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArrayElements(invertedArray);
        for (int element : invertedArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        int[] hundredElementArray = new int[100];
        fillHundredElementArray(hundredElementArray);
        for (int element : hundredElementArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        int[] arrayToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(arrayToMultiply);
        for (int element : arrayToMultiply) {
            System.out.print(element + " ");
        }
        System.out.println();

        int[] initializedArray = createArrayWithInitialValue(5, 7);
        for (int element : initializedArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 4
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void printNumberSign(int number) {
        if (number < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8
    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    // 10
    public static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    // 11
    public static void invertArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    // 12
    public static void fillHundredElementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // 13
    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    // 14
    public static int[] createArrayWithInitialValue(int length, int initialValue) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}

