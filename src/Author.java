public class Author {
    String firstName;
    String lastName;

    public Author (String firstName, String lastName) {// конструктор для имени и фамилии автора
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){return this.firstName;}// гетер для имени автора
    public String getLastName(){return this.lastName;}//гетер для фамилили автора

}