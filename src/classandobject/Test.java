package classandobject;

public class Test {

    public static void main(String[] args) {

        Client clientRafal = new Client();

        clientRafal.setFirstName("Rafal");
        clientRafal.setLastName("Zychowicz");

        Address rafalAddress = new Address("Warszawa", "05-300");
//        rafalAddress.setPostCode("05-300");
//        rafalAddress.setPostOffice("Minsk Mazowiecki");

        clientRafal.setAddress(rafalAddress);

        System.out.println(clientRafal.getLastName());
        System.out.println(Client.COMPANY_NAME);

        clientRafal.introduceYourself();
    }
}
