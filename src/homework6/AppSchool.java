package homework6;

import java.util.Arrays;

public class AppSchool {
    public static void main(String[] args) {
        Scholar[] scholars = new Scholar[22];
        Scholar scholar = new Scholar("Петр", 12, "химия", 15);
        scholars[0] = scholar;
        Teacher teacher = new Teacher("Вера Семеновна", 58, "геометрия");
        Teacher[] teachers = new Teacher[10];
        teachers[0] = teacher;
        Director director = new Director("Сергей Алексеевич", 45);
        School school = new School("Земля вверх дном Школа", director, teachers, scholars);

        school.daySchool();

        System.out.println(Arrays.toString(scholars));
    }
}
