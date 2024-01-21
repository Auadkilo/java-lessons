// Тема урока: Сериализация. Часть 3. Transient, serialVersionUID, Try-With-Resources.

package Lesson47;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lesson47ReadObject {
    public static void main(String[] args) {

        // Класс (в т.ч. потоки), реализующий интерфейс AutoCloseable, необходимо освобождать с помощью метода close().
        // В 7-ой версии Java появилась конструкция Try-With-Resources, позволяющая делать это автоматически.

        try (ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("src/Lesson47/cat.bin"))) {
            Cat cat = (Cat) objectInputStream.readObject();
            System.out.println(cat);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
