package me.samcefalo.teorico;

import java.util.concurrent.atomic.AtomicInteger;

public class Threads {

    public static void main(String[] args) {

        AtomicInteger number = new AtomicInteger(0);

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                number.addAndGet(1);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (number.get() < 10) {
                System.out.println(number.get());
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
