// Тема урока: Исключения. Часть 2. Выбрасывание исключений

package Lesson38;

import java.util.Scanner;

public class Lesson38 {
    public static void main(String[] args) throws MyException{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Например, программа должна получать от пользователя любое число, кроме нуля.
        // Чтобы не произошло непредвиденных ситуаций, такой исключительный случай нужно обработать.
        if(number == 0) {

            // Ключевое слово throw позволяет выбросить исключение.
            // Выброшенное исключение все также обрабатывается с помощью throws или try / catch.
            throw new MyException("Пользователь ввел неверное значение");  // выброс своего исключения
        }
    }
}
