// Тема урока: Запись в файл

package Lesson44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson44 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/Lesson44/text.txt");

        // Для записи строки в файл можно использовать метод writeString().
        Files.writeString(path, "Новая строка");
    }
}
