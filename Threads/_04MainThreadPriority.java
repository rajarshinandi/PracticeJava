/**
 * By default, each thread has the normal priority 5
 * Max Priority : 10
 * Normal Priority : 5
 * Min Priority : 1
 * During execution the threads with more Priority is given more preference
 */

public class _04MainThreadPriority extends Thread {

    //By invoking the constructor of Thread() we can rename the thread name
    _04MainThreadPriority(String threadName) {
        super(threadName);
    }

    public static void main(String[] args) {

        _04MainThreadPriority t1 = new _04MainThreadPriority("FirstThread"); //Default set to NORM_PRIORITY
        _04MainThreadPriority t2 = new _04MainThreadPriority("SecondThread"); //Default set to NORM_PRIORITY
        _04MainThreadPriority t3 = new _04MainThreadPriority("ThirdThread"); //Default set to NORM_PRIORITY
        _04MainThreadPriority t4 = new _04MainThreadPriority("FourthThread"); //Default set to NORM_PRIORITY

//        Setting Priority
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(NORM_PRIORITY);
        t4.setPriority(MAX_PRIORITY);

//        Execute threads random
        t2.start(); //MIN_PRIORITY
        t3.start(); //NORM_PRIORITY
        t4.start(); //MAX_PRIORITY
        t1.start(); //No Priority set -> Default NORM_PRIORITY

    }

    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " -> Hello -> " + Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
            }
    }
}

