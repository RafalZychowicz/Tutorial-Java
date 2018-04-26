package encapsulation.inside;

import encapsulation.Enc;

public class Enc2 extends Enc {

    void test() {
        Enc enc = new Enc();
//        enc.z;
//        enc.y;

        this.y = 0;
    }
}
