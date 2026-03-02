package threads;

import javax.print.attribute.standard.RequestingUserName;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    //thread so chan
    static class SoChan extends Thread{
        public void run(){
            for(int i = 0; i <= 20; i++){
                System.out.println("Chan" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    // thread so le
    static class SoLe extends Thread{
        public void run(){
            for(int i = 0; i <= 20; i++){
                System.out.println("Le" + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("chay 2 thread song song");

        Thread chan = new SoChan();
        Thread le = new SoLe();

        chan.start();
        le.start();

        chan.join();
        le.join();

        System.out.println("Xong");

        System.out.println("Executor 3 tac vu song song ");

        ExecutorService pool = Executors.newFixedThreadPool(3);
        Runnable task1 = () -> runTask("Task 1", 2 );
        Runnable task2 = () -> runTask("Task 2", 3 );
        Runnable task3 = () -> runTask("Task 3", 1 );

        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);

        pool.shutdown();
        System.out.println("Start " + LocalTime.now());

    }

    private static void runTask(String s, long i){

        System.out.println(s + "start" + LocalTime.now() + " : " + Thread.currentThread().getName());
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(s + " hoan thanh " + LocalTime.now());
    }
}
