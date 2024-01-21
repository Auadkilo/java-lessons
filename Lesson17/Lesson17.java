// Тема урока: Параметры метода

// Параметры метода — это значения, которые передаются в метод при вызове.
// Метод может принимать сколько угодно параметров.

package Lesson17;

public class Lesson17 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        // Тип передаваемых данных должен совпадать.
        cat.setName("Геральт"); // String name
        cat.setAge(2); // int age

        // Вызов метода может быть без параметров.
        cat.speak();
    }
}

class Cat {
    String name;
    int age;

    public void setName(String username) {
        name = username;
    }

    public void setAge(int userAge) {
        age = userAge;
    }

    public void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age);
    }
}