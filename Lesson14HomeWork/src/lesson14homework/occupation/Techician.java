package lesson14homework.occupation;

public class Techician extends sql {

    public Techician(){
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
}
