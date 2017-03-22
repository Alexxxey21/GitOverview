package net.proselyte.gitoverview;


public class Person extends BaseEntity {

    private String firstName;
    private String lasttName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + super.getId() + '\'' +
                ", lasttName='" + lasttName + '\'' +
                '}';
    }
}
