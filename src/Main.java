public class Main {
    public static void main(String[] args) {
        Author morzov = new Author( " Фёдор "," Моржов ");
        Book bilini = new Book(" Былины ", 1998, morzov );
        Author livanov = new Author(" Василий ", " Ливанов ");
        Book skazka = new Book(" Дед мороз и лето ", 1969,livanov);
        System.out.println(skazka.getNameBook() + livanov.getFirstName() + livanov.getLastName() + skazka.getYearPublication());
        System.out.println(" ");

        System.out.println(bilini.getNameBook() + morzov.getFirstName() + morzov.getLastName() + bilini.getYearPublication());

        bilini.setYearPublication(1999);
        System.out.println("после сетера года");
        System.out.println(bilini.getNameBook() + morzov.getFirstName() + morzov.getLastName() + bilini.getYearPublication());
    }
}