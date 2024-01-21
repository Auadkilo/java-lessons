// Тема урока: Полиморфизм

// Полиморфизм - возможность использовать один и тот же метод для объектов разных классов.

package Lesson29;

public class Lesson29 {
    public static void main(String[] args) {

        // Можно обращаться к объекту класса через переменную родительского типа.
        Animal animal1 = new Dog();
        animal1.voice();

        Animal animal2 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Вызвав один и тот же метод с объектами разных классов, получим разный результат
        test(animal2);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.voice();
    }
}
