package lesson14homework.occupation;

import java.util.Scanner;

public class Manager extends sql {

    public Manager() {
    }

    public Manager(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Manager(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Manager(String name, String surname, int biirthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = biirthYear;
    }

    public Manager(String name, String surname, int birthYear, String street, int homeNumber) {
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

    public void ManagerName() {
        System.out.println(this.name);
    }

    public void ManagerSurname() {
        System.out.println(this.surname);
    }

    public void ManagerBirthYear() {
        System.out.println(this.homeNumber);
    }

    public void ManagerID() {
        System.out.println(this.ID);
    }

    public void ManagerStreet() {
        System.out.println(this.street);
    }

    public void ManagerhomeNumber() {
        System.out.println(this.homeNumber);
    }
    public void ManagerApartmenNumber(){
        System.out.println(this.apartmentNumber);
    }
   public void Atribut() {
        System.out.println("1. Name \n2. Surname \n3. Birth Year \n4. ID \n5. Street \n6. Home number \n7. apartment number");
        Scanner koni = new Scanner(System.in);
        int atribut = koni.nextInt();
        switch (atribut){
            case 1:
                ManagerName();
                break;
            case 2:
                ManagerSurname();
                break;
            case 3:
                ManagerBirthYear();
                break;
            case 4:
                ManagerID();
                break;
            case 5:
                ManagerStreet();
                break;
            case 6:
                ManagerhomeNumber();
                break;
            case 7:
                ManagerApartmenNumber();
                break;
        }
    }
}