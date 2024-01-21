// Тема урока: Интерфейсы

package Lesson26;

// Чтобы наследовать класс от интерфейса, необходимо использовать слово implements.
// Класс может наследоваться от нескольких интерфейсов (указываются через запятую).
public class Fish implements Info{
    private String color;

    public Fish(String color) {
        this.color = color;
    }

    // При наследовании интерфейса необходимо реализовать методы, чьи сигнатуры объявлены в интерфейсе.
    @Override
    public void showInfo() {
        System.out.printf("Я %s рыбка\n", color);
    }
}
