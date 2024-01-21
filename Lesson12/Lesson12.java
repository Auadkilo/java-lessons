// Тема урока: Цикл for each

package Lesson12;

public class Lesson12 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Andrey";
        strings[1] = "Max";
        strings[2] = "Pavel";

        // Цикл for each можно использовать для перебора значений.
        // for (тип_переменной имя_переменной : набор_значений) {тело_цикла}.
        for(String string:strings) {
            System.out.println(string);
        }
    }
}
