package Assignments.Assignment8;

public class AndroidPhone implements PhoneInterface {

    @Override
    public boolean sms(String text, Integer number) {
        System.out.println("SMS: " + text + " Send to: " + number);
        return true;
    }

    @Override
    public boolean call(String name, Integer number) {
        System.out.println("Call to: " + name + " | " + number);
        return true;
    }

    @Override
    public boolean alarm(String alarm) {
        System.out.println("Ring, ring! Wake up, it's already: " + alarm);
        return true;
    }
}
