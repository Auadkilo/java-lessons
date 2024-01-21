// Тема урока: Перечисления (Enum)

// Enum - особый тип класса, содержащий набор логически связанных констант.
// Константы заранее документируют список доступных значений и позволяют избежать неожиданного поведения.

package Lesson48;

import java.util.Arrays;

public class Lesson48 {
    public static void main(String[] args) {

        // Создание объекта Enum (обращение к константе).
        Color color = Color.RED;

        // Константы Enum удобно использовать в операторе switch.
        switch (color) {
            case RED:
                System.out.println("color='red', code='" + color.getCode() + "'");
                break;
            case BLUE:
                System.out.println("color='blue', code='" + color.getCode() + "'");
                break;
            case GREEN:
                System.out.println("color='green', code='" + color.getCode() + "'");
                break;
        }

        // У Enum есть свои методы, которых нет в других классах.

        // 1. values() - возвращает массив всех констант в Enum значений.
        System.out.println(Arrays.toString(Color.values()));

        // 2. ordinal() - возвращает порядковый номер константы в Enum (нумерация начинается с нуля).
        System.out.println(Color.GREEN.ordinal());

        // 3. valueOf() - возвращает объект Enum, соответствующий переданному имени.
        System.out.println(Color.valueOf("BLUE"));
    }
}