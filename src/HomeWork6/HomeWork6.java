package HomeWork6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork6 {
    public static void main(String[] args) {
//        1. Scanner
        System.out.println("Задание 1 - Сканер");
        Scanner sc = new Scanner(System.in);
//        2. Введите с клавиатуры строку.
//        Найти в строке не только запятые, но и другие знаки препинания.
//        Подсчитать общее их количество.
        System.out.print("Задание 2 - Введите с клавиатуры строку: ");
        System.out.println("Количество знаков препинания - " + hw2PunctuationMarks(sc.nextLine()));
//        3. Введите с клавиатуры текст.
//        Подсчитать количество слов в тексте.
//        Учесть, что слова могут разделяться несколькими пробелами,
//        в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
        System.out.print("Задание 3 - Введите с клавиатуры строку: ");
        System.out.println("Количество слов в тексте - " + hw3WordCount(sc.nextLine()));
//        4. Введите с клавиатуры текст.
//        Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
        System.out.print("Задание 4 - Введите с клавиатуры строку: ");
        hw4LastLetters(sc.nextLine());
//        5. Введите с клавиатуры строку.
//        Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
//        записанных по правилам Java, с помощью регулярных выражений.
//        Результат работы метода выведите на экран.
        System.out.print("Задание 5 - Введите с клавиатуры строку: ");
        hw5HexNumber(sc.nextLine());
//        6. Введите с клавиатуры строку.
//        Напишите метод, выполняющий поиск в строке всех тегов абзацев,
//        в том числе тех, у которых есть параметры, например, <p id=”p1”>,
//        и замену их на простые теги абзацев <p>.
//        Результат работы метода выведите на экран.
        System.out.print("Задание 6 - Введите с клавиатуры строку: ");
        hw6ParagraphTags(sc.nextLine());
//        7. Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
//        один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
//        Сравните скорость их выполнения. Выведите сравнение на экран. System.currentTimeMillis().
        System.out.println("Задание 7 - Старт");
        hw7CurrentTime("aaabbbccc");
    }

    public static int hw2PunctuationMarks(String str) {
//        2. Введите с клавиатуры строку.
//        Найти в строке не только запятые, но и другие знаки препинания.
//        Подсчитать общее их количество.
        int sumMarks = 0;
        char[] punctuationMarks = {'.', ',', ';', '!', '?', '-', ':', '(', ')', '"'};
        for (int i = 0; i < str.length(); i++) {
            for (char punctuationMark : punctuationMarks) {
                if (str.charAt(i) == punctuationMark) {
                    if (i < str.length() - 2 && str.charAt(i) == str.charAt(i + 1) &&
                            str.charAt(i + 1) == str.charAt(i + 2) && str.charAt(i + 2) == punctuationMarks[0])
                        i = i + 2;
                    sumMarks++;
                    break;
                }
            }
        }
        return sumMarks;
    }

    public static int hw3WordCount(String str) {
//        3. Введите с клавиатуры текст.
//        Подсчитать количество слов в тексте.
//        Учесть, что слова могут разделяться несколькими пробелами,
//        в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
        return (str.strip().split(" +")).length;
    }

    public static void hw4LastLetters(String str) {
//        4. Введите с клавиатуры текст.
//        Выведите на экран текст, составленный из последних букв всех слов из исходного текста.
        System.out.print("Последние буквы слов в тексте: ");
        String[] array = str.strip().replaceAll("[^а-яА-Я_0-9a-zA-Z]", " ").split(" +");
        for (String st : array) {
            System.out.print(st.charAt(st.length() - 1));
        }
        System.out.println();
    }

    public static void hw5HexNumber(String str) {
//        5. Введите с клавиатуры строку.
//        Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
//        записанных по правилам Java, с помощью регулярных выражений.
//        Результат работы метода выведите на экран.
        System.out.print("Результат поиска шестнадцатеричных чисел: ");
        boolean hexNum = false;
        Pattern p = Pattern.compile("0[xХ][a-fA-F0-9]{1,}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.print(m.group() + " ");
            hexNum = true;
        }
        if (hexNum) System.out.println();
        else System.out.println("не найдено");
    }

    public static void hw6ParagraphTags(String str) {
//        6. Введите с клавиатуры строку.
//        Напишите метод, выполняющий поиск в строке всех тегов абзацев,
//        в том числе тех, у которых есть параметры, например, <p id=”p1”>,
//        и замену их на простые теги абзацев <p>.
//        Результат работы метода выведите на экран.
        System.out.print("Результат замены на простые теги: ");
        System.out.println(str.replaceAll("<p[ \"a-zA-Z\\=0-9?]+>", "<p>"));
    }

    public static void hw7CurrentTime(String str) {
//        7. Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
//        один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append.
//        Сравните скорость их выполнения. Выведите сравнение на экран. System.currentTimeMillis().
        String newStr = "";
        long time1Start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            newStr += str;
        }
        long time1End = System.currentTimeMillis();
        System.out.println("Результат сложения строк с помощью оператора сложения: " + (time1End - time1Start));

        long time2Start = System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            strBuilder.append(str);
        }
        long time2End = System.currentTimeMillis();
        System.out.println("Результат сложения строк с помощью StringBuilder: " + (time2End - time2Start));

        System.out.println("Задание 7 - Разница: " + ((time1End - time1Start) - (time2End - time2Start)));
    }

}



