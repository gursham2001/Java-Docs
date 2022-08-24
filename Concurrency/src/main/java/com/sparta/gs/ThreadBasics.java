package com.sparta.gs;

// concurrency is when there are multiple functions running at the same time
public class ThreadBasics implements Runnable {
    // extending thread class doesn't force use to override methods but it gives us access to all
    // so instrad of using thread we can use runnable as it will allow us to still have an extend avaliable
    // now we cant extend anything else to it


    @Override
    public void run() {
        System.out.println("Printing from a thread");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadBasics());
        Thread thread2 = new Thread(() -> System.out.println("do something"));

        thread1.start(); // looks for threads run method and whatever is in there it will run it
        thread1.start();
    }
}
