// Тема урока: Исключения. Часть 1. Обработка исключений.

// Исключения (Exception) - возникновение ошибок или непредвиденных ситуаций.
// Исключения могут возникать из-за неправильных действий пользователя, отсутствие ресурса на диске и т.д.

// В Java есть два варианта обработки исключений:
// 1. Использование throws в сигнатуре метода;
// 2. Использование конструкции try / catch.

// Также стоит помнить о том, что обработка исключений делегируется по иерархии вверх.

package Lesson37;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Lesson37 {

    // Использование try / catch позволяет самому обрабатывать исключения.
    public static void main(String[] args){
        try {
            // Блок кода, в котором может произойти исключение.
            test();  //  перехватывает исключение из метода
        } catch (IOException e) {
            // Блок кода, в котором происходит обработка исключения.
            System.out.println("Выброшено исключение");
        }
    }

    // Использование throws предупреждает Java о том, что может быть выброшено исключение.
    public static void test() throws IOException {
        Path path = Paths.get("qwerty.txt");
        List<String> list = Files.readAllLines(path);  // выбрасывает исключение, так как файл не найден
    }
}
