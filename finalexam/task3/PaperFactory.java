package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    // Method to add a person to the staff list
    public void addPerson(Person p) {
        staff.add(p);
    }

    // Method to delete a person from the staff list
    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    // Method to list all staff members
    public List<Person> getStaff() {
        return new ArrayList<>(staff);
    }

    // Method to save staff list to a file
    public void saveStaffToFile(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(staff);
        }
    }

    // Method to load staff list from a file
    public void loadStaffFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            staff = (List<Person>) ois.readObject();
        }
    }
}

