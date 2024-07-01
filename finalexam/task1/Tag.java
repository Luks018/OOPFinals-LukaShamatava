package finalexam.task1;

import java.time.LocalDateTime;
import java.util.Objects;

public class Tag {
    private int id;
    private String name;
    private String description;
    private LocalDateTime createdAt;

    // Constructor to initialize all fields
    public Tag(int id, String name, String description, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setter for createdAt
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // Override toString method to provide string representation
    @Override
    public String toString() {
        return "Tag [id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt + "]";
    }

    // Override equals method to compare tags
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return id == tag.id && Objects.equals(name, tag.name) && Objects.equals(description, tag.description) && Objects.equals(createdAt, tag.createdAt);
    }

    // Override hashCode method to generate hash code for the tag
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, createdAt);
    }

    // Main method for testing
    public static void main(String[] args) {
        Tag tag = new Tag(1, "Java", "All about Java programming", LocalDateTime.now());
        System.out.println(tag.toString());  // Output: Tag [id=1, name=Java, description=All about Java programming, createdAt=...]
    }
}
