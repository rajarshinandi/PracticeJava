/**
 * We need to extend the Exception class that belongs to java.lang package.
 */

public class _01CustomException extends Exception {

    public _01CustomException(String e) {
        super(e);
    }

    public static void main(String[] args) {

        try {
            throw new _01CustomException("my.custom.exception");

        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
