package homeWork4;

import java.util.Arrays;
import java.util.Random;

public class HomeWork4Array {
    public static void main(String[] args) {
//        1. Создайте переменную для массива из 10 элементов.
//        Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
        int[] numbers = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayLastElement(numbers);

//        2. Создайте переменную для массива из 10 элементов (другим способом).
//        Выведите на экран элементы, стоящие на четных позициях (индексы).
        String[] cars = new String[]{"BMW", "Audi", "Volkswagen", "Volvo", "Peugeot", "Renault", "Skoda", "Nissan", "Hyundai", "Kia"};
        arrayEvenNumber(cars);

//        3. Создайте переменную для массива из 10 элементов.
//        Заполните его произвольными значениями целочисленного типа.
//        Найдите максимальный элемент и выведите его индекс.
        int[] arrayMax = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayMax.length; ++i) {
            arrayMax[i] = random.nextInt(100);
        }
        System.out.println("Задание 3 - Массив " + Arrays.toString(arrayMax) +
                ", максимальный элемент - " + arrayMax[arrayMaxIndex(arrayMax)] +
                ", имеет индекс - " + arrayMaxIndex(arrayMax));

//        4. Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
//        Определите сумму элементов массива, расположенных между минимальным и максимальным значениями (не включая).
//        Если значений максимальных и минимальных несколько, то необходимо взять
//        максимальное значение разницы индексов между максимальным и минимальным значениями.
        int[] arraySum = new int[]{0, -8, 8, 3, -2, -9, -1, 7, 8, 0};
        System.out.println("Задание 4 - Сумма элементов масcива между минимальным и максимальным значениями " +
                Arrays.toString(arraySum) + " - " + arraySumMinMax(arraySum));

//        5. Создайте переменную для массива из 10 элементов.
//        Заполните его произвольными значениями целочисленного типа.
//        Выведите на экран, переверните и снова выведите на экран
//        (при переворачивании нежелательно создавать еще один массив).
        int[] arrayOverturn = new int[10];
        for (int i = 0; i < arrayOverturn.length; ++i) {
            arrayOverturn[i] = random.nextInt(100);
        }
        System.out.println("Задание 5 - Массив " + Arrays.toString(arrayOverturn) + " - перевернули " +
                Arrays.toString(arrayOver(arrayOverturn)));

//        6. Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1
        int xFly = 5;
        System.out.println("Задание 6 - Массив размерностью " + xFly + ", заполненный \"бабочкой\":");
        arrayButterfly(xFly);
    }

    public static void arrayLastElement(int[] arrayLast) {
//        1. Создайте переменную для массива из 10 элементов.
//        Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.
        System.out.println("Задание 1 - Последний элемент массива " + Arrays.toString(arrayLast) +
                " - " + arrayLast[arrayLast.length - 1]);
    }

    public static void arrayEvenNumber(String[] arrayEven) {
//        2. Создайте переменную для массива из 10 элементов (другим способом).
//        Выведите на экран элементы, стоящие на четных позициях (индексы).
        System.out.print("Задание 2 - Элементы на четных позициях массива " + Arrays.toString(arrayEven) + ": ");
        for (int i = 0; i < arrayEven.length; i += 2) {
            System.out.print(arrayEven[i] + " ");
        }
        System.out.println();
    }

    public static int arrayMaxIndex(int[] arrayMax) {
//        3. Создайте переменную для массива из 10 элементов.
//        Заполните его произвольными значениями целочисленного типа.
//        Найдите максимальный элемент и выведите его индекс.
        int temp = 0;
        for (int i = 1; i < arrayMax.length; ++i) {
            if (arrayMax[i] > arrayMax[temp]) {
                temp = i;
            }
        }
        return temp;
    }

    public static int arraySumMinMax(int[] arraySum) {
//        4. Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
//        Определите сумму элементов массива, расположенных между минимальным и максимальным значениями (не включая).
//        Если значений максимальных и минимальных несколько, то необходимо взять
//        максимальное значение разницы индексов между максимальным и минимальным значениями.
        int minEl = 0;
        int minEl2 = 0;
        int maxEl = 0;
        int maxEl2 = 0;
        for (int i = 1; i < arraySum.length; ++i) {
            if (arraySum[minEl] >= arraySum[i]) { //Поиск минимальных элементов
                if (arraySum[minEl] > arraySum[i]) {
                    minEl = i;
                }
                minEl2 = i;
            }
            if (arraySum[maxEl] <= arraySum[i]) { //Поиск максимальных элементов
                if (arraySum[maxEl] < arraySum[i]) {
                    maxEl = i;
                }
                maxEl2 = i;
            }
        }
        int i1;
        int i2;
        if (Math.abs(maxEl2 - minEl) > Math.abs(minEl2 - maxEl)) { //Определение индексов
            if (maxEl2 > minEl) {
                i1 = minEl;
                i2 = maxEl2;
            } else {
                i1 = maxEl2;
                i2 = minEl;
            }
        } else if (maxEl > minEl2) {
            i1 = minEl2;
            i2 = maxEl;
        } else {
            i1 = maxEl;
            i2 = minEl2;
        }

        int sum = 0;
        int sumRavno = 0;

        int i;
        for (i = i1 + 1; i < i2; ++i) {
            sum += arraySum[i];
        }

        if (Math.abs(maxEl2 - minEl) == Math.abs(minEl2 - maxEl)) { // Определение индексов (при равенстве)
            if (maxEl2 > minEl) {
                i1 = minEl;
                i2 = maxEl2;
            } else {
                i1 = maxEl2;
                i2 = minEl;
            }
        }
        for (i = i1 + 1; i < i2; ++i) {
            sumRavno += arraySum[i];
        }
        return Math.max(sum, sumRavno);
    }

    public static int[] arrayOver(int[] arrayOver) {
//        5. Создайте переменную для массива из 10 элементов.
//        Заполните его произвольными значениями целочисленного типа.
//        Выведите на экран, переверните и снова выведите на экран
//        (при переворачивании нежелательно создавать еще один массив).
        for (int i = 0; i < arrayOver.length / 2; ++i) {
            int temp = arrayOver[arrayOver.length - i - 1];
            arrayOver[arrayOver.length - i - 1] = arrayOver[i];
            arrayOver[i] = temp;
        }
        return arrayOver;
    }

    public static void arrayButterfly(int iFly) {
//        6. Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:
//        1 1 1 1 1
//        0 1 1 1 0
//        0 0 1 0 0
//        0 1 1 1 0
//        1 1 1 1 1
        for (int i = 0; i < iFly; ++i) {
            for (int j = 0; j < iFly; ++j) {
                if ((i + j < iFly - 1 || i < j) && (i + j > iFly - 1 || i > j)) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
}
