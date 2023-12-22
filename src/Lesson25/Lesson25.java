// Тема урока: Наследование

package Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        // Метод sleep() принадлежит классу Animal и наследуется классом Cat.
        cat.sleep();

        // Метод eat() принадлежит классу Animal, но переопределен классом Cat.
        cat.eat();

        // Метод voice() принадлежит классу Cat.
        cat.voice();

        // Метод getName() принадлежит классу Cat, но обращается к наследуемому полю от класса Animal.
        cat.getName();
    }
}
