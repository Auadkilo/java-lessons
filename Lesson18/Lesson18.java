// Тема урока: Инкапсуляция. Сеттеры и геттеры

// Инкапсуляция - это упаковка данных и функций в один компонент, а также последующий контроль доступа к этому компоненту.
// Доступ к объектам возможен через специальные открытые методы, а напрямую обратиться к их содержимому нельзя.

package Lesson18;

public class Lesson18 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        // При вызове метода set() пользователь устанавливает значения, не обращаясь напрямую к полям объекта.
        cat1.setName("Геральт");
        cat1.setAge(2);

        // При вызове метода get() пользователь получает значения, не обращаясь напрямую к полям объекта.
        System.out.println(cat1.getName() + ", " + cat1.getAge());
    }
}

class Cat {
    private String name;
    private int age;

    // Сеттер (set) - метод, который присваивает значение инкапсулированному полю.
    // Также в сеттерах может быть проверка введенного значения.

    public void setName(String username) {
        if (username.isEmpty()){
            System.out.println("Введено пустое имя");
        } else {
            name = username;
        }
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Введен отрицательный возраст");
        } else {
            age = userAge;
        }
    }

    // Геттер (get) - метод, который возвращает значение инкапсулированного поля.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}