package com.anderfred;


public class Hello {
    public static void main(String[] args) {

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
}
