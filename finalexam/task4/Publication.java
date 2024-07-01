package finalexam.task4;

public class Publication {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Publication(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Override toString for easy display
    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}