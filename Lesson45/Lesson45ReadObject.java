// Тема урока: Сериализация. Часть 1

/*
 * Для десериализации объекта необходимо создать два потока:
 * 1. FileInputStream - будет получать байты из файла.
 * 2. ObjectInputStream - будет преобразовывать байты в объекты, ранее записанные с использованием ObjectOutputStream.
 */

package Lesson45;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lesson45ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Класс FileInputStream является одной из реализаций класса InputStream.
        // В конструктор класса передается либо путь к файлу (String), либо сам файл (File).
        FileInputStream fileInputStream = new FileInputStream("src/Lesson45/cat.bin");

        // Класс ObjectInputStream является одной из реализаций класса InputStream.
        // В конструктор класса ObjectInputStream передается поток, из которого считываются байты.
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Преобразование объекта из байтов осуществляется с помощью метода readObject().
        // Метод readObject() возвращает объект класса Object.
        // Для преобразования класса Object к классу Cat применяется downcasting.
        // Метод readObject() может выбросить исключение ClassNotFoundException.
        // Это связано с тем, что в проекте может отсутствовать необходимый класс.

        Cat cat1 = (Cat) objectInputStream.readObject();
        Cat cat2 = (Cat) objectInputStream.readObject();

        System.out.println(cat1);
        System.out.println(cat2);

        // После выполнения программы необходимо закрыть потоки.
        objectInputStream.close();
        fileInputStream.close();
    }
}
