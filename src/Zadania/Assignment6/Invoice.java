package Zadania.Assignment6;

public class Invoice {

    public static double tax = 0.23;

    private Client client;
    private String date;
    private int income;

    public Invoice(Client client, String date, int income) {
        this.client = client;
        this.date = date;
        this.income = income;
    }

    public double calculateTax() {
        return (tax * income);
    }
}
