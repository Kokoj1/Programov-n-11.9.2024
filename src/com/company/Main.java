package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Scanner cs = new Scanner(System.in);
        int choose;
        System.out.println("Choose 1 or 2") ;
        choose = cs.nextInt();
	MyThread myThread = new MyThread();
    MyThread2 myThread2 = new MyThread2();
    if (choose == 1){
        myThread.start();
    }
    else {
        myThread2.start();
    }

    while (myThread.isAlive()){
        Thread.sleep(1000);
    }
    myThread.join(0);
    myThread2.join(0);
    if (choose == 1) {
        System.out.println(myThread.getProgress());
    }
    else if (choose == 2){
        System.out.println(myThread2.getProgress());
    }
    }
}
