// Тема урока: Сериализация. Часть 2. Сериализация массивов.

// Существует два способа сериализовать массив объектов:
// 1 способ - сериализовать объекты в массиве;
// 2 способ - сериализовать массив.

package Lesson46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lesson46WriteObject {
    public static void main(String[] args) throws IOException {

        // Массив объектов класса Cat.
        Cat[] cats = {
                new Cat(1, "Геральт"),
                new Cat(2, "Мурзик"),
                new Cat(3, "Барсик")
        };

        // Поток для первого способа.
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("src/Lesson46/cat1.bin"));

        // Поток для второго способа.
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("src/Lesson46/cat2.bin"));

        // Для сериализации первым способом нужно выполнить несколько действий.
        // Первой строкой в файл необходимо записать количество сериализованных объектов.
        objectOutputStream1.writeInt(cats.length);

        // После необходимо сериализовать каждый объект в массиве, используя цикл foreach.
        for (Cat cat : cats) {
            objectOutputStream1.writeObject(cat);
        }

        // Для сериализации вторым способом необходимо в метод writeObject() передать сам массив.
        // Такое возможно, потому что массив тоже является объектов.
        objectOutputStream2.writeObject(cats);

        objectOutputStream1.close();
        objectOutputStream2.close();
    }
}
