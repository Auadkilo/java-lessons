// Тема урока: Сериализация. Часть 1

package Lesson45;

import java.io.Serializable;

// Для сериализации объекта класса Cat нужно реализовать интерфейс Serializable.
// Интерфейс Serializable не содержит методов, но предоставляет Java информацию о том, что класс можно сериализовать.

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
