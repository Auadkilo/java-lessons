// Тема урока: Класс StringBuilder и форматирование строк printf()

// В Java существуют два типа объектов:
// 1. mutable - изменяемый;
// 2. immutable - неизменяемый.

package Lesson23;

public class Lesson23 {
    public static void main(String[] args) {

        // Объекты класса String относятся к типу immutable.
        String s1 = "hello";
        String s2 = " my";
        String s3 = " friend";

        // При конкатенации строк создаются лишние строки.
        String s = s1 + s2 + s3; // s1 + s2 + s3 --> s12 + s3 = s
        System.out.println(s);

        // Для того чтобы не создавать лишние строки, существует класс StringBuilder.
        StringBuilder sb = new StringBuilder();

        // Method Chaining (цепочки) - вызов метода один за другим.
        sb.append(s1).append(s2).append(s3);
        System.out.println(sb);

        // Существует метод printf() для форматирования строк.
        // Параметр %s - String;
        System.out.printf("String: %s\n", "str");
        // Параметр %d - Digit;
        System.out.printf("Digit: %d\n", 10);
        // Параметр %[ширина][округление]f - Float.
        System.out.printf("Float: %.2f\n", 33.337);
    }
}
