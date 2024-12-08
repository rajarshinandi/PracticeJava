/**
 *
 * Notes:
 * In JAVA all thread states are defined by the enum called State
 * The Enum State has the values like NEW, RUNNABLE, WAITING, TIMED_WAITING, TERMINATED
 * Both actual Runnable and Running is denoted by RUNNABLE
 *
 */

public class _03MainThreadStages extends Thread {

    public static void main(String[] args) throws InterruptedException {

        //Print the State of main thread - Always RUNNABLE
        System.out.println("I am " + Thread.currentThread().getName() + " and state is " + Thread.currentThread().getState());

        //Create an object of the class - State: NEW
        _03MainThreadStages t1 = new _03MainThreadStages();
        System.out.println("I am " + t1.getName() + " and my state is " + t1.getState());

        // Start t1 thread()
        t1.start();
        System.out.println("I am " + t1.getName() + " and my state is " + t1.getState());

        Thread.sleep(100); //Custom wait for 1 second
        System.out.println("I am " + t1.getName() + " and my state is " + t1.getState());

        t1.join(); // Wait for t1 to complete -- It will complete after 5 second of waiting

        //State is TERMINATED
        System.out.println("I am " + t1.getName() + " and my state is " + t1.getState());

        // Print the state of main
        System.out.println("I am " + Thread.currentThread().getName() +
                " and my state is " + Thread.currentThread().getState());

    }

    @Override
    public void run() {
        System.out.println("I am custom RUNNING!!");
        try {

//          Putting explicit wait of 5s for current thread t1
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
