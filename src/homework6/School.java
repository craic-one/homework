package homework6;

public class School {
    private String name;
    private Director director;
    private Teacher[] teachers;
    private Scholar[] scholars;

    public void daySchool() {
        director.startDay();
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) break;
            for (int j = 0; j < scholars.length; j++) {
                if (scholars[j] == null) break;
                if (teachers[i].getArticle().equals(scholars[j].getSubject())) {
                    teachers[i].learn(scholars[j]);
                }
                director.endDay();
            }
        }
    }

    public School(String name, Director director, Teacher[] teachers, Scholar[] scholars) {
        this.name = name;
        this.director = director;
        this.teachers = teachers;
        this.scholars = scholars;
    }
}
