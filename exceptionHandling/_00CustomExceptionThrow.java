/**
 *
 * Here we are just throwing an exception explicitly
 */

public class _00CustomExceptionThrow {

    public static void main(String[] args) {

        try {
            throw new ArrayIndexOutOfBoundsException("my.array.index.out.of.bounds.exception");

        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
