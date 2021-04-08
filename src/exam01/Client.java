package exam01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Client {
    private final String name;
    private final int yearbirth;

    public Client(String name, int yearbirth) {
        this.name = Objects.requireNonNull(name, "Клиент обязан внести свое имя");
        if ((LocalDate.now().getYear() - yearbirth) < 18) {
            throw new IllegalArgumentException("Возраст не может быть меньше 18 лет");
        }
        this.yearbirth = yearbirth;
    }

    public String getName() {
        return name;
    }

    public int getYearbirth() {
        return yearbirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", yearbirth=" + yearbirth +
                '}';
    }
}
