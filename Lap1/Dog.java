public class Dog extends Pet {
    private String size;

    public Dog(String name, String owner, String size) {
        super(name, owner, size);
        this.size = size;
    }

    public String getDetails() {
        return "Dog Size: " + size;
    }

    public String toString() {
        return getName() + "[ " + getDetails() + " ]";
    }

}
