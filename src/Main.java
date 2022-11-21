public class Main {
    public static void main(String[] args) {
Book bilini = new Book(" Былины ", 1998);
Book skazka = new Book("Дед мороз и лето", 1969);

Author bilini1 = new Author( " Фёдор "," Моржов ");
Author skazka1 = new Author("Василий", "Ливанов");
        System.out.println(bilini.getNameBook() + bilini.getYearPublication() + bilini1.getFirstName() + bilini1.getLastName());
        bilini.setYearPublication(1999);
        System.out.println(bilini.getYearPublication());
    }
}