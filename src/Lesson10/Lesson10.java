// Тема урока: Оператор Switch

package Lesson10;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите бинарное число:");
        int value = scanner.nextInt();

        // Оператор switch продолжает программу в зависимости от значения.
        // Используется вместо if - else if - else, если сравнений слишком много.
        switch(value) {
            case 0:
                System.out.println("Вы ввели число 0");
                break;
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            default:
                System.out.println("Вы ввели не бинарное число");
        }
    }
}
