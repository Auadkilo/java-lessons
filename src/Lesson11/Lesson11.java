// Тема урока: Массивы

package Lesson11;

public class Lesson11 {
    public static void main(String[] args) {

        // Массив создается следующим образом:
        // тип_значений[] имя_массива = new тип_значений[количество_элементов]
        int[] numbers = new int[5];

        // Для перебора значений с обращением по индексу удобно использовать цикл for()
        // Метод length() возвращает количество элементов массива.
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
