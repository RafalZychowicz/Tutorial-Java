package Assignments.Assignment8;

public class iPhone implements PhoneInterface {

    @Override
    public boolean sms(String text, Integer number) {
        System.out.println("SIRI: I'm sending: " + text + " to: " +number);
        return true;
    }

    @Override
    public boolean call(String name, Integer number) {
        System.out.println("SIRI: Calling: " + name + "(" + number + ")");
        return true;
    }

    @Override
    public boolean alarm(String alarm) {
        System.out.println("SIRI: It's " + alarm + " Time to wake up!");
        return true;
    }
}
