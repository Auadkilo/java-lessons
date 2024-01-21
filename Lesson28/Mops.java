// Тема урока: Модификаторы доступа public, private, protected и default.

package Lesson28;

import Lesson28.Animal.Dog;

public class Mops extends Dog {

    public static void main(String[] args) {
        // Переменная name класса Dog имеет модификатор protected, поэтому доступна внутри подкласса Mops
        Mops mops = new Mops();
        System.out.println(mops.name);
    }
}
