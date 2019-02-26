package lesson14homework.occupation;

import java.util.Scanner;

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
    
    public void programmerName(){
        System.out.println(this.name);
    }
    public void programmerSurname(){
        System.out.println(this.surname);
    }
    public void programmerBirthYear(){
        System.out.println(this.birthYear);
    }
    public void programmerID(){
        System.out.println(this.ID);
    }
    public void programmerStreet(){
        System.out.println(this.homeNumber);
    }
    public void programmerHomeNumber(){
        System.out.println(this.homeNumber);
    }
    public void programmerApartmentNumber(){
        System.out.println(this.apartmentNumber);
    }
    public void Atribut() {
        System.out.println("1. Name \n2. Surname \n3. Birth Year \n4. ID \n5. Street \n6. Home number \n7. apartment number");
        Scanner koni = new Scanner(System.in);
        int atribut = koni.nextInt();
        switch (atribut){
            case 1:
                programmerName();
                break;
            case 2:
                programmerSurname();
                break;
            case 3:
                programmerBirthYear();
                break;
            case 4:
                programmerID();
                break;
            case 5:
                programmerStreet();
                break;
            case 6:
                programmerHomeNumber();
                break;
            case 7:
                programmerApartmentNumber();
                break;
        }
    }
}
