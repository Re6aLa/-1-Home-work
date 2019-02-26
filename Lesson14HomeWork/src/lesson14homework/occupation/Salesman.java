package lesson14homework.occupation;

import java.util.Scanner;

public class Salesman extends sql {

    public Salesman() {
    }

    public Salesman(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Salesman(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Salesman(String name, String surname, int biirthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = biirthYear;
    }

    public Salesman(String name, String surname, int birthYear, String street, int homeNumber) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    void SalesmanDefault() {
        System.out.println("Defaul constructor called ");
    }

    void SalesmanFirst() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname);
    }

    void SalesmanSecond() {
        System.out.println("Name: " + this.name + " Birth year: " + this.birthYear);
    }

    void SalesmanThird() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear);
    }

    void SalesmanFourth() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear + " Street: " + this.street + " Home number: " + this.homeNumber);
    }

    public void Show() {

        this.SalesmanDefault();
        this.SalesmanFirst();
        this.SalesmanSecond();
        this.SalesmanThird();
        this.SalesmanFourth();

    }

    public void SalesmanName() {
        System.out.println(this.name);
    }

    public void SalesmanSurname() {
        System.out.println(this.surname);
    }

    public void SalesmanBirthYear() {
        System.out.println(this.birthYear);
    }

    public void SalesmanID() {
        System.out.println(this.ID);
    }

    public void SalesmanStreet() {
        System.out.println(this.street);
    }

    public void SalesmanhomeNumber() {
        System.out.println(this.homeNumber);
    }

    public void SalesmanApartmentNumber() {
        System.out.println(this.apartmentNumber);
    }
    public void Atribut() {
        System.out.println("1. Name \n2. Surname \n3. Birth Year \n4. ID \n5. Street \n6. Home number \n7. apartment number");
        Scanner koni = new Scanner(System.in);
        int atribut = koni.nextInt();
        switch (atribut){
            case 1:
                SalesmanName();
                break;
            case 2:
                SalesmanSurname();
                break;
            case 3:
                SalesmanBirthYear();
                break;
            case 4:
                SalesmanID();
                break;
            case 5:
                SalesmanStreet();
                break;
            case 6:
                SalesmanhomeNumber();
                break;
            case 7:
                SalesmanApartmentNumber();
                break;
        }
    }
}
