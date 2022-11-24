import java.util.Objects;

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

    public static final String ANSI_YELLOW = "\u001B[33m";// немного разукрасил вывод в консоль( а то выглядит скучно и уныло) =)
    public static final String ANSI_RESET = "\u001B[0m";
    @Override
    public String toString(){// показываем джаве как нужно выводить данные
        return ANSI_YELLOW + "Название книги " + ANSI_RESET +"\""+ nameBook + "\"" +
                ANSI_YELLOW +" год публикации "+ ANSI_RESET +  yearPublication+", "+ author;
    }

    @Override
    public boolean equals(Object o) {// сравниваем обьекты
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication &&
                Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {// присваиваем обьекту хешкод, возвращает число
        return Objects.hash(nameBook, yearPublication, author);
    }
}



