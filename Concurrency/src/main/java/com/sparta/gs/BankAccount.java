package com.sparta.gs;

public class BankAccount implements Runnable{

    // example of why to use synchonized as if do not make this sync then it will
    // do all the threads at the time and if the exit point is reached on one then it shouldnt allow
    // the other which is why sync is useful

    private static int balance = 100;


    @Override
    public void run() {
        System.out.println(Util.getThreadName() + " checks the balance " + balance);
        makeWithDrawal(75);
        if (balance < 0) {
            System.out.println("Account has been overdrawn. balance is " + balance);
        }
    }

    private void makeWithDrawal(int amount) {
        if(balance >= amount) {
            System.out.println(Util.getThreadName() + " is going to withdraw");
            balance = balance - amount;
            System.out.println(Util.getThreadName() + " has withdrawn" + amount);
        } else {
            System.out.println("sorry, not enough balance for " + Util.getThreadName() + " to withdraw");
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread husband = new Thread(bankAccount);
        Thread wife = new Thread(bankAccount);
        husband.setName("Husband");
        wife.setName("Wife");

        husband.start();
        wife.start();
    }
}
