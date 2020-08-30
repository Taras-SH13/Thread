public class App {

    public static void main(String[] args) {
        System.out.println("Main thread is started....");
        System.out.println("Main thread is stopped....");
        FirstThread firstThread = new FirstThread("Thread number 1");
        firstThread.start();
        Runnable r = ()->{
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        };
        new Thread(r,"Second Thread").start();
    }
}
