// Тема урока: Ввод данных. Класс Scanner

package Lesson7;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {

        // Класс Scanner предназначен для считывания значений пользователя.
        // Создание объекта класса: тип_объекта имя_объекта = new имя_класса().
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите что-нибудь:");
        String string = scanner.nextLine(); // на вход поступает строка
        System.out.println("Вы ввели: " + string);

        System.out.println("Введите число:");
        int number = scanner.nextInt(); // на вход поступает число
        System.out.println("Вы ввели число: " + number);
    }
}
