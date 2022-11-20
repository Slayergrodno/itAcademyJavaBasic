package HomeWork11;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static HomeWork11.getDirOrFiles.getDirFiles;

public class HomeWork11 {
    public static void main(String[] args) {
        Random random = new Random();

//        1. Вывести список файлов и каталогов выбранного каталога на диске.
//        Файлы и каталоги должны быть распечатаны отдельно.

        System.out.println("Задание 1 - Список файлов и каталогов");
        File dir = new File("src/HomeWork11/work11");
        System.out.println("Директория - " + dir);
        System.out.println("Все папки в директории:");
        getDirFiles(dir, 1); //Вывод только папок
        System.out.println("Все файлы в директории:");
        getDirFiles(dir, 2); //Вывод только файлов
        System.out.println("Структура директории:");
        getDirFiles(dir, 0); //Вывод содержимого каталога

//        2. Создать файл с текстом, прочитать,
//        подсчитать в тексте количество знаков препинания и слов.
//        Вывести результат на экран.

        System.out.println("\nЗадание 2 - Подсчет количества знаков препинания и слов");
        File file2 = new File("src/HomeWork11/work11/doc.txt");
        if (file2.exists()) {
            FileReader fileReader = null;
            StringBuilder text2 = new StringBuilder();
            char[] punctuationMarks = {'.', ',', ';', '!', '?', '-', ':', '(', ')', '"'};
//            В русском языке используют десять знаков препинания:
//            точка
//            запятая
//            точка с запятой
//            многоточие - отдельная проверка
//            восклицательный знак
//            вопросительный знак
//            тире
//            двоеточие
//            скобки
//            кавычки.
            int sumMarks = 0;
            int sumTochka = 0;
            int tochka = 0;
            try {
                fileReader = new FileReader(file2);
                BufferedReader reader2 = new BufferedReader(fileReader);
                int symbol = reader2.read();
                while (symbol != -1) {
                    text2.append((char) symbol);
                    tochka++;
                    for (char a : punctuationMarks) {
                        if ((char) symbol == a) {
                            sumMarks++;
                            if ((char) symbol == '.') {
                                sumTochka++;
                            } else {
                                sumTochka = 0;
                            }
                        }
                        if (sumTochka >= 3 && Objects.equals(text2.substring(tochka - 3, tochka), "...")) {
                            sumMarks = sumMarks - 2;
                            sumTochka = 0;
                        }
                    }
                    symbol = reader2.read();
                }

                System.out.println(text2);
                List<String> words = new ArrayList<>(List.of(text2.toString().strip().split(" +")));
                System.out.println("Результаты обработки текста:\n" + words.size() + " слов;");
                System.out.println(sumMarks + " знаков препинания.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Файла не существует! \nСоздайте файл!");
        }

//        3. Создать файл с текстом, в котором присутствуют числа.
//        Найти все числа, вывести на экран, посчитать сумму вывести на экран,
//        убрать все повторяющиеся числа и снова вывести на экран.
        System.out.println("\nЗадание 3 - Подсчет чисел");
        File file3 = new File("src/HomeWork11/work11/number.txt");
        if (file3.exists()) {
            try (BufferedReader reader3 = new BufferedReader(new FileReader(file3))) {
                StringBuilder text3 = new StringBuilder();
                String number = "";
                number = reader3.readLine();
                while (number != null) {
                    text3.append(number).append("\n");
                    number = reader3.readLine();
                }
                System.out.println(text3);
                List<String> numbers = new ArrayList<>();
                Pattern p = Pattern.compile("-?\\d+");
                Matcher m = p.matcher(text3.toString());
                while (m.find()) {
                    numbers.add(m.group());
                }
                System.out.println("Результаты поиска:\nЧисла в тексте: " + numbers);
                int sum = 0;
                for (String element : numbers) {
                    sum += Integer.parseInt(element);
                }
                System.out.println("Сумма всех чисел в тексте = " + sum);
                Set<String> setNumbers = new HashSet<>(numbers);
                System.out.println("Числа в тексте без повторений: " + setNumbers);
                sum = 0;
                for (String element : setNumbers) {
                    sum += Integer.parseInt(element);
                }
                System.out.println("Сумма всех чисел в тексте без повторений = " + sum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файла не существует! \nСоздайте файл!");
        }

//        4. Записать с помощью Java в двоичный файл 20 случайных чисел.
//        Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.

        System.out.println("\nЗадание 4 - 20 случайный чисел");
        File file4 = new File("src/HomeWork11/work11/number20.txt");
        file4.delete();
        try {
            file4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataOutputStream txtDOS =
                     new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file4, true)))) {
            for (int i = 0; i < 20; i++) {
                txtDOS.writeInt(random.nextInt(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream txtDIS = new DataInputStream(new BufferedInputStream(new FileInputStream(file4)))) {
            ArrayList<Integer> num = new ArrayList<>();
            while (true) {
                try {
                    num.add(txtDIS.readInt());
                } catch (EOFException e) {
                    break;
                }
            }
            System.out.println(num + "\nСреднее арифметическое значение = " +
                    (double) (num.stream().mapToInt(i -> i).sum()) / num.toArray().length);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        5. Создать цепочку из трех папок.
//        В конечном каталоге создать 5 произвольных текстовых файлов.
//        Заполнить их 10 случайными целыми числами.
//        Содержимое файлов записать в один файл в том же каталоге.
//        Создать файл, который будет содержать список файлов данного каталога.

        System.out.println("\nЗадание 5 - Цепочка из 3 папок");
        File[] file5 = new File[5];

        for (int i = 0; i < 5; i++) {//Создаем массив файлов (5 файлов)
            file5[i] = new File("src\\HomeWork11\\work11\\11.1\\11.1.1\\11.1.1.1\\" + i + ".txt");
            file5[i].delete();
            try {
                file5[i].createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (File file : file5) {//Заполняем все файлы 10 случайными числами
            try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
                for (int j = 0; j < 10; j++) {
                    printWriter.println(random.nextInt(10));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File doc5 = new File("src\\HomeWork11\\work11\\11.1\\11.1.1\\11.1.1.1\\doc5.txt");
        doc5.delete();
        try {
            doc5.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printResult = new PrintWriter(new BufferedWriter(new FileWriter(doc5, true)))) {
            for (File fl : file5) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fl))) {
                    String read = "";
                    while (read != null) {
                        read = bufferedReader.readLine();
                        if (read != null) {
                            printResult.print(read + " ");
                        }
                    }
                    printResult.println();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File listFile5 = new File("src\\HomeWork11\\work11\\11.1\\11.1.1\\11.1.1.1\\list.txt");
        listFile5.delete();
        try {
            listFile5.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File directory = new File("src\\HomeWork11\\work11\\11.1\\11.1.1\\11.1.1.1\\");
        String[] list = directory.list();
        try (PrintWriter printList = new PrintWriter(new FileWriter(listFile5))) {
            for (String name : list) {
                printList.println(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Директория " + directory.getAbsolutePath());

//        6. Создать объект Person c полями name, surname, age.
//        Создать два массива (имена и фамилии).
//        Сгенерировать 10 объектов класса Person со случайным age и
//        случайно выбранными именами и фамилиями соответствующего типа.
//        С помощью Java создать файл, в который запишется информация о этих людях.

        System.out.println("\nЗадание 6 - объект Person");
        String[] surname = {"Surname1", "Surname2", "Surname3", "Surname4", "Surname5", "Surname6", "Surname7",
                "Surname8", "Surname9", "Surname0"};
        String[] name = {"User1", "User2", "User3", "User4", "User5", "User6", "User7", "User8", "User9", "User0"};

        File file6 = new File("src/HomeWork11/work11/Person.txt");
        file6.delete();
        try {
            file6.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream file6OOS = new ObjectOutputStream(new FileOutputStream(file6, true))) {
            for (int i = 0; i < 10; i++) {
                String surnameOfPerson = surname[random.nextInt(surname.length)];
                String nameOfPerson = name[random.nextInt(name.length)];
                Person person = new Person(surnameOfPerson, nameOfPerson, random.nextInt(100));
                file6OOS.writeObject(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream file6OIS = new ObjectInputStream(new FileInputStream(file6))) {
            Object o = file6OIS.readObject();
            Person p = null;
            while (true) {
                if (o instanceof Person) {
                    p = (Person) o;
                }
                if (p != null) {
                    System.out.println(p);
                }
                try {
                    o = file6OIS.readObject();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}