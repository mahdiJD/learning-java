package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("r:");
    Circle circle=new Circle();
        Scanner input=new Scanner((System.in));
        circle.r =input.nextInt();
        if (circle.r<=0){
            System.out.println("What the fuck are you !!??");

        }
        double mohit=(circle.r+circle.r)*Math.PI;
        System.out.println(mohit);
        double masahat=circle.r*circle.r*Math.PI;
        System.out.println(masahat);
    }
}
