// Тема урока: Метод equals() и String Pool

package Lesson42;

// Для проверки равенства двух объектов используется метод equals(), который наследуется от класса Object.

public class Lesson42 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Геральт");
        Cat cat2 = new Cat("Геральт");

        // Для сравнения объектов не подходит операция "==", т.к. она сравнивает ссылки на эти объекты.
        System.out.println(cat1 == cat2);

        // По умолчанию метод equals() тоже сравнивает объекты по ссылкам.
        // Поэтому, чтобы сравнить объекты на основе их значений, необходимо переопределить метод equals() внутри класса.
        System.out.println(cat1.equals(cat2));

        // При первом создании строки она помещается в String Pool.
        // При повторном создании такой же строки переменные будут ссылаться на одну строку в String Pool.
        String string1 = "строка";                  // string1   ->   {строка}
        String string2 = "строка";                  // string1, string2   ->   {строка}

        // Операция "==" сравнивает ссылки, а метод equals() сравнивает именно строки.
        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        // При создании строк с использованием методов будут созданы разные объекты.
        String string3 = "str";                     // string3   ->   {str}
        String string4 = "str123".substring(0, 3);  // string4   ->   {str}

        // В таком случае операция "==" уже не сработает, а метод equals() успешно сравнит строки.
        System.out.println(string3 == string4);
        System.out.println(string3.equals(string4));
    }
}