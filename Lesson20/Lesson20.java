// Тема урока: Конструктор. Перегрузка методов

package Lesson20;

public class Lesson20 {
    public static void main(String[] args) {
        // Вызов первого конструктора без параметров.
        Cat cat1 = new Cat();
        cat1.getInfo();

        // Вызов второго конструктора с одним параметром.
        Cat cat2 = new Cat("Geralt");
        cat2.getInfo();

        // Вызов третьего конструктора с двумя параметрами.
        Cat cat3 = new Cat("Geralt", 2);
        cat3.getInfo();
    }
}

class Cat {
    private String name;
    private int age;

    // Имя конструктора должно совпадать с именем класса.
    public Cat() {
        System.out.println("Первый конструктор");
    }

    // Методы можно перегружать, т.е. методам с одинаковым именем указывать разное число параметров
    public Cat(String name) {
        System.out.println("Второй конструктор");
        this.name = name;
    }

    public Cat(String name, int age) {
        System.out.println("Третий конструктор");
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}