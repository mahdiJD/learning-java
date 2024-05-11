package com.company;

import java.time.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
//        Timer timer=new Timer();
////        LocalTime time= Timer;
//timer.schedule(new TimerTask() {
//                   @Override
//                   public void run() {
//                       System.out.println("h");
//                   }
//                   },1*1*1000);

//        int t=1;
//       while (true){
//           if (date.==t){
//
//           }
//       }

        LocalTime time=LocalTime.now();
        System.out.println(time);
        int x=1;
        while (true) {
            LocalTime time1=LocalTime.now();
            if (time==time1.plusSeconds(x)) {
                System.out.println(time);
            x++;
            }

        }

    }
}
