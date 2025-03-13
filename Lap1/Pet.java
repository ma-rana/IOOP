public class Pet {

    private String id;
    protected String name;
    private String owner;

    public Pet(String id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public String getDetails() {
        return "Pet ID: " + id + "\tPet Name: " + name + "\tPet Owner: " + owner;
    }

    public String toString() {
        return getName() + "[ " + getDetails() + " ]";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}