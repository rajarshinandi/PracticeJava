/**
 *
 * Checked exceptions are the subclass of the Exception class.
 * These types of exceptions need to be handled during the compile time of the program.
 * These exceptions can be handled by the try-catch block or by using throws keyword otherwise
 * the program will give a compilation error.
 *
 */

import java.io.FileInputStream;
import java.io.IOException;

public class _04CheckedException {

    public static void main(String[] args) throws IOException {

        try {
            FileInputStream fin = new FileInputStream("C://dummypath.txt");
            fin.close();
        } catch (IOException e) {
            System.out.println(e);;
        }

    }
}
