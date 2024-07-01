package finalexam.task1;

public class Computer {
    private String brand;
    private int memory;
    private int ssd;
    private int hdd;

    // Constructor to initialize all attributes
    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for memory
    public int getMemory() {
        return memory;
    }

    // Setter for memory
    public void setMemory(int memory) {
        this.memory = memory;
    }

    // Getter for ssd
    public int getSsd() {
        return ssd;
    }

    // Setter for ssd
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    // Getter for hdd
    public int getHdd() {
        return hdd;
    }

    // Setter for hdd
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    // Override toString method to provide string representation
    @Override
    public String toString() {
        return "Computer [brand=" + brand + ", memory=" + memory + "GB, ssd=" + ssd + "GB, hdd=" + hdd + "GB]";
    }

    // Main method for testing
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", 16, 512, 1000);
        System.out.println(computer.toString());  // Output: Computer [brand=Dell, memory=16GB, ssd=512GB, hdd=1000GB]
    }
}
