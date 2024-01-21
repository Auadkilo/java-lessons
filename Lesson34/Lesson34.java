// Тема урока: Wildcards (Generics)

package Lesson34;

import java.util.ArrayList;
import java.util.List;

// Wildcard переводится как "подстановочный знак".

public class Lesson34 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Животное-1"));
        animals.add(new Animal("Животное-2"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Кот-1"));
        cats.add(new Cat("Кот-2"));

        test1(animals);
        test2(animals);
        test2(cats);
    }

    // Cat является наследником Animal, однако List<Cat> не является наследником List<Animal>.
    // Поэтому вызов метода test1(cats) вызовет ошибку, т.к. List<Cat> не наследник List<Animal>.

    private static void test1(List<Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }

    // Чтобы передать и List<Cat>, и List<Animal>, можно использовать wildcard - "<?>".
    // Wildcards бывает двух типов:
    // 1) <? extends Class> - Upper Bounded Wildcards (подстановочные знаки с верхними границами).
    // 2) <? super Class> - Lower Bounded Wildcards (подстановочные знаки с нижними границами).

    private static void test2(List<? extends Animal> list) {
        for(Animal animal : list) {
            System.out.println(animal);
        }
    }
}
