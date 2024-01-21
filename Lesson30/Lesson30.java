// Тема урока: Приведение примитивных типов данных

package Lesson30;

public class Lesson30 {
    public static void main(String[] args) {

        // Чтобы double конвертировать во float используется буква F.
        float floatValue = 123.3F;

        // Чтобы integer конвертировать во long используется буква L.
        long longValue = 123123123L;

        int intValue = 130;

        longValue = intValue;  // неявное преобразование

        intValue = (int)longValue;  // явное преобразование

        byte byteValue = (byte)intValue;  // т.к byte от -128 до 127, максимальное значение превышено

        System.out.println(byteValue);

    }
}
