package finalexam.task3;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private String personalNumber;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", personalNumber='" + personalNumber + '\'' +
                '}';
    }
}

