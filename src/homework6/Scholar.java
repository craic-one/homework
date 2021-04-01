package homework6;


public class Scholar extends Human implements StudyAble{
    private String subject;
    private int knowledgeLevel;

    @Override
    public void study(int newSkill) {
        knowledgeLevel = knowledgeLevel + newSkill;
    }

    public String getSubject() {
        return subject;
    }

    public Scholar(String name, int age, String subject, int knowledgeLevel) {
        super(name, age);
        this.subject = subject;
        this.knowledgeLevel = knowledgeLevel;
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "subject='" + subject + '\'' +
                ", knowledgeLevel=" + knowledgeLevel +
                '}';
    }
}
