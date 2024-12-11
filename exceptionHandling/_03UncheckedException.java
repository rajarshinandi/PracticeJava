/**
 *
 */

public class _03UncheckedException {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        // Below line throws ArrayIndexOutOfBoundsException
        try {
            System.out.println(arr[arr.length]);
        }
        catch(ArithmeticException ar){
            System.out.println(ar);
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }finally {
            System.out.println("I am executed always!");
        }
    }
}
