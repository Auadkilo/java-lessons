// Тема урока: Абстрактные классы


package Lesson41;

public class Cat extends Animal {

    // В наследниках можно вызвать конструктор абстрактного класса.
    public Cat() {
        super();
    }

    // Все абстрактные методы должны быть переопределены в классах потомках.
    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
