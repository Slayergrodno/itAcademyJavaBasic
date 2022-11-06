package HomeWork9;

import java.util.*;

public class HomeWork9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
//        1. Создать список оценок учеников с помощью ArrayList,
//        заполнить случайными оценками.
//        Удалить неудовлетворительные оценки из списка.
        System.out.println("Задание 1 - ArrayList (оценки)");
        List<Integer> schoolList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            schoolList.add(random.nextInt(20));
        }
        System.out.println("Рандомный ArrayList из 20 чисел: " + schoolList);
        for (int i = 0; i < schoolList.size(); i++) {
            //Оценка это не 0 и не выше 10;
            if (schoolList.get(i) == 0 || schoolList.get(i) > 10) {
                schoolList.remove(i);
                i--;
            }
        }
        System.out.println("ArrayList с оценками от 1 до 10: " + schoolList);

//        2. Создать коллекцию, заполнить ее случайными целыми числами.
//        Удалить повторяющиеся числа. Результат - коллекция без повторов.
        System.out.println("Задание 2 - List (коллекция без повторов)");
        List<Integer> listWithoutRepetitions = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listWithoutRepetitions.add(random.nextInt(20));
        }
        System.out.println("Рандомный List: " + listWithoutRepetitions);
        Set<Integer> setWithoutRepetitions = new HashSet<>(listWithoutRepetitions);
        System.out.println("Set без повторов: " + setWithoutRepetitions);

//        3. Создать список оценок учеников с помощью ArrayList,
//        заполнить случайными оценками.
//        Найти самую высокую оценку с использованием итератора.
        System.out.println("Задание 3 - ArrayList (Итератор)");
        List<Integer> maxSchoolList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            maxSchoolList.add(random.nextInt(10));
        }
        System.out.println("Рандомный ArrayList c отметками: " + maxSchoolList);
        Set<Integer> maxSchoolSet = new HashSet<>(maxSchoolList);
        System.out.println("Set без повторов отметок: " + maxSchoolSet);
        Iterator<Integer> iterator = maxSchoolSet.iterator();
        int maxIterator = iterator.next();
        int max;
        while (iterator.hasNext()) {
            max = iterator.next();
            if (max > maxIterator) {
                maxIterator = max;
            }
        }
        System.out.println("Самая высокая оценка, найденая с помощью итератора = " + maxIterator);

//        4. Ввести текст с клавиатуры.
//        Для текста создать Map, где ключом будет слово,
//        а значение – количество повторений этого слова в тексте.
        System.out.println("Задание 4 - Map (количество повторений)");
        System.out.println("Введите текст:");
        String text = sc.nextLine();
        text = text.strip().toLowerCase().replaceAll("[!\";%:?*()={}_+.,<>]", "");
        System.out.println("Отформатированный текст: " + text);
        List<String> textWords = new ArrayList<>(List.of(text.split(" +")));
        System.out.println("Массив слов: " + textWords);
        Set<String> textSet = new HashSet<>(textWords);
        System.out.println("Set : " + textSet);
        Map<String, Integer> textMap = new HashMap<>();
        Iterator<String> iteratorText = textSet.iterator();
        String key;
        int count;
        while (iteratorText.hasNext()) {
            key = iteratorText.next();
            count = 0;
            for (String word : textWords) {
                if (word.equals(key)) {
                    count++;
                }
            }
            textMap.put(key, count);
        }
        System.out.println("Созданный Map: " + textMap);
    }
}