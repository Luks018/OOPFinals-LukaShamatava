package finalexam.task4;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class PublishingCompany implements LegalEntity {
    private String companyName;
    private String address;
    private String vatNumber;
    private List<Publication> publications;

    // Constructor
    public PublishingCompany(String companyName, String address, String vatNumber) {
        this.companyName = companyName;
        this.address = address;
        this.vatNumber = vatNumber;
        this.publications = new ArrayList<>();
    }

    // Implementing the methods from LegalEntity interface
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    // Method to add a publication
    public void addPublication(Publication publication) {
        publications.add(publication);
    }

    // Method to get the list of publications
    public List<Publication> getPublications() {
        return publications;
    }

    // Override toString for easy display
    @Override
    public String toString() {
        return "PublishingCompany{" +
                "companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                ", publications=" + publications +
                '}';
    }
}