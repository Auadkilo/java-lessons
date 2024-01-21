// Тема урока: Пакеты (packages)

// Пакет (package)- это способ объединить группу классов, интерфейсов и подпакетов.
package Lesson27;

// Чтобы использовать классы или интерфейсы из другого пакета, необходимо их импортировать.
import Lesson27.Animal.Cat;

// Чтобы импортировать все из другого пакета, необходимо указать *.
import Lesson27.Detail.*;

public class Lesson27 {
    public static void main(String[] args) {

        // Создание объекта класса, который находится в пакете Animal.
        Cat cat = new Cat();

        // Создание объектов классов, которые находятся в пакете Details.
        Battery battery = new Battery();
        Engine engine = new Engine();
    }
}
