package Lesson43;

public class Car {
    private String name;
    private static final int maxCountPeople = 5;

    // Вложенные нестатические классы нужны для описания подобъектов.
    // Особенности класса:
    // 1. Создаются как правило с модификатором доступа private;
    // 2. Не может существовать без объекта внешнего класса;
    // 3. Имеют доступ к полям и методам объекта класса;

    private class Motor {
        public void startMotor() {
            System.out.println("Запуск мотора машины " + name + " ...");
        }
    }

    // Вложенные статические классы нужны для получения статических полей или методов внешнего класса.
    // Особенности класса:
    // 1. Создаются с модификатором доступа public;
    // 2. Может существовать сам по себе;
    // 2. Имеют доступ только к статическим полям и методам;

    public static class Drawing {
        public void info() {
            System.out.println("Максимальное число людей в машине: " + maxCountPeople);
        }
    }

    public Car (String name) {
        this.name = name;
    }

    public void start() {
        // Создание объекта внутреннего класса происходит внутри внешнего класса.
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Машина готова к поездке !!!");
    }
}
