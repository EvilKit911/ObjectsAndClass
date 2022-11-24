import java.util.Objects;

public class Author  {
    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName) {// конструктор для имени и фамилии автора
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){return this.firstName;}// гетер для имени автора
    public String getLastName(){return this.lastName;}//гетер для фамилили автора

    public static final String ANSI_YELLOW = "\u001B[33m";// нужно БОЛЬШЕ красок =)
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    @Override
    public String toString(){// показываем джаве как нужно выводить данные
        return ANSI_YELLOW + "Автор:" + ANSI_RESET + ANSI_PURPLE + "Имя"
                + ANSI_RESET + firstName + ANSI_PURPLE + " Фамилия " + ANSI_RESET + lastName;
    }
    @Override
    public boolean equals(Object o) {// сравниваем обьекты
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return getFirstName().equals(author.getFirstName())&& getLastName().equals(author.getLastName());
    }
    @Override
    public int hashCode() {// присваиваем обьекту хешкод, возвращает число
        return Objects.hash(firstName,lastName);
    }

}