// Тема урока: Чтение из файла

/*
 * В Java можно прочитать содержимое файла двумя способами:
 * 1. Используя java.io (File);
 * 2. Используя java.nio.file (Path, Paths, Files).
 */

package Lesson36;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Lesson36 {
    public static void main(String[] args) throws IOException {

        // Первый способ (java.io).
        // Класс File является абстрактным представлением путей к файлам и каталогам.

        // В разных ОС используются разные разделители при указании пути к файлу
        // Для получения разделителя в текущей ОС можно использовать статическую переменную separator класса File.
        String separator = File.separator;
        String path1 = "src" + separator + "Lesson36" + separator + "text.txt";

        // Экземпляры класса File являются неизменяемыми (immutable).
        // После создания абстрактный путь, представленный этим объектом, никогда не изменится.
        File file = new File(path1);

        // Для считывания данных из файла (источника) можно использовать класс Scanner.
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        // После выполнения действий над файлом необходимо закрыть поток ввода, чтобы не тратить ресурсы компьютера.
        scanner.close();

        /*
         * Второй способ (java.nio).
         * Класс Path представляет путь в файловой системе.
         * Класс Paths — класс с единственным статическим методом get().
         * Его создали исключительно для того, чтобы из переданной строки получить объект типа Path.
         */
        Path path2 = Paths.get("src/Lesson36/text.txt");

        /*
         * Files — класс, куда были вынесены статические методы из класса File.
         * Класс Files сосредоточен на управлении файлами и директориями.
         * Используя статические методы класса Files, можно создавать, удалять и перемещать файлы и директории.
         */

        // Чтобы прочитать файл, можно использовать метод readAllLines, который возвращает объект типа List<String>.
        List<String> list = Files.readAllLines(path2);

        // А далее вывести его с помощью цикла Foreach
        for (String string : list) {
            System.out.println(string);
        }
    }
}
