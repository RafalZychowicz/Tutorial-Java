package polymorphism;

import interfaces.Document;
import interfaces.DrawDocument;
import interfaces.TxtDocument;

public class Poly {

    public static void main(String[] args) {

        Document draw = new DrawDocument();

        if (draw instanceof DrawDocument) {
            System.out.println("true");
        }
        if (draw instanceof TxtDocument) {
            System.out.println("true");
        }

        Box<Document> box = new Box<>();

        box.setT(new TxtDocument());
        box.setT(new DrawDocument());

        String n = "1";
        Object o = "abc";
        String s = (String) o;
        int i = Integer.valueOf(n);

        System.out.println(s+n);
        System.out.println(""+i);

    }
}
