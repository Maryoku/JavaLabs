package SemaphorPhilosophers;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    Semaphore semaphore;
    int id;

    public Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {
            semaphore.acquire();
            System.out.println("Philosopher " + id + " start eating.");
            sleep(500);

            System.out.println("Philosopher " + id + " ends eating.");
            semaphore.release();
            sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Philosopher " + id + " died.");
        }
    }
}
