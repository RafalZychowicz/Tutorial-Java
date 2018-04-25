package Zadania.Assignment6;

public class Home {

    public static void main(String[] args) {

        Client client1 = new Client();
        client1.setFirstName("Jan");
        client1.setLastName("Kowalski");

        Address client1Address = new Address("Warsaw", "00-194");
        client1.setAddress(client1Address);

        Invoice client1Invoice = new Invoice(client1, "23/04/2018", 3499);
        client1.setInvoice(client1Invoice);
        double taxValue = client1Invoice.calculateTax();

        System.out.println();
        client1.introduceYourself();
        System.out.println("I have to pay tax of: " + taxValue);
    }
}
