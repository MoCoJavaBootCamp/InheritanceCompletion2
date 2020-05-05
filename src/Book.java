public class Book extends Product {

    private String title;
    private String author;
    private int pages;

    Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString(){
        return "A novel by called " + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
