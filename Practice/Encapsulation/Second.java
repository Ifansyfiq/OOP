package Encapsulation;

public class Second {
    private String name; // private = restricted access

    public String getName() { // getter
        return name;
    }

    public void setName(String newName) { // setter
        this.name = newName;
    }
}
