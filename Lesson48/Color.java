// Тема урока: Перечисления (Enum)

package Lesson48;

// Как и другие классы, Enum может иметь конструктор, поля и методы.

public enum Color {

    // Константы в Enum перечисляются через запятую.
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");

    private String code;

    // Конструктор Enum по умолчанию имеет модификатор доступа private, другой модификатор будет считаться ошибкой.
    // Поэтому создать константы с помощью конструктора можно только внутри Enum.
    Color(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    // При вызове метода value() будет автоматически вызван метод toString().
    @Override
    public String toString() {
        return "Color{code='" + code + "'}";
    }
}
