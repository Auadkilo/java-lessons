// Тема урока: Цикл Do ... While

package Lesson8;

import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;

        // Цикл do .. while() используется, если нужно выполнить блок кода минимум один раз.
        do {
            System.out.println("Введи число 5");
            value = scanner.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели число 5");
    }
}
