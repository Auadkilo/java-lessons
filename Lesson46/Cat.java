// Тема урока: Сериализация. Часть 2. Сериализация массивов.

package Lesson46;

import java.io.Serializable;

public class Cat implements Serializable {
    private int id;
    private String name;

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}