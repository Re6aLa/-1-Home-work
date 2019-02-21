package lesson14homework.occupation;

public class Bookkeeper extends sql {

    public Bookkeeper() {
    }

    public Bookkeeper(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Bookkeeper(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Bookkeeper(String name, String surname, int biirthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = biirthYear;
    }

    public Bookkeeper(String name, String surname, int birthYear, String street, int homeNumber) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    void BookkeeperDefault() {
        System.out.println("Defaul constructor called ");
    }

    void BookkeeperFirst() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname);
    }

    void BookkeeperSecond() {
        System.out.println("Name: " + this.name + " Birth year: " + this.birthYear);
    }

    void BookkeeperThird() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear);
    }

    void BookkeeperFourth() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear + " Street: " + this.street + " Home number: " + this.homeNumber);
    }

    public void Show() {

//        Bookkeeper book = new Bookkeeper();
        this.BookkeeperDefault();
        this.BookkeeperFirst();
        this.BookkeeperSecond();
        this.BookkeeperThird();
        this.BookkeeperFourth();

    }
}