package com.company;

import java.util.Random;
import java.util.RandomAccess;

public class Main {

    public static void main(String[] args) {
        System.out.println("how mach pas you need");
        Random randomNumber = new Random();
        int num3;
        String name = "mahdi";
        int num = name.length();
        System.out.println(num);
        char x = name.charAt(num3 = randomNumber.nextInt(num));
        System.out.println(x);
        Pas p1 =new Pas();
        String pas ="";
        pas= String.valueOf(x);
        String pasN = String.valueOf(num3);
        String pas1= pas+pasN;
        System.out.println("pas : " +x + num3);
        System.out.println(pas1);
    }
}
class Pas {
    String pas;

}