package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exc2 {

    public void sth() throws FileNotFoundException {

        BufferedReader fileReader = new BufferedReader(new FileReader(""));
    }
}
