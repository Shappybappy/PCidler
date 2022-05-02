package com.PCIdler;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //run in command prompt lol
        while (true){
            try {
                Robot robby = new Robot();
                int[] arr = new int[]{15, 20, 45, 30, 50};
                //moves your cursor every quarter second 20 times
                for (int j = 0; j < 21; j++) {
                    System.out.println("J: " + j);
                    robby.mouseMove(arr[0], arr[1]);
                    TimeUnit.MILLISECONDS.sleep(250);
                    robby.mouseMove(arr[2], arr[3]);
                    TimeUnit.MILLISECONDS.sleep(250);
                    robby.mouseMove(arr[3], arr[4]);
                    TimeUnit.MILLISECONDS.sleep(250);
                }
            } catch (AWTException | InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 180; i++){
                //Every three minutes this loop quits going back up to the cursor loop
                System.out.println("I: " + i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}