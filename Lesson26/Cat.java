// Тема урока: Интерфейсы

package Lesson26;

// Чтобы наследовать класс от интерфейса, необходимо использовать слово implements.
// Класс может наследоваться от нескольких интерфейсов (указываются через запятую).
public class Cat implements Info {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    // При наследовании интерфейса необходимо реализовать методы, чьи сигнатуры объявлены в интерфейсе.
    @Override
    public void showInfo() {
        System.out.printf("Моя кличка %s, мяу\n", name);
    }
}
