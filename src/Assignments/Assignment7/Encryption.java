package Assignments.Assignment7;

public class Encryption {

    public static void main(String[] args) {

        String orginal = "This is encrypted text for java practice";
        String coded = EncryptionUtils.encode(orginal);
        String decoded = EncryptionUtils.decode(coded);

        System.out.println(orginal);
        System.out.println(coded);
        System.out.println(decoded);
    }
}
