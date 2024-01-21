// Тема урока: Методы в java

// Метод - функция, которая определяет, что может делать класс и как он может обрабатывать данные.

package Lesson15;

public class Lesson15 {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.name = "Геральт";
        cat.age = 2;

        // Вызов метода на объекте.
        cat.speak();
    }
}

class Cat {
    String name;
    int age;

    // Метод класса.
    void speak() {
        System.out.println(name + ", " + age);
    }
}