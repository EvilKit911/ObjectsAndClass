public class Book  {
    String nameBook;
    int yearPublication;


    public Book(String nameBook, int yearPublication) {//конструктор для имени книги и года публикации
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;

    }

    public String getNameBook() {return this.nameBook;}// гетер для имени книги

    public int getYearPublication() {return this.yearPublication;}// гетер для года публикации

    public void setYearPublication(int yearPublication) {this.yearPublication = yearPublication;}// сетер
}


