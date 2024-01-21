// Тема урока: Сериализация. Часть 2. Сериализация массивов.

// Каждому способу сериализации массива объектов соответствует свой способ десериализации:
// 1 способ - десериализовать объекты в массив;
// 2 способ - десериализовать массив.

package Lesson46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Lesson46ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Поток для первого способа.
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("src/Lesson46/cat1.bin"));

        // Поток для второго способа.
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("src/Lesson46/cat2.bin"));

        // Для десериализации первым способом сначала нужно достать количество объектов из файла.
        int countCats = objectInputStream1.readInt();

        // Потом необходимо создать массив объектов класса, куда будут десериализованы объекты из файла.
        Cat[] cats1 = new Cat[countCats];

        // Последним действием останется десериализовать объекты, используя цикл for.
        for (int i = 0; i < countCats; i++) {
            // Для преобразования класса Object применяется downcasting.
            cats1[i] = (Cat) objectInputStream1.readObject();
        }

        // Вывести объекты можно используя класс Arrays и метод toString(), в который нужно передать массив.
        System.out.println(Arrays.toString(cats1));

        // При использовании второго способа необходимо создать массив объектов и десериализовать массив (как объект) из файла.
        Cat[] cats2 = (Cat[]) objectInputStream2.readObject();

        // Вывести объекты можно используя класс Arrays и метод toString(), в который нужно передать массив.
        System.out.println(Arrays.toString(cats2));

        objectInputStream1.close();
        objectInputStream2.close();
    }
}
