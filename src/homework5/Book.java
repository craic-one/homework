package homework5;

public class Book {
    private String bookName;
    private String author;
    private int pages;
    private int year;

    void setBookName(String bookName) {
        if (bookName == null || bookName.trim().length() < 1) {
            throw new IllegalArgumentException("Книга должна иметь название");
        }
        this.bookName = bookName;
    }

    void setAuthor(String author) {
        if (author == null || author.trim().length() < 1) {
            throw new IllegalArgumentException("Недопустимое количество знаков у автора");
        }
        this.author = author;
    }

    void setPages(int pages) {
        if (pages < 0) {
            throw new IllegalArgumentException("Количество страниц не может быть отрицательным");
        }
        this.pages = pages;
    }

    void setYear(int year) {
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", year=" + year +
                '}';
    }
}
