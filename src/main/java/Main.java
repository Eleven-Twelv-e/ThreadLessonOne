public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup firstGroup = new ThreadGroup("First Group");

        Thread myThreads1 = new NewThread(firstGroup,"Thread 1");
        Thread myThreads2 = new NewThread(firstGroup,"Thread 2");
        Thread myThreads3 = new NewThread(firstGroup,"Thread 3");
        Thread myThreads4 = new NewThread(firstGroup,"Thread 4");

        myThreads1.start();
        myThreads2.start();
        myThreads3.start();
        myThreads4.start();

        Thread.sleep(7000);
        firstGroup.interrupt();

    }


}
