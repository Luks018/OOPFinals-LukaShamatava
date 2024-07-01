package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        // Create a PaperFactory instance
        PaperFactory factory = new PaperFactory();

        // Create some Person instances
        Person person1 = new Person("Alex", "Magla", "123456789");
        Person person2 = new Person("George", "Mikautadze", "987654321");
        Person person3 = new Person("Xvicha", "Kvaracxelia", "555555555");

        // Add persons to the factory
        factory.addPerson(person1);
        factory.addPerson(person2);
        factory.addPerson(person3);

        // Print all staff members
        System.out.println("Staff members after adding:");
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
    }
}
