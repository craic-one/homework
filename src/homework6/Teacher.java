package homework6;

public class Teacher extends Human implements LearnAble{
    private String article;

    @Override
    public void learn (Scholar scholar){
        if (scholar.getSubject() != article) return;
        scholar.study(15);
    }

    public String getArticle() {
        return article;
    }

    public Teacher(String name, int age, String article) {
        super(name, age);
        this.article = article;
    }
}
