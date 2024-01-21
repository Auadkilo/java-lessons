// Тема урока: Модификаторы доступа public, private, protected и default.

package Lesson28.Animal;

public class Cat {
    // public - видимость для всех
    public static final String P_CAT = "public из класса Cat";  // обращение в классе Lesson28

    // default - видимость внутри пакета
    static final String D_CAT = "default из класса Cat";  // обращение в классе Test

    // private - видимость внутри класса
    private String name = "Геральт";

    // Переменная name класса Cat имеет модификатор private, поэтому доступна только внутри класса
    public String getName() {
        return name;
    }
}
