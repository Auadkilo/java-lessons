// Тема урока: Цикл For

package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {

        // Цикл for используется, когда известно число итераций.
        // for(начальная_точка; условие; оператор_счетчика) {тело_цикла}
        for(int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}
