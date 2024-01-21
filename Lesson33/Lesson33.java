// Тема урока: Введение в параметризацию (Generics)

package Lesson33;

import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args) {

        // В ArrayList можно хранить объекты любого типа.
        List animals1 = new ArrayList();
        animals1.add("cat");  // объект класса String

        // Однако такая реализация имела ряд минусов.
        // 1. Всегда приходилось использовать преобразователь типа.
        String animal1 = (String) animals1.get(0);

        // 2. Нет гарантии, что хранятся объекты одного типа.
        Animal animal = new Animal();
        animals1.add(animal);  // объект класса Animal не вызовет ошибки

        // Для устранения таких проблем в Java появились generics.
        // Под generics подразумевают возможность добавлять к типам типы-параметры. (ОсновнойТип<ТипПараметр>)
        List<String> animals2 = new ArrayList<String>();

        // В такой ArrayList можно добавить только объекты типа String.
        animals2.add("cat");
        animals2.add("dog");

        String animal2 = animals2.get(1); // преобразование типа не нужно
    }
}

class Animal {
    static String name = "Animal";
}