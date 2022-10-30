package HomeWork8;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Создать enum, который описывает сезоны года.
//        Добавить поле description в этот enum.
//        Добавить поле countOfDays в этот enum.
//        Вывести на экран все константы сезоны года.
        System.out.println("Задание 1 - enum - Временя года");
        Seasons[] season = Seasons.values();
        for (Seasons element : season) {
            System.out.println(element + ": " + element.getDescription() + "; " + element.getCountOfDays() + " дня(ей)");
        }

//        2. Написать метод, который выводит следующий сезон
//        от заданного во входном параметре.
//        Входной параметр ввести с клавиатуры.
        System.out.println("Задание 2 - Вывести следующий сезон");
        Seasons[] season2 = Seasons.values();
        int number;
        do {
            System.out.println("""
                    Введите сезон года от 1 до 4, где\s
                    1 - Winter;
                    2 - Spring;
                    3 - Summer;
                    4 - Autumn:\s""");
            number = sc.nextInt();
            if (number > 0 && number <= 4) {
                if (number < 4) {
                    System.out.println("Следующий сезон за сезоном " + season2[number - 1] + " - " + season2[number]);
                } else {
                    System.out.println("Следующий сезон за сезоном " + season2[3] + " - " + season2[0]);
                }
            } else {
                System.out.println("Неверный ввод");
            }
        } while (number < 1 || number > 4);

//        3. Написать метод, который в зависимости от сезона выводит на экран сумму дней в этом сезоне.
//        Входной параметр ввести с клавиатуры.*/
        System.out.println("Задание 3 - Вывод количества дней в сезоне");
        Seasons[] seasons3 = Seasons.values();
        String name;
        name = sc.nextLine();
        while (!name.equals("Winter") && !name.equals("Spring") && !name.equals("Summer") && !name.equals("Autumn")) {
            System.out.println("Введите пору года, одну из: " + Arrays.toString(seasons3));
            name = sc.nextLine();
        }
        Seasons seasons31 = Seasons.valueOf(name);
        System.out.println("Дней в " + seasons31.name() + " = " + seasons31.getCountOfDays());

//        4. Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
//        Создать поле name в классе Vehicle и проинициализировать его через конструктора.
//        Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
//        Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран
//        имя хранимого транспортного средства.

        System.out.println("Задание 4 - Класс Vehicle");
        System.out.println("Введите имя для машины: ");
        Car obj1 = new Car(sc.nextLine());
        System.out.println("Введите имя для мотоцикла: ");
        Motor obj2 = new Motor(sc.nextLine());
        Garage<Car> vehicle1 = new Garage<Car>(obj1);
        Garage<Motor> vehicle2 = new Garage<Motor>(obj2);
        System.out.println("Имя автомобиля: " + vehicle1.transport.getName());
        System.out.println("Имя мотоцикла: " + vehicle2.transport.getName());
    }
}