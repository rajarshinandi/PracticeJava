public class _03MainRunnableWithLambda {

    public static void main(String[] args) {

//      Runnable is a functional interface which has only one method run()
//      Implementing the run() method here
        Runnable runnable = () -> {
            for (int i = 0; i<10; i++){
                System.out.println("Hello "+i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.run();

    }

}
