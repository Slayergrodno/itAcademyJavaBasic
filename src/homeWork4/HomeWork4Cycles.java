package homeWork4;

import java.math.BigInteger;

public class HomeWork4Cycles {
    public static void main(String[] args) {
//        1. Вычислить факториал целых чисел от 0 до 10 с помощью цикла while для каждого.
        int factorialGoNumber = 10; //Максимальное значение 12, далее нужно изменять тип переменной в функции
        factorialReturn(factorialGoNumber);

//        2. Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
        multiplyX(25);

//        3. Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
        long chislo3 = 7893823445L;
        System.out.println("Задание 3 - Сумма цифр числа " + chislo3 + " = " + sumOfNumbersX(chislo3));

//        4. Найти среди чисел от 50 до 70 второе простое число (число называют простым,
//        если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
        int numberFrom = 50; //от числа
        int numberUpTo = 70; //до число
        int count4 = 2;      //какое по счету
        System.out.println("Задание 4 - " + count4 + " просто число на отрезке от " + numberFrom +
                " до " + numberUpTo + " = " + primeNumber(numberFrom, numberUpTo, count4));

//        5. Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
        sevenHopePrint(1, 100);


//        6. Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа,
//        каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.
        int numberBux = 20023143;
        outBuxPrint(numberBux);
    }

    public static void factorialReturn(int number) {
//        1. Вычислить факториал целых чисел от 0 до 10 с помощью цикла while для каждого.
        int result;
        result = 1;
        System.out.println("Задание 1 - Факториал 0 = " + result);
        int temp;
        temp = 1;
        while (number >= temp) {
            System.out.println("Задание 1 - Факториал " + temp + " = " + (result *= temp++));
        }
    }

    public static void multiplyX(int number) {
//        2. Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
        int count = number;
        BigInteger result = BigInteger.ONE;
        do {
            result = result.multiply(BigInteger.valueOf((long) (count--)));
        } while (count > 0);
        System.out.println("Задание 2 - Произведение чисел от 1 до " + number + " = " + result);
    }

    public static int sumOfNumbersX(long number) {
//        3. Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
        int result = 0;
        long numberX = number;
        do {
            result = (int) ((long) result + numberX % 10L);
            numberX /= 10L;
        } while (numberX > 0L);
        return result;
    }

    public static int primeNumber(int numberFrom, int numberUpTo, int countX) {
//        4. Найти среди чисел от 50 до 70 второе простое число (число называют простым,
//        если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.
        int count = 0;
        int primeNumber2 = 0;
        for (int i = numberFrom; i <= numberUpTo; ++i) {
            for (int j = 2; j < i / 2 + 1 && i % j != 0; ++j) {
                if (j == i / 2) {
                    ++count;
                }
            }
            if (count == countX) {
                primeNumber2 = i;
                break;
            }
        }
        return primeNumber2;
    }

    public static void sevenHopePrint(int numberFrom, int numberUpTo) {
//        5. Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
        for (int i = numberFrom; i <= numberUpTo; ++i) {
            if (i % 7 == 0) {
                System.out.println("Задание 5 - " + i + " - Hope!");
            } else {
                System.out.println("Задание 5 - " + i);
            }
        }
    }

    public static void outBuxPrint(int number) {
//        6. Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа,
//        каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.
        int count6 = 0;
        int numberBux;
        for (numberBux = number; numberBux != 0; ++count6) {
            numberBux /= 10;
        }
        System.out.print("Задание 6 - Число " + number + " - ");
        for (int i = count6 / 3; i >= 0; --i) {
            numberBux = number / (int) Math.pow(1000.0, (double) i);
            if (i == count6 / 3 && numberBux != 0) {
                System.out.print(numberBux % 1000);
            } else if (i != count6 / 3 && numberBux % 1000 >= 100) {
                System.out.print(numberBux % 1000);
            } else if (i != count6 / 3 && numberBux % 1000 < 100 && numberBux % 100 >= 10) {
                System.out.print("0");
                System.out.print(numberBux % 1000);
            } else if (i != count6 / 3 && numberBux % 1000 < 10 && numberBux % 100 > 0) {
                System.out.print("00");
                System.out.print(numberBux % 1000);
            } else {
                if (i == count6 / 3 || numberBux % 1000 != 0) {
                    continue;
                }
                System.out.print("000");
            }
            System.out.print(" ");
        }
    }
}
