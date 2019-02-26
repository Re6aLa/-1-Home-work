package lesson14homework.occupation;

import java.util.Scanner;

public class Lesson14HomeWork {

    public static void main(String[] args) {
        System.out.println("Choose, about want to learn: ");
        Bookkeeper book = new Bookkeeper(" Ana ", " Kristeva ", 1996, " V.Ckalov ", 11);
        Manager man = new Manager(" Antonina ", " Militan ", 1996, " Bolgar ", 80);
        Programmer It = new Programmer(" Danil ", " Kristev ", 1993, " V.Ckalov ", 11);
        Salesman sale = new Salesman(" Victor ", " Militan ", 1993, " Bolgar ", 80);
        Techician tex = new Techician(" Oleg ", " Kusursuz ", 1998, " M.Slavioglo ", 25);
          boolean Exit = true;
        while (Exit) {
        System.out.println("1. Bookkeeper " + "\n2. Mannager " + "\n3. Programmer " + " \n4. Mannager " + "\n5. Technician ");
        Scanner Jony = new Scanner(System.in);
        int choose = Jony.nextInt();
        
               
        switch (choose){
            case 1: 
                book.Show();
                System.out.println("");
                book.Atribut();
                break;
            case 2: 
                man.Show();
                System.out.println("");
                man.Atribut();
                break;
            case 3: 
                It.Show();
                System.out.println("");
                It.Atribut();
                break;
            case 4:
                sale.Show();
                System.out.println("");
                sale.Atribut();
                break;
            case 5:
                tex.Show();
                System.out.println("");
                tex.Atribut();
                break;
        }
                    System.out.println("1: Again");
                    System.out.println("2: Exit");
                    System.out.println("\nSelect continue or close ");
                    int feedback = Jony.nextInt();
                    switch (feedback) {
                        case 1: {
                            Exit = true;
                        }
                        break;
                        case 2: {
                            Exit = false;
                        }
                        break;
                        default:
                            System.out.println("Error choose write char operation");
                            Exit = false;
            }
        }
    }
}

