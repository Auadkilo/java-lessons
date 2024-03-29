// Тема урока: Вложенные классы

// Вложенные классы - классы, полностью определенные внутри другого класса.
// Главная задача вложенных классов - дополнять внешний класс, расширяя его возможности или упрощая взаимодействие.

// В Java есть два типа вложенных классов:
// 1. Нестатические вложенные классы (non-static nested classes) или внутренние классы (inner class);
//    1.1. Локальный класс (local class);
//    1.2. Анонимный класс (anonymous class);
// 2. Статические вложенные классы (static nested classes).

package Lesson43;

public class Lesson43 {
    public static void main(String[] args) {
        Car car = new Car("Dodge");
        car.start();

        // Объекты статического внутреннего класса создаются через имя внешнего класса, в котором он объявлен.
        Car.Drawing drawing = new Car.Drawing();
        drawing.info();
    }
}
