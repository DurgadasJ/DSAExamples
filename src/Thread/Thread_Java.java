package Thread;

public class Thread_Java implements Runnable{

    static volatile int count =0;

    public static void main(String[] args) throws InterruptedException {
        Thread_Java obj = new Thread_Java();

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
    }

    @Override
    public void run(){
        for(int i=0;i<8800;i++){
            count++;
        }
    }

}
