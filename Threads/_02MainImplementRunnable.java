public class _02MainImplementRunnable implements Runnable {

    public static void main(String[] args) {
        _02MainImplementRunnable ob1 = new _02MainImplementRunnable();
        Thread thread = new Thread(ob1);
        thread.start();

    }

//  Implement the run() from Runnable Interface
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable Interface - " + i + ": I am main thread! Thread Id: "
                    + Thread.currentThread().getId() + " and Thread Name: " + Thread.currentThread().getName());
        }
    }
}
