// Тема урока: Операторы Break и Continue

package Lesson9;

public class Lesson9 {
    public static void main(String[] args) {
        int i = 0;

        // break - прекращает выполнение блока кода
        while(true) {
            if(i == 15) {
                System.out.println("Выход из цикла");
                break;
            }
            System.out.println(i);
            i++;
        }

        // continue - продолжает выполнение, пропустив блок кода
        for(int j = 0; j <= 15; j++) {
            if(j % 2 == 0) {
                continue;
            }
            System.out.println(j);
        }
    }
}
