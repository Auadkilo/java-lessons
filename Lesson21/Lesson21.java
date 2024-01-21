// Тема урока: Ключевое слово static

// Static - модификатор, указывающий на привязку переменной или метода к текущему классу.

package Lesson21;

public class Lesson21 {
    public static void main(String[] args) {

        // Статистические переменные и методы класса создаются еще до создания объектов данного класса.
        Cat.getCountCats();

        Cat cat = new Cat("Geralt", 2);
        cat.getInfo();
    }
}

class Cat {
    private String name;
    private int age;
    private static int countCats;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        countCats++;
    }

    // Метод объекта
    // Можно использовать переменные объекта и статические переменные класса.
    public void getInfo() {
        System.out.println("name = "+ name + ", age = " + age + ", countCats = " + countCats);
    }

    // Метод класса (static)
    // Можно использовать только статические переменные класса.
    public static void getCountCats() {
        System.out.println("countCats = " + countCats);
    }
}