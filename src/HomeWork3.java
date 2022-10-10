public class HomeWork3 {
    public static void main(String[] args) {
//        1. Создайте метод с одним целочисленным параметром. Метод должен определить,
//        является ли последняя цифра числа семеркой и вернуть boolean значение.
        System.out.println("Задание 1 - Последняя цифра числа 7 у числа 15? " + last7(15));
        System.out.println("Задание 1 - Последняя цифра числа 7 у числа 17? " + last7(17));

//        2. Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа. Определить,
//        можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
        System.out.println("Задание 2 - Можно ли закрыть прямоугольник 5x9, " +
                "кругом радиусом 6? " + rectangleIsCircle(5, 9, 6));
        System.out.println("Задание 2 - Можно ли закрыть прямоугольник 5x9, " +
                "кругом радиусом 5? " + rectangleIsCircle(5, 9, 5));

//        3. Задать целое число в виде переменной, это число – сумма денег в рублях.
//        Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
        int numberLesson3 = 113;
        rublesPrint(numberLesson3);

//        4. Задать три числа – день, месяц, год.
//        Вывести на экран в виде трех чисел дату следующего дня.
        int day = 28;
        int month = 2;
        int year = 2100;
        nextDayPrint(day, month, year);

//        5. Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
//        Проверить, помещаются ли эти дома на данном участке.
//        Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
        // 1 дом a на b
        int a = 10;
        int b = 1;
        // 2 дом c на d
        int c = 1;
        int d = 10;
        // Участок e на f
        int e = 2;
        int f = 10;
        System.out.println("Задание 5 - Дома (" + a + "х" + b + " и " + c + "х" + d + ") " +
                "могут быть размещены на участке (" + e + "х" + f + ")? " + correctHouseOnLand(a, b, c, d, e, f));

//        Написать метод, который выводит расписание на неделю.
//        Задать на вход в метод порядковый номер дня недели и отобразить на экране то,
//        что запланировано на этот день.
        weeklyJournalPrint(6);
    }

    public static boolean last7(int number) {
//        1. Создайте метод с одним целочисленным параметром. Метод должен определить,
//        является ли последняя цифра числа семеркой и вернуть boolean значение.
        return number % 10 == 7;
    }

    public static boolean rectangleIsCircle(int sideA, int sideB, int radius) {
//        2. Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа. Определить,
//        можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
        return Math.sqrt(Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0)) < (double) (radius * 2);
    }

    public static void rublesPrint(int number) {
//        3. Задать целое число в виде переменной, это число – сумма денег в рублях.
//        Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.
        int numberRub = number % 100;
        if (numberRub >= 11 & numberRub <= 14) {
            numberRub = 0;
        }
        switch (numberRub % 10) {
            case 0, 5, 6, 7, 8, 9 -> System.out.println("Задание 3 - " + number + " рублей");
            case 1 -> System.out.println("Задание 3 - " + number + " рубль");
            case 2, 3, 4 -> System.out.println("Задание 3 - " + number + " рубля");
        }
    }

    public static void nextDayPrint(int day, int month, int year) {
//        4. Задать три числа – день, месяц, год.
//        Вывести на экран в виде трех чисел дату следующего дня.
        if (day == 28 && month == 2 && (year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            day = 1;
            ++month;
            System.out.println("Задание 4 - Дата следующего дня: " + day + "." + month + "." + year);
        } else if (day == 29 && month == 2) {
            day = 1;
            ++month;
            System.out.println("Задание 4 - Дата следующего дня: " + day + "." + month + "." + year);
        } else if (day != 31 || month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10) {
            if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                day = 1;
                ++month;
                System.out.println("Задание 4 - Дата следующего дня: " + day + "." + month + "." + year);
            } else if (day == 31 && month == 12) {
                day = 1;
                month = 1;
                ++year;
                System.out.println("Задание 4 - Дата следующего дня: " + day + "." + month + "." + year);
            } else {
                ++day;
                System.out.println("Задание 4 - Дата следующего дня: " + day + "." + month + "." + year);
            }
        } else {
            day = 1;
            ++month;
            System.out.println("Задание 4 - Дата следующего дня: " + day + "." + month + "." + year);
        }

    }

    public static boolean correctHouseOnLand(int house1SideA, int house1SideB, int house2SideC, int house2SideD, int landSideE, int landSideF) {
//        5. Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
//        Проверить, помещаются ли эти дома на данном участке.
//        Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
        if (landSideE >= house1SideA + house2SideC && landSideF >= house1SideB && landSideF >= house2SideD) {
            return true;
        } else if (landSideE >= house1SideA + house2SideD && landSideF >= house1SideB && landSideF >= house2SideC) {
            return true;
        } else if (landSideE >= house1SideB + house2SideC && landSideF >= house1SideA && landSideF >= house2SideD) {
            return true;
        } else if (landSideE >= house1SideB + house2SideD && landSideF >= house1SideA && landSideF >= house2SideC) {
            return true;
        } else if (landSideF >= house1SideA + house2SideC && landSideE >= house1SideB && landSideE >= house2SideD) {
            return true;
        } else if (landSideF >= house1SideA + house2SideD && landSideE >= house1SideB && landSideE >= house2SideC) {
            return true;
        } else if (landSideF >= house1SideB + house2SideC && landSideE >= house1SideA && landSideE >= house2SideD) {
            return true;
        } else {
            return landSideF >= house1SideB + house2SideD && landSideE >= house1SideA && landSideE >= house2SideC;
        }
    }

    public static void weeklyJournalPrint(int dayOfWeek) {
//        Написать метод, который выводит расписание на неделю.
//        Задать на вход в метод порядковый номер дня недели и отобразить на экране то,
//        что запланировано на этот день.
        switch (dayOfWeek) {
            case 1 -> System.out.println("Задание 6 - Понедельник. Первый рабочий день!");
            case 2 -> System.out.println("Задание 6 - Вторник. Второй рабочий день!");
            case 3 -> System.out.println("Задание 6 - Среда. Третий рабочий день!");
            case 4 -> System.out.println("Задание 6 - Четверг. Четвертый рабочий день!");
            case 5 -> System.out.println("Задание 6 - Пятница. Держись - завтра выходной!");
            case 6 -> System.out.println("Задание 6 - Суббота. Выходной! Тащимся!");
            case 7 -> System.out.println("Задание 6 - Воскресенье. Хватит отдыхать! Завтра на работу!");
            default -> System.out.println("Задание 6 - Отсутствует такой день недели.");
        }
    }
}

