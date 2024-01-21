// Тема урока: Восходящее и нисходящее преобразование

package Lesson32;

public class Lesson32 {
    public static void main(String[] args) {

        Cat cat1 = new Cat();

        // Восходящее преобразование (upcasting) - преобразование от наследника к родителю.
        Animal animal = cat1;  // преобразование безопасно

        // Нисходящее преобразование (downcasting) - преобразование от родителя к наследнику.
        Cat cat2 = (Cat) animal;  // преобразование не безопасно в большинстве случаев
    }
}
