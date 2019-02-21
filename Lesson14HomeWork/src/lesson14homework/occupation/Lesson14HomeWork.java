package lesson14homework.occupation;

public class Lesson14HomeWork {

    public static void main(String[] args) {

        System.out.println("Bookkeeper: ");
        System.out.println("");
        Bookkeeper book = new Bookkeeper(" Ana ", " Kristeva ", 1996, " V.Ckalov ", 11);
        book.Show();
        System.out.println("");

        System.out.println(" Manager: ");
        System.out.println("");
        Manager man = new Manager(" Antonina ", " Militan ", 1996, " Bolgar ", 80);
        man.Show();
        System.out.println("");

        System.out.println(" Programmer ");
        System.out.println("");
        Programmer It = new Programmer(" Danil ", " Kristev ", 1993, " V.Ckalov ", 11);
        It.Show();
        System.out.println("");
        

        System.out.println("Salesman: ");
        System.out.println("");
        Salesman sale = new Salesman(" Victor ", " Militan ", 1993, " Bolgar ", 80);
        sale.Show();
        System.out.println("");

        System.out.println("Techician: ");
        System.out.println("");
        Techician tex = new Techician(" Oleg ", " Kusursuz ", 1998, " M.Slavioglo ", 25);
        tex.Show();
        System.out.println("");

    }

}
