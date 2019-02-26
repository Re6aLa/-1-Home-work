package lesson14homework.occupation;

import java.util.Scanner;

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

        this.BookkeeperDefault();
        this.BookkeeperFirst();
        this.BookkeeperSecond();
        this.BookkeeperThird();
        this.BookkeeperFourth();

    }

    public void BookkeeperName() {
        System.out.println(this.name);
    }

    public void BookkeeperSurname() {
        System.out.println(this.surname);
    }

    public void BookkeeperBirthYear() {
        System.out.println(this.homeNumber);
    }

    public void BookkeeperID() {
        System.out.println(this.ID);
    }

    public void BookkeeperStreet() {
        System.out.println(this.street);
    }

    public void BookkeeperhomeNumber() {
        System.out.println(this.homeNumber);
    }

    public void BookkeeperApartmentNumber() {
        System.out.println(this.apartmentNumber);
    }

    public void Atribut() {
        System.out.println("1. Name \n2. Surname \n3. Birth Year \n4. ID \n5. Street \n6. Home number \n7. apartment number");
        Scanner koni = new Scanner(System.in);
        int atribut = koni.nextInt();
        switch (atribut) {
            case 1:
                BookkeeperName();
                break;
            case 2:
                BookkeeperSurname();
                break;
            case 3:
                BookkeeperBirthYear();
                break;
            case 4:
                BookkeeperID();
                break;
            case 5:
                BookkeeperStreet();
                break;
            case 6:
                BookkeeperhomeNumber();
                break;
            case 7:
                BookkeeperApartmentNumber();
                break;
        }

    }
}
