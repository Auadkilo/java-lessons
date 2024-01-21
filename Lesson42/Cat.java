// Тема урока: Метод equals() и String Pool

package Lesson42;

public class Cat {
    private String name = null;

    public Cat(String name) {
        this.name = name;
    }

    // Переопределение метода equals() для сравнения объектов на основе значений поля name.
    // Для повторения сигнатуры метода приходится в параметрах использовать объект класса Object.
    public boolean equals(Object obj) {

        // Для преобразования класса Object к классу Cat применяется downcasting.
        Cat cat = (Cat) obj;

        // Сравниваем необходимые поля и возвращаем результат сравнения.
        return this.name.equals(cat.name);
    }
}
