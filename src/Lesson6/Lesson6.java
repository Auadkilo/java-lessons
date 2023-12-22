// Тема урока: Оператор If

package Lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        int age = 18;

        // оператор if() используется для ветвления программы в зависимости от определенных условий
        if(age < 18) { // если, то
            System.out.println("Меньше 18");
        } else if(age > 18) { // иначе если, то
            System.out.println("Больше 18");
        } else { // иначе
            System.out.println("Ровно 18");
        }
    }
}
