package lesson14homework.occupation;

public class Programmer extends sql {

    public Programmer() {
    }


    public Programmer (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Programmer (String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Programmer (String name, String surname, int biirthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = biirthYear;
    }

    public Programmer (String name, String surname, int birthYear, String street, int homeNumber) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    void ProgrammerDefault() {
        System.out.println("Defaul constructor called ");
    }

    void ProgrammerFirst() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname);
    }

    void ProgrammerSecond() {
        System.out.println("Name: " + this.name + " Birth year: " + this.birthYear);
    }

    void ProgrammerThird() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear);
    }

    void ProgrammerFourth() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Birth year: " + this.birthYear + " Street: " + this.street + " Home number: " + this.homeNumber);
    }

    public void Show() {

        this.ProgrammerDefault();
        this.ProgrammerFirst();
        this.ProgrammerSecond();
        this.ProgrammerThird();
        this.ProgrammerFourth();

    }
}
