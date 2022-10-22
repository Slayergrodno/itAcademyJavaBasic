package HomeWork5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Time time1 = new Time(12, 12, 12);
        Time time2 = new Time(25, 241, 361);
        Time time3 = new Time(42000);
        Time time4 = new Time(42000);

        System.out.println("Задание 1 - compareTo");
        System.out.print("Время 1: ");
        printTime(time1);
        System.out.print("Время 2: ");
        printTime(time2);
        System.out.print("Время 3: ");
        printTime(time3);
        System.out.print("Время 4: ");
        printTime(time4);
        System.out.println("______________________________");
        System.out.println("Время 1 compareTo время 2: " + time1.compareTo(time2));
        System.out.println("Время 2 compareTo время 3: " + time2.compareTo(time3));
        System.out.println("Время 3 compareTo время 4: " + time3.compareTo(time4));
        System.out.println("______________________________");
//Создать класс описывающие Банкомат.
// Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
// количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
// Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
// На экран – булевское значение (операция удалась или нет).
// При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 2 - Банкомат");
//Создание банкомата
        ATM atmBank = new ATM(1, 1, 1);
//Добавление купюр: 20, 50, 100
        atmBank.addCoins(0, 1, 0);
//Запрос на вывод суммы
        System.out.print("Введите сумму для вывода: ");
        int sumAdd;
        boolean resultSum;
        sumAdd = sc.nextInt();
        if (sumAdd <= 0)
            System.out.println("Введена некорректная сумма, сумма должна быть больше 0!");
        else {
            resultSum = atmBank.issue(sumAdd);
            System.out.println("Операция: " + resultSum);
            if (!resultSum)
                System.out.println("Нет вариантов для выдачи");
        }
    }

//        1. Создать класс описывающие промежуток времени.
//        Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//        Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
//        (метод должен работать аналогично compareTo в строках).
//        Создать два конструктора:
//        получающий общее количество секунд получающий часы, минуты и секунды по отдельности.
//        Сделать метод для вывода данных. Прочее на ваше усмотрение.

    public static void printTime(Time timePrint) {
        System.out.println(timePrint.getHours() + "ч. " + timePrint.getMinutes() +
                "м. " + timePrint.getSeconds() + "с.");
        System.out.println("Всего секунд: " + timePrint.getSecondFromTime());
    }
}

