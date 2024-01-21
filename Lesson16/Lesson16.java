// Тема урока: Тип возвращаемого объекта

// Методы могут возвращать значения.

package Lesson16;

public class Lesson16 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.name = "Геральт";
        cat.age = 2;

        // Метод getAgeMonth() возвращает целое число, поэтому необходимо присвоить его переменной с типом int.
        int month = cat.getAgeMonth();
        System.out.println("Возраст в месяцах: " + month);
    }
}

class Cat {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age);
    }

    // Для возврата значения из функции используется ключевое слово return.
    // Тип возвращаемого значения должен соответствовать типу метода.
    int getAgeMonth() {
        return age * 12;
    }
}