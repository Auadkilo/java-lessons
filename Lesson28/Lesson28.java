// Тема урока: Модификаторы доступа public, private, protected и default.

// Модификатор доступа - это ключевые слова, с помощью которых можно задать область действия данных.
// Они позволяют регулировать уровень доступа к различным частям кода.

package Lesson28;

import Lesson28.Animal.Cat;

public class Lesson28 {

    public static void main(String[] args) {
        // Константа P_CAT в классе Cat имеет модификатор public, поэтому доступна везде.
        System.out.println(Cat.P_CAT);
    }
}
