package FirstProgram;

public class HelloWorld {

    public static void main(String[] args) {

        String greet = "Hello Garf!";

        System.out.println();

        for (int i = 0; i < greet.length(); i +=1){
            System.out.print("=");
        }
        System.out.println();
        System.out.println(greet);

        for (int j = 0; j <greet.length(); j += 1){
            System.out.print("=");
        }
        System.out.println();
    }
}
