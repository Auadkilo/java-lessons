// Тема урока: Модификаторы доступа public, private, protected и default.

package Lesson28.Animal;

public class Animals {
    public static void main(String[] args) {
        // Константа D_CAT класса Cat имеет модификатор default, поэтому доступна только внутри пакета Animal
        System.out.println(Cat.D_CAT);

        // Переменная name класса Dog имеет модификатор protected, поэтому доступна внутри пакета Animal
        Dog dog = new Dog();
        System.out.println(dog.name);
    }
}
