package homework5;

public class Author {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if (authorName == null || authorName.trim().length() > 2) {
            throw new IllegalArgumentException("Имя автора менее 2 знаков");
        }
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
