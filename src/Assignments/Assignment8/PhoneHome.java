package Assignments.Assignment8;

public class PhoneHome {

    public static void main(String[] args) {

        iPhone iphone = new iPhone();
        AndroidPhone nexus = new AndroidPhone();

        iphone.sms("Hello, wanna hang out tonight?", 123456789);
        iphone.call("Jan Kowalski", 987654321);
        iphone.alarm("06:00");

        System.out.println();

        nexus.sms("Hey, where are you, I'm waiting!", 456987123);
        nexus.call("Janina Kowalska", 321456987);
        nexus.alarm("11:30");
    }
}
