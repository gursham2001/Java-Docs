package com.sparta.gs;

public class ThreadJoining {
    // talk about how joining works

    static class Joins implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(500); // going to sleep and stop for how long we tell it to
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }

        public static void main(String[] args) {
            Thread thread1 = new Thread(new Joins());
            thread1.setName("t1");

            Thread thread2 = new Thread(new Joins());
            thread2.setName("t2");

            thread1.start();
            try { // this is not allow concurrency to occur while one thread is happening others can't
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
