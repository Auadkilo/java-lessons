// Тема урока: Наследование

package Lesson25;

// Класс Cat наследуется от класса Animal.
// Для наследования используется ключевое слово extends.
// Класс может наследовать только один класс.

public class Cat extends Animal {

    // При переопределении метода необходимо использовать аннотацию @Override.
    @Override
    public void eat() {
        System.out.println("Я ем кошачий корм");
    }

    public void voice() {
        System.out.println("Я могу мяукать");
    }

    public void getName() {
        System.out.println(name);
    }
}
