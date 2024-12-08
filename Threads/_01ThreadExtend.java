public class _01ThreadExtend extends Thread {


//    Override the run() from Thread class
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("From Thread Class - " + i + ": I am main thread! Thread Id: "
                    + Thread.currentThread().getId() + " and Thread Name: " + Thread.currentThread().getName());
        }

    }

}
