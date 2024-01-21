// Тема урока: Класс Object и метод toString()

// Все классы в java наследуются от класса Object.
// При передаче объекта в метод объекта out скрыто вызывается наследуемый от класса Object метод toString().
// Метод toString() возвращает строковое представление объекта (ClassName + hashCode).

package Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Cat cat = new Cat("Geralt", 2);
        System.out.println(cat);
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Наследуемые методы можно переопределять, для этого необходимо повторить сигнатуру метода.
    // В данном случае сигнатура метода: public String toString().
    public String toString() {
        return(name + ", " + age);
    }
}