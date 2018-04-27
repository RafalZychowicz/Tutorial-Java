package Assignments.Assignment6;

public class Client {

    public String firstName;
    public String lastName;
    public Address address;
    public Invoice invoice;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

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
