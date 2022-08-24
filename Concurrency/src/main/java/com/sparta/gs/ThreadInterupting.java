package com.sparta.gs;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreadInterupting {
    // threads can interupt threads during excecution

    // what each individual thread will do
        private static class Turtles implements Runnable {
            @Override
            public void run() {
                ArrayList<String> turtles = new ArrayList<>(Arrays.asList("Leonardo", "Michelangelo", "Donatello", "Raphael"));
                try {
                    for (String turtle: turtles) {
                        Thread.sleep(2000);
                        // print name of thread and name of turtle
                        System.out.println(Util.getThreadName() + ": " + turtle);
                    }
                } catch (InterruptedException e) { // catch the interupted exception
                    System.err.println("Turtles has been interrupted");
                    e.printStackTrace();
                }
            }
        }
        public static void main(String[] args) {
            // wait time
            long waitTime = 6000;
            long startTime = System.currentTimeMillis();
            System.out.println(Util.getThreadName() + " has started");
            // create thread
            Thread turtles = new Thread(new Turtles());
            turtles.start();
            // while loop to make sure the thread is still alive do that
            while (turtles.isAlive()) {
                System.out.println(Util.getThreadName() + " is waiting");
                try {
                    turtles.join(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // this is to check if waiting time is over then the thread will be interupted
                if(((System.currentTimeMillis() - startTime) > waitTime && turtles.isAlive())) {
                    System.out.println(Util.getThreadName() + " is tired of waiting!");
                    turtles.interrupt();
                    try {
                        turtles.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
