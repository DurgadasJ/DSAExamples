package misc;

public class EvenOddPrinter {

    private static final int MAX = 10;
    private int count = 1;
    private final Object lock = new Object();

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter();

        Thread oddThread = new Thread(() -> printer.printOdd(), "OddThread");
        Thread evenThread = new Thread(() -> printer.printEven(), "EvenThread");

        oddThread.start();
        evenThread.start();
    }

    public void printOdd() {
        synchronized (lock) {
            while (count <= MAX) {
                if (count % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + " -> " + count);
                    count++;
                    lock.notify(); // Notify even thread
                } else {
                    try {
                        lock.wait(); // Wait for even thread to finish
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (count <= MAX) {
                if (count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " -> " + count);
                    count++;
                    lock.notify(); // Notify odd thread
                } else {
                    try {
                        lock.wait(); // Wait for odd thread to finish
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}

