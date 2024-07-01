package finalexam.task3;

import java.io.IOException;

public class FactoryTester {
    public static void main(String[] args) {
        try {
            // Create a PaperFactory instance
            PaperFactory factory = new PaperFactory();

            // Create some Person instances
            Person person1 = new Person("George", "Mikautadze", "123456789");
            Person person2 = new Person("Xvicha", "Kvaracxelia", "987654321");
            Person person3 = new Person("Alex", "Magla", "555555555");

            // Add persons to the factory
            factory.addPerson(person1);
            factory.addPerson(person2);
            factory.addPerson(person3);

            // Save the staff list to a file
            factory.saveStaffToFile("staff.dat");

            // Print all staff members
            System.out.println("Staff members after adding:");
            for (Person p : factory.getStaff()) {
                System.out.println(p);
            }

            // Clear the current staff list by creating a new factory instance
            factory = new PaperFactory();

            // Load the staff list from the file
            factory.loadStaffFromFile("staff.dat");

            // Print all staff members after loading from file
            System.out.println("\nStaff members after loading from file:");
            for (Person p : factory.getStaff()) {
                System.out.println(p);
            }

            // Delete a person from the factory
            boolean isDeleted = factory.deletePerson(person2);

            // Print the result of the deletion and the remaining staff members
            System.out.println("\nPerson deleted: " + isDeleted);
            System.out.println("Staff members after deletion:");
            for (Person p : factory.getStaff()) {
                System.out.println(p);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