/*
//Here we executed randomly but the execution happened in this way (First: MAX_PRIORITY, then: NORM_PRIORITY, Last: MIN_PRIORITY)
First Run:
        0 -> Hello -> FourthThread Priority: 10
        1 -> Hello -> FourthThread Priority: 10
        2 -> Hello -> FourthThread Priority: 10
        3 -> Hello -> FourthThread Priority: 10
        4 -> Hello -> FourthThread Priority: 10
        5 -> Hello -> FourthThread Priority: 10
        6 -> Hello -> FourthThread Priority: 10
        7 -> Hello -> FourthThread Priority: 10
        8 -> Hello -> FourthThread Priority: 10
        9 -> Hello -> FourthThread Priority: 10
        0 -> Hello -> ThirdThread Priority: 5
        1 -> Hello -> ThirdThread Priority: 5
        2 -> Hello -> ThirdThread Priority: 5
        3 -> Hello -> ThirdThread Priority: 5
        4 -> Hello -> ThirdThread Priority: 5
        5 -> Hello -> ThirdThread Priority: 5
        6 -> Hello -> ThirdThread Priority: 5
        7 -> Hello -> ThirdThread Priority: 5
        8 -> Hello -> ThirdThread Priority: 5
        9 -> Hello -> ThirdThread Priority: 5
        0 -> Hello -> FirstThread Priority: 5
        1 -> Hello -> FirstThread Priority: 5
        2 -> Hello -> FirstThread Priority: 5
        3 -> Hello -> FirstThread Priority: 5
        4 -> Hello -> FirstThread Priority: 5
        5 -> Hello -> FirstThread Priority: 5
        6 -> Hello -> FirstThread Priority: 5
        7 -> Hello -> FirstThread Priority: 5
        8 -> Hello -> FirstThread Priority: 5
        9 -> Hello -> FirstThread Priority: 5
        0 -> Hello -> SecondThread Priority: 1
        1 -> Hello -> SecondThread Priority: 1
        2 -> Hello -> SecondThread Priority: 1
        3 -> Hello -> SecondThread Priority: 1
        4 -> Hello -> SecondThread Priority: 1
        5 -> Hello -> SecondThread Priority: 1
        6 -> Hello -> SecondThread Priority: 1
        7 -> Hello -> SecondThread Priority: 1
        8 -> Hello -> SecondThread Priority: 1
        9 -> Hello -> SecondThread Priority: 1

Second Run:
        0 -> Hello -> FourthThread Priority: 10
        1 -> Hello -> FourthThread Priority: 10
        0 -> Hello -> ThirdThread Priority: 5
        0 -> Hello -> FirstThread Priority: 5
        2 -> Hello -> FourthThread Priority: 10
        3 -> Hello -> FourthThread Priority: 10
        4 -> Hello -> FourthThread Priority: 10
        1 -> Hello -> ThirdThread Priority: 5
        2 -> Hello -> ThirdThread Priority: 5
        3 -> Hello -> ThirdThread Priority: 5
        1 -> Hello -> FirstThread Priority: 5
        5 -> Hello -> FourthThread Priority: 10
        6 -> Hello -> FourthThread Priority: 10
        7 -> Hello -> FourthThread Priority: 10
        8 -> Hello -> FourthThread Priority: 10
        9 -> Hello -> FourthThread Priority: 10
        2 -> Hello -> FirstThread Priority: 5
        3 -> Hello -> FirstThread Priority: 5
        4 -> Hello -> ThirdThread Priority: 5
        5 -> Hello -> ThirdThread Priority: 5
        6 -> Hello -> ThirdThread Priority: 5
        7 -> Hello -> ThirdThread Priority: 5
        8 -> Hello -> ThirdThread Priority: 5
        9 -> Hello -> ThirdThread Priority: 5
        4 -> Hello -> FirstThread Priority: 5
        5 -> Hello -> FirstThread Priority: 5
        6 -> Hello -> FirstThread Priority: 5
        7 -> Hello -> FirstThread Priority: 5
        8 -> Hello -> FirstThread Priority: 5
        9 -> Hello -> FirstThread Priority: 5
        0 -> Hello -> SecondThread Priority: 1
        1 -> Hello -> SecondThread Priority: 1
        2 -> Hello -> SecondThread Priority: 1
        3 -> Hello -> SecondThread Priority: 1
        4 -> Hello -> SecondThread Priority: 1
        5 -> Hello -> SecondThread Priority: 1
        6 -> Hello -> SecondThread Priority: 1
        7 -> Hello -> SecondThread Priority: 1
        8 -> Hello -> SecondThread Priority: 1
        9 -> Hello -> SecondThread Priority: 1

Third Run:
        0 -> Hello -> FourthThread Priority: 10
        1 -> Hello -> FourthThread Priority: 10
        2 -> Hello -> FourthThread Priority: 10
        3 -> Hello -> FourthThread Priority: 10
        4 -> Hello -> FourthThread Priority: 10
        5 -> Hello -> FourthThread Priority: 10
        0 -> Hello -> FirstThread Priority: 5
        6 -> Hello -> FourthThread Priority: 10
        7 -> Hello -> FourthThread Priority: 10
        8 -> Hello -> FourthThread Priority: 10
        9 -> Hello -> FourthThread Priority: 10
        0 -> Hello -> ThirdThread Priority: 5
        1 -> Hello -> ThirdThread Priority: 5
        2 -> Hello -> ThirdThread Priority: 5
        3 -> Hello -> ThirdThread Priority: 5
        4 -> Hello -> ThirdThread Priority: 5
        5 -> Hello -> ThirdThread Priority: 5
        6 -> Hello -> ThirdThread Priority: 5
        7 -> Hello -> ThirdThread Priority: 5
        8 -> Hello -> ThirdThread Priority: 5
        9 -> Hello -> ThirdThread Priority: 5
        1 -> Hello -> FirstThread Priority: 5
        2 -> Hello -> FirstThread Priority: 5
        3 -> Hello -> FirstThread Priority: 5
        4 -> Hello -> FirstThread Priority: 5
        5 -> Hello -> FirstThread Priority: 5
        6 -> Hello -> FirstThread Priority: 5
        7 -> Hello -> FirstThread Priority: 5
        8 -> Hello -> FirstThread Priority: 5
        9 -> Hello -> FirstThread Priority: 5
        0 -> Hello -> SecondThread Priority: 1
        1 -> Hello -> SecondThread Priority: 1
        2 -> Hello -> SecondThread Priority: 1
        3 -> Hello -> SecondThread Priority: 1
        4 -> Hello -> SecondThread Priority: 1
        5 -> Hello -> SecondThread Priority: 1
        6 -> Hello -> SecondThread Priority: 1
        7 -> Hello -> SecondThread Priority: 1
        8 -> Hello -> SecondThread Priority: 1
        9 -> Hello -> SecondThread Priority: 1
 */