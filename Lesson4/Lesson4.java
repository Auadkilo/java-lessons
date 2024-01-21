// Тема урока: Цикл While

package Lesson4;

public class Lesson4 {
    public static void main(String[]argv) {
        int value = 0;

        // Цикл while() используется, когда количество итераций не известно.
        // while(условие) {блок_кода}
        while(value < 5) {

            // Для изменения значения на единицу можно использовать:
            // 1. Инкремент (увеличение на единицу);
            // 2. Декремент (уменьшение на единицу).
            value++;
            System.out.println(value);
        }
    }
}
