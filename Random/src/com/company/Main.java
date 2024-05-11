package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char[] a={'#','@','$','&'};
        Scanner input=new Scanner(System.in);

        System.out.print("How many user you want? ");
        int user=input.nextInt();

        System.out.print("Your user length ? ");
        int userLength= input.nextInt();

        for (int j=0;j<user;j++) {
            System.out.print("You'r user : ");
            for (int i = 0; i < userLength; i++) {
                Random random = new Random();
                int x = random.nextInt(3) + 1;
                if (x == 1) {
                    Random random1 = new Random();
                    int num = random1.nextInt(9);
                    System.out.print(num);
                }
                if (x == 2) {
                    Random random2 = new Random();
                    char c1 = (char) (random2.nextInt(26) + 'a');
                    System.out.print(c1);
                }
                if (x == 3) {
                    Random random3 = new Random();
                    char c2 = a[random3.nextInt(4)];
                    System.out.print(c2);
                }


            }
            System.out.println();
        }
//        System.out.println(str);

    }
}

