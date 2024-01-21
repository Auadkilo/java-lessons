// Тема урока: Сериализация. Часть 3. Transient, serialVersionUID, Try-With-Resources.

package Lesson47;

import java.io.Serial;
import java.io.Serializable;

public class Cat implements Serializable {

    // serialVersionUID - идентификатор, который используется для сериализации/десериализации объекта класса.
    // Java использует serialVersionUID, чтобы убедиться, что загруженный класс и сериализованный объект совместимы.
    // Если serialVersionUID не указан в классе, то Java создаст его автоматически во время сериализации.
    // Важно помнить, что автоматическое создание serialVersionUID очень чувствительно к метаданным класса.
    // Поэтому рекомендуется явно объявлять serialVersionUID и менять его при изменении структуры класса.

    @Serial
    private static final long serialVersionUID = 902374910604635586L;
    private int id;
    private String name;

    // Если не нужно сериализовывать какое-то поле, необходимо использовать ключевое слово transient.
    private final transient int age; // при использовании transient после десериализации поле будет иметь значением по умолчанию.

    public Cat(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}