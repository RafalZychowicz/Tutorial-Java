package encapsulation;

public interface EncI {

    void hi();

        EncI encI = new EncI() {
            @Override
            public void hi() {
                System.out.println("hi");
            }
        };
}
