package lesson14homework.occupation;

import java.util.Scanner;

public class Techician extends sql {

    public Techician() {
    }

    public Techician(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Techician(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Techician(String name, String surname, int biirthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = biirthYear;
    }

    public Techician(String name, String surname, int birthYear, String street, int homeNumber) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    void TechicianDefault() {
        System.out.println("Defaul constructor called ");
    }

    void TechicianFirst() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname);
    }

    void TechicianSecond() {
        System.out.println("Name: " + this.name + " Birth year: " + this.birthYear);
    }

    void TechicianThird() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear);
    }

    void TechicianFourth() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear + " Street: " + this.street + " Home number: " + this.homeNumber);
    }

    public void Show() {

        this.TechicianDefault();
        this.TechicianFirst();
        this.TechicianSecond();
        this.TechicianThird();
        this.TechicianFourth();

    }

    public void TechicianName() {
        System.out.println(this.name);
    }

    public void TechicianSurname() {
        System.out.println(this.surname);
    }

    public void TechicianBirthYear() {
        System.out.println(this.homeNumber);
    }

    public void TechicianID() {
        System.out.println(this.ID);
    }

    public void TechicianStreet() {
        System.out.println(this.street);
    }

    public void TechicianHomeNumber() {
        System.out.println(this.homeNumber);
    }

    public void TechicianApartmentNumber() {
        System.out.println(this.apartmentNumber);
    }
    public void Atribut() {
        System.out.println("1. Name \n2. Surname \n3. Birth Year \n4. ID \n5. Street \n6. Home number \n7. apartment number");
        Scanner koni = new Scanner(System.in);
        int atribut = koni.nextInt();
        switch (atribut){
            case 1:
                TechicianName();
                break;
            case 2:
                TechicianSurname();
                break;
            case 3:
                TechicianBirthYear();
                break;
            case 4:
                TechicianID();
                break;
            case 5:
                TechicianStreet();
                break;
            case 6:
                TechicianHomeNumber();
                break;
            case 7:
                TechicianApartmentNumber();
                break;
        }
    }
}
