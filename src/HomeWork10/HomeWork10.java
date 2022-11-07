package HomeWork10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeWork10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        1. Написать код, который выбрасывает NullPointerException.
//        Написать обработчик этого исключения и вывести на экран сообщение,
//        которое будет содержать описание данного исключения.
        System.out.println("Задание 1 - NullPointerException");
        Print print = new Print();
        List<String> list = Arrays.asList("Проверка 1", null, "Проверка 2");
        for (String str : list) {
            try {
                print.print(str);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception обработка исключения!");
            } finally {
                System.out.println("Задание 1 - Не обязательный блок, но выполнение обязательно!");
            }
            System.out.println("-----------------");
        }

//        2. Написать собственное исключение от Exception.
//        Сгенерировать код, который будет выбрасывать его и обрабатывать.
//        Результат работы программы вывести на экран.
        System.out.println("Задание 2 - Exception");
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Задание 2 - Не обязательный блок, но выполнение обязательно!");
        }

//        3. Написать метод, который будет возбуждать исключение и
//        обработать это исключение на уровне выше.
//        Результат работы программы вывести на экран.
        System.out.println("-----------------");
        System.out.println("Задание 3 - Исключение (обработка на уровне выше)");
        try {
            exceptionUp();
        } catch (MyException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Задание 3 - Не обязательный блок, но выполнение обязательно!");
        }
    }

    private static void exceptionUp() throws MyException {
        System.out.println("Введите 2 равных числа (Exception - числа не равны): ");
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Числа равны!");
        } else {
            throw new MyException();
        }
    }
}