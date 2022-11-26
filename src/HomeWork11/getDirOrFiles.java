package HomeWork11;

import java.io.File;
import java.util.Objects;

public class getDirOrFiles {

    //        1. Вывести список файлов и каталогов выбранного каталога на диске.
    //        Файлы и каталоги должны быть распечатаны отдельно.
    public static void getDirFiles(File dir, int printTo) {
        //Если объект представляет каталог
        if (dir.isDirectory()) {
            // Получаем все вложенные объекты в каталоге
            for (File item : Objects.requireNonNull(dir.listFiles())) {
                if (item.isDirectory()) {
                    if (printTo == 1 || printTo == 0) {
                        System.out.println(item.getName() + "\t Папка");
                    }
                    File dirTo = new File(dir + "\\" + item.getName());
                    getDirFiles(dirTo, printTo);
                } else {
                    if (printTo == 2 || printTo == 0) {
                        System.out.println(item.getName() + "\t Файл");
                    }
                }
            }
        }
    }
}
