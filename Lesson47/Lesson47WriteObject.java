// Тема урока: Сериализация. Часть 3. Transient, serialVersionUID, Try-With-Resources.

package Lesson47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson47WriteObject {
    public static void main(String[] args) {

        // Класс (в т.ч. потоки), реализующий интерфейс AutoCloseable, необходимо освобождать с помощью метода close().
        // В 7-ой версии Java появилась конструкция Try-With-Resources, позволяющая делать это автоматически.

        try (ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("src/Lesson47/cat.bin"))) {
            Cat cat = new Cat(1, "Геральт", 5);
            objectOutputStream.writeObject(cat);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
