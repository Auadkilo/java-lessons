// Тема урока: Полиморфизм

package Lesson29;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав");
    }
}
