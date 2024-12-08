public class _02RunnableImplementClass implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Hello "+i);
        }
    }
}
