package com.company;

import java.util.Random;
import java.util.Scanner;

public class MyThread extends Thread{
    Scanner cs = new Scanner(System.in);
    Random rd = new Random();
    int progress;
    int num;
    String au;
    int enemy;
    int player;
    String result;
    @Override
    public void run() {
        System.out.println("Type rock, paper or scissors");
        for (int i = 0; i < 5; i++) {
            progress = i;
            au = cs.nextLine();
           num = rd.nextInt(3);
            if (num == 0){
                System.out.println("Rock");
            }
            else if (num == 1) {
                System.out.println("Paper");
            }
            else {
                System.out.println("Scissors");
            }
            if (au.equals("rock") && num == 0){
                System.out.println("Tie");
            }
            else if (au.equals("rock") && num == 1){
                System.out.println("Player lost");
                enemy++;
            }
            else if (au.equals("rock") && num == 2){
                System.out.println("Computer Lost");
                player++;
            }
            if (au.equals("paper") && num == 0){
                System.out.println("Player win");
                player++;
            }
            else if (au.equals("paper") && num == 1){
                System.out.println("Tie");
            }
            else if (au.equals("paper") && num == 2){
                System.out.println("Player Lost");
                enemy++;
            }
            if (au.equals("scissors") && num == 0){
                System.out.println("Player lost");
                enemy++;
            }
            else if (au.equals("scissors") && num == 1){
                System.out.println("Player Won");
                player++;
            }
            else if (au.equals("scissors") && num == 2){
                System.out.println("Tie");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public String getProgress(){
        if (enemy > player){
            result = "Enemy win";
        }
        else if (enemy < player){
            result = "Player win";
        }
        else {
            result = "Tie";
        }
        return result;
    }

}
