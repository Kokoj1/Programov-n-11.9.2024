package com.company;

import java.util.Random;
import java.util.Scanner;

public class MyThread2 extends Thread{
    Random rd = new Random();
    Scanner cs = new Scanner(System.in);
    int number = rd.nextInt(10);
    int num;
    int progress;
    String result = "You lose";
    @Override
    public void run() {
        System.out.println("Guess a number");
        for (int i = 0; i < 5; i++) {
            progress = i;
            System.out.println("Type number");
            num = cs.nextInt();
            if (num == number) {
                result = "You win";
                break;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
        public String getProgress(){
            return result;
        }
}
