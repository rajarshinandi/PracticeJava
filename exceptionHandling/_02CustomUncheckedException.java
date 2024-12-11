/*

RuntimeException is the superclass of those exceptions that can be thrown during the normal
operation of the Java Virtual Machine.
RuntimeException and its subclasses are unchecked exceptions.
Unchecked exceptions do not need to be declared in a method or constructor's throws clause
if they can be thrown by the execution of the method or constructor and propagate outside the method
or constructor boundary

 */

public class _02CustomUncheckedException extends RuntimeException {

    public _02CustomUncheckedException(String e) {
        super(e);
    }

    public static void main(String[] args) {

        try {
            throw new _02CustomUncheckedException("my.custom.runtime.exception");

        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
