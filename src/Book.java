public class Book  {
    private String nameBook;
    private int yearPublication;

    private Author author;

    public Book(String nameBook, int yearPublication, Author author) {//конструктор для имени книги и года публикации
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getNameBook() {return this.nameBook;}// гетер для имени книги

    public int getYearPublication() {return this.yearPublication;}// гетер для года публикации

    public void setYearPublication(int yearPublication) {this.yearPublication = yearPublication;}// сетер
}


