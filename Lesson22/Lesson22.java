// Тема урока: Ключевое слово final

package Lesson22;

public class Lesson22 {
    public static void main(String[] args) {
        // final используется при создании константы.
        final int X = 10;
    }
}

class Test {
    // При использовании константы внутри класса имеет смысл сделать ее static.
    public static final int Y = 5;
}