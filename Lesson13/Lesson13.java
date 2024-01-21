// Тема урока: Многомерные массивы

package Lesson13;

public class Lesson13 {
    public static void main(String[] args) {

        // Количество квадратных скобок должно соответствовать размерности массива.
        int[][] matrix = {{0, 1, 2, 3},{4, 5, 6},{7, 8, 9}};

        // Для обхода многомерного массива используются вложенные циклы for().
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
