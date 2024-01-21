// Тема урока: Модификаторы доступа public, private, protected и default.

package Lesson28.Animal;

public class Dog {
    // protected - видимость для пакета и всех подклассов
    protected String name;

    public Dog() {
        name = "Бобик";
    }
}
