public class NewThread extends Thread{

    public NewThread(ThreadGroup threadGroup, String name){
        super(threadGroup, name);
    }

    @Override
    public void run(){
        try {
            while (!isInterrupted()){
                String threadName = Thread.currentThread().getName();
                Thread.sleep(2500);
                System.out.println("Hello I am " + threadName + " thread!");
            }
        }catch (InterruptedException e){
            System.out.println("Just Sleeping...");
        }finally {
            System.out.printf("%s ended\n", getName());
        }
    }
}
