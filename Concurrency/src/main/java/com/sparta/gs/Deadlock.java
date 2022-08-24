package com.sparta.gs;

public class Deadlock {

    // methods which are thread safe are no synchronized
    // methods which are not thread safe are synchronized
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) { // synchoronized means only one method can access this as one time
            System.out.format("%s: %s" // system.out.format allows you to print normally but substitute values
                            + "  has bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }

    /**
     * ArrayList - clean employees - x seconds
     * 2 threads - half of the arraylist - x/2 seconds
     * 4 threads - quarter of the arraylist
     * Method (number of threads) and vary it and see if you have varying times
     * Helps find ideal number of threads
     */
}
