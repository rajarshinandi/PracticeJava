/**
 *
 * start() --> Start the thread
 * join() --> Wait for the other thread to complete
 * interrupt() --> Interrupt the actions in the thread
 * yield() --> Hints to the Scheduler to give preference to the other threads
 *
 */

public class _05ThreadFunctionsContd extends Thread {

    public _05ThreadFunctionsContd(String str) {
        super(str);
    }

    public static void main(String[] args) {
        _05ThreadFunctionsContd t1 = new _05ThreadFunctionsContd("FirstThread");
        _05ThreadFunctionsContd t2 = new _05ThreadFunctionsContd("SecondThread");
        _05ThreadFunctionsContd t3 = new _05ThreadFunctionsContd("ThirdThread");

        // Start thread t1
        t1.start();
        t1.interrupt();

        // Start thread t2, t3
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " " + i + " -> Hello!!");
            }
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " -> Exception caught " + e);
        }

    }
}

//Sample Output:
//FirstThread -> Exception caught java.lang.InterruptedException: sleep interrupted
//SecondThread 0 -> Hello!!
//ThirdThread 0 -> Hello!!
//ThirdThread 1 -> Hello!!
//SecondThread 1 -> Hello!!
//ThirdThread 2 -> Hello!!
//SecondThread 2 -> Hello!!
//ThirdThread 3 -> Hello!!
//SecondThread 3 -> Hello!!
//ThirdThread 4 -> Hello!!
//SecondThread 4 -> Hello!!