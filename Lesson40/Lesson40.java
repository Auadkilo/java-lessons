// Тема урока: Исключения. Часть 4. Обработка нескольких исключений.

package Lesson40;

import java.io.IOException;
import java.text.ParseException;

public class Lesson40 {
    public static void main(String[] args) {

        // Также выброшенные методы можно обрабатывать с помощью метода try / catch.
        try {
            test();
        } catch(IOException e) {
            System.out.println("Выброшено IOException");
        } catch(ParseException e) {
            System.out.println("Выброшено ParseException");
        }

        // В Java 7 появилось множественное catch.
        // Оно позволяет обработать сразу несколько исключений в одном блоке.
        try {
            test();
        } catch(IOException | ParseException e) {
            System.out.println("Выброшено исключение");
        }
    }

    // Бывают случаи, когда метод может выбросить несколько исключений.
    // В таком случае они перечисляются через запятую в сигнатуре метода.
    public static void test() throws IOException, ParseException {

    }
}
