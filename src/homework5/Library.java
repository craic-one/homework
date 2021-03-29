package homework5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookName("Страдания на острове Ява");
        book1.setAuthor("Василий Петров");
        book1.setYear(2021);
        book1.setPages(304);

        System.out.println(book1);

    }
}
