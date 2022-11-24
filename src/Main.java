public class Main {
    public static void main(String[] args) {
        Author morzov = new Author( " Фёдор "," Моржов ");
        Book bilini = new Book("Былины", 1998 , morzov );
        Author livanov = new Author(" Василий ", " Ливанов ");
        Book skazka = new Book("Дед мороз и лето", 1969 ,livanov);
        Author livanov1 = new Author(" Василий ", " Ливанов ");//для проверки
        Book skazka1 = new Book("Дед мороз и лето", 1969 ,livanov);//для проверки
        System.out.println(bilini);
        System.out.println(" ");
        System.out.println("после сетера года");
        bilini.setYearPublication(1999);
        System.out.println(" ");
        System.out.println(bilini);
        System.out.println(" ");
        System.out.println(skazka);
        System.out.println(" ");
        System.out.println(livanov.equals(livanov1));
        System.out.println(skazka.equals(skazka1));
        System.out.println(" ");
        System.out.println(skazka.hashCode());
    }
    }
