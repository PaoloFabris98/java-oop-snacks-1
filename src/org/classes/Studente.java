package org.classes;

public class Studente {
    private String name;
    private String surname;
    private int age;

    public Studente(String Nome, String Cognome, int Age) {
        if (Nome != "" && Cognome != "" && Age > 0 && Age <= 100) {
            this.name = Nome;
            this.surname = Cognome;
            this.age = Age;
        } else {
            System.out.println("Uno o più campi sono errati.");
        }

    }

    public String nameReturning() {
        return this.name;
    }

    public String surnameReturning() {
        return this.surname;
    }

    public int ageReturning() {
        return this.age;
    }

}
