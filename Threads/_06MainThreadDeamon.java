/**
 *
 * User Thread: Threads which are created by users
 * Daemon thread in Java is a service provider thread that provides services to the user thread.
 * Its life depend on the mercy of user threads
 * i.e. when all the user threads dies, JVM terminates this thread automatically.
 * There are many java daemon threads running automatically e.g. gc, finalizer etc.
 *
 * main thread is not a deemon thread
 */

public class _06MainThreadDeamon extends Thread {

    public _06MainThreadDeamon(String name) {
        super(name);

    }

    public static void main(String[] args) throws InterruptedException {

        //t1 is a user thread initially
        _06MainThreadDeamon t1 = new _06MainThreadDeamon("CustomDeamonThread");

        //Custom set thread t1 to a daemon thread
        t1.setDaemon(true);

        //Start thread
        t1.start();

        //Wait for 1s
        Thread.sleep(100);

//        Once this line is printed from main then JVM identifies that no user thread is running anymore so the
//        Program will terminate in a while
        System.out.println("Print from "+Thread.currentThread().getName()+" isDaemon: "+Thread.currentThread().isDaemon());

    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " , isDeamon: " + Thread.currentThread().isDaemon());
        }

    }

}
