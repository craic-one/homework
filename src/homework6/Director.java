package homework6;

public class Director extends Human {

    public void startDay() {
        System.out.println("Начало учебного дня");

    }

    public void endDay() {
        System.out.println("Конец учебного дня");
    }

    public Director(String name, int age) {
        super(name, age);
    }
}
