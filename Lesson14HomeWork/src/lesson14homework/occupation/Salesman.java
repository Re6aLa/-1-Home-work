package lesson14homework.occupation;

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
}
