// Тема урока: Исключения. Часть 3. Checked и Unchecked исключения.

// В Java все исключения делятся на два типа:
// 1. Checked (Compile time Exception) - возникают во время компиляции. Являются исключительными случаями в программе.
// 2. Unchecked (Runtime Exception) - возникают во время выполнения программы. Являются ошибкой в работе программы.

package Lesson39;

public class Lesson39 {
    public static void main(String[] args) {
        // Одни из самых популярных Runtime Exception:

        // Деление на ноль (ArithmeticException):
        // int x = 1 / 0;

        // Выполнение на значении null (NullPointerException):
        String name = null;
        // name.length();

        // Выход за пределы массива (ArrayIndexOutOfBoundsException):
        int[] arr = new int[2];
        // System.out.println(arr[5]);
    }
}
