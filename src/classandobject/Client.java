package classandobject;

public class Client {

    public static final String COMPANY_NAME = "Xerox";

    private String firstName;
    private String lastName;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduceYourself() {
        System.out.println("Hello, I am " + getFullName() + ".");
    }

    private String getFullName() {
        return firstName + " " + lastName;
    }
}
