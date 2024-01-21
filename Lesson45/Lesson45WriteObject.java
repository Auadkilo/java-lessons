// Тема урока: Сериализация. Часть 1

// Для сериализации объекта необходимо создать два потока:
// 1. FileOutputStream - будет записывать байты в файл.
// 2. ObjectOutputStream - будет преобразовывать объекты в байты.

package Lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson45WriteObject {
    public static void main(String[] args) throws IOException {
        Cat cat1 = new Cat(1, "Геральт");
        Cat cat2 = new Cat(2, "Мурзик");

        // Класс FileOutputStream является одной из реализаций класса OutputStream.
        // В конструктор класса передается либо путь к файлу (String), либо сам файл (File).
        FileOutputStream fileOutputStream = new FileOutputStream("src/Lesson45/cat.bin");

        // В конструктор класса ObjectOutputStream передается поток, в который производится запись.
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        // Запись объекта в байтах осуществляется с помощью метода writeObject().
        objectOutputStream.writeObject(cat1);
        objectOutputStream.writeObject(cat2);

        // После выполнения программы необходимо закрыть потоки.
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
