package lesson14homework.occupation;

public class Manager extends sql {

    public Manager() {
    }

    public Manager(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Manager (String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Manager (String name, String surname, int biirthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = biirthYear;
    }

    public Manager (String name, String surname, int birthYear, String street, int homeNumber) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    void ManagerDefault() {
        System.out.println("Defaul constructor called ");
    }

    void ManagerFirst() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname);
    }

    void ManagerSecond() {
        System.out.println("Name: " + this.name + " Birth year: " + this.birthYear);
    }

    void ManagerThird() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear);
    }

    void ManagerFourth() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear + " Street: " + this.street + " Home number: " + this.homeNumber);
    }

    public void Show() {

        this.ManagerDefault();
        this.ManagerFirst();
        this.ManagerSecond();
        this.ManagerThird();
        this.ManagerFourth();

    }
}
