public class Cat extends Pet {
    private String hairType;

    public Cat(String name, String owner, String hairType) {
        super(name, owner, hairType);
        this.hairType = hairType;
    }

    public String getDetails() {
        return "Car Hair Type: " + hairType;
    }

    public String toString() {
        return getName() + "[ " + getDetails() + " ]";
    }

}
