package kz.attractor.java.lesson44;

public class Book {
    private String img;
    private String name;
    private String author;
    private String genre;
    private Integer year;

    public Book(String img,String name, String author, String genre, Integer year) {
        this.img = img;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
