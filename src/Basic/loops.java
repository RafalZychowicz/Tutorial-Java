package Basic;

public class loops {

    public static void main(String[] args) {

        //---classic for---
        for (int i = 0; i < 30; i += 1) {
            System.out.println(i);
        }

        int j = 20;

        for (; j > 10; j -= 1) {
            System.out.println(j);
        }
//---loop in loop---
        for (int l = 0; l < 10; l += 1) {
            System.out.print(l + " - ");
            for (int p = 0; p < 10; p += 1) {
                System.out.print(p + ", ");
            }
            System.out.println();
        }
        //---foreach---
        int[] ints = {1, 2, 3, 4, 5, 6, 7};

        for (int e : ints) {
            System.out.println(e);
        }
//---while---

        int o = 200;

        while (o % 3 != 0) {
            o--;
            System.out.println(o);
        }
//---dowhile---

        do {
            System.out.println("juhu");
        }
        while (false);

//---label---
        LABEL:
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);
            for (int k = 0; k < 100; k++) {
                System.out.println("k= " + k);
                break LABEL;
            }
        }
    }
}