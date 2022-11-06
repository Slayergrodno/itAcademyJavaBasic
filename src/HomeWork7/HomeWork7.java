package HomeWork7;

import HomeWork7.Task1.Fridge;
import HomeWork7.Task1.Iron;
import HomeWork7.Task1.Microwave;
import HomeWork7.Task1.VacuumCleaner;
import HomeWork7.Task2.BelCard;
import HomeWork7.Task2.MasterCardUSD;
import HomeWork7.Task2.VisaEUR;
import HomeWork7.Task3.Director;
import HomeWork7.Task3.Engineer;
import HomeWork7.Task3.Plumber;

public class HomeWork7 {
    public static void main(String[] args) {
//        1. Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
//        Создать несколько объектов описанных классов, часть из них включить в розетку.
//        Иерархия должна иметь хотя бы три уровня.
        System.out.println("Задание 1 - Бытовая техника");
        VacuumCleaner cleaner = new VacuumCleaner(0.65, 0.4);
        System.out.println(cleaner.getName());
        cleaner.turnOn();
        cleaner.usageDay();
        cleaner.usageMonth();
        cleaner.status();
        cleaner.turnOff();
        cleaner.status();
        Fridge fridge = new Fridge(0.15, 24);
        System.out.println(fridge.getName());
        fridge.turnOn();
        fridge.usageDay();
        fridge.usageMonth();
        fridge.status();
        fridge.turnOff();
        fridge.status();
        Iron iron = new Iron(0.7, 0.4);
        System.out.println(iron.getName());
        iron.turnOn();
        iron.usageDay();
        iron.usageMonth();
        iron.status();
        iron.turnOff();
        iron.status();
        Microwave microwave = new Microwave(1.5, 0.5);
        System.out.println(microwave.getName());
        microwave.turnOn();
        microwave.usageDay();
        microwave.usageMonth();
        microwave.status();
        microwave.turnOff();
        microwave.status();

//        2. Создать цепочку наследования (минимум 3 звена) классов,
//        описывающих банковские карточки.
//        Иерархия должна иметь хотя бы три уровня.
        System.out.println("-----------------------------------------------------");
        System.out.println("Задание 2 - Карточки");
        //Создание беларусской карточки
        BelCard belka = new BelCard();
        System.out.println(belka.getName());
        belka.setAccount(100);
        System.out.println("Счет создан, на счету - " + belka.getAccount());
        belka.addSum(400);
        //Создание валютной карточки в еаро
        VisaEUR eur = new VisaEUR();
        System.out.println(eur.getName());
        eur.setAccount(200);
        System.out.println("Счет создан, на счету - " + eur.getAccount());
        eur.addSum(800);
        //Создание валиюной карточки в долларах
        MasterCardUSD usd = new MasterCardUSD();
        System.out.println(usd.getName());
        usd.setAccount(1200);
        System.out.println("Счет создан, на счету - " + usd.getAccount());
        usd.addSum(800);
        //Перевод не организован должным образом, не знаю как передать текстом название объекта (карточки)
        //Если не сложно подскажите как реализовать возможность передать название карточки с помощью
        //строковой переменной, которую будет вводить пользователь
        System.out.println("----- Белка -----");
        belka.transfer(100, "byn");
        belka.transfer(600, "eur");
        belka.transfer(200, "eur");
        belka.transfer(200, "usd");
        System.out.println("----- EUR -----");
        eur.transfer(100, "eur");
        eur.transfer(2000, "usd");
        eur.transfer(400, "byn");
        eur.transfer(400, "usd");
        System.out.println("----- USD -----");
        usd.transfer(1000, "usd");
        usd.transfer(5000, "eur");
        usd.transfer(1000, "eur");
        usd.transfer(1000, "byn");
//        Создать цепочку наследования (минимум 3 звена) классов,
//        описывающих должностную структуру на заводе.
//        Реализовать методы по начислению зарплаты в зависимости от должности
//        (почасовая, процентная, смешанная).
//        Иерархия должна иметь хотя бы три уровня.
        System.out.println("-----------------------------------------------------");
        System.out.println("Задание 3 - Зарплата");
        //Создание директора, смешенная зарплата
        Director director = new Director(170, 50);
        System.out.println(director.getName());
        System.out.println("Начисленная зарплата - " + director.getSalary());
        System.out.println(director.getNameSalary());
        //Создание инженерной должности, почасовая зарплата
        Engineer engineer = new Engineer(170);
        System.out.println(engineer.getName());
        System.out.println("Начисленная зарплата - " + engineer.getSalary());
        System.out.println(engineer.getNameSalary());
        //Создание рабочей должности, процентная ставка
        Plumber plumber = new Plumber(170, 70);
        System.out.println(plumber.getName());
        System.out.println("Начислена зарплата - " + plumber.getSalary());
        System.out.println(plumber.getNameSalary());
    }
}
