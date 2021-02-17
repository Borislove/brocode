package multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        MyRunnable runnable1 = new MyRunnable();

        Thread thread2 = new Thread(runnable1);

        thread1.start();
        thread1.join(3000); //calling thread(ex.main) waits until the specified thread dies or for x milliseconds
        thread2.start();
    }
}
