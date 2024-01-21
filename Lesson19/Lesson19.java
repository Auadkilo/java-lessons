// Тема урока: Ключевое слово this

package Lesson19;

public class Lesson19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Andrey");
        human.setAge(22);
        human.getInfo();
    }
}
class Human {
    private String name;
    private int age;

    // this - вызывает объект данного класса (в данном случае name и age).
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}