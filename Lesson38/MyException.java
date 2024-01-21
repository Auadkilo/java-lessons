// Тема урока: Исключения. Часть 2. Выбрасывание исключений

package Lesson38;

// Для создания своего исключения нужно наследовать класс от класса Exception.
public class MyException extends Exception {
    public MyException(String description) {
        super(description);
    }
}
