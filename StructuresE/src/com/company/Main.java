package com.company;
import java.text.DecimalFormat;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* int a,b,c;
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        if (a>b && a>c) System.out.println(a);
        else if (b>a&& b>c) System.out.println(b);
        else System.out.println(c);*/

          /*  int a;
            a = input.nextInt();
            if (a > 0) System.out.println(a * a);
            else if (a < 0) System.out.println(a * a * a);
            else System.out.println("you'r num is 0");*/

           /* int a ,b,c;
            a= input.nextInt();
            b= input.nextInt();
            c= input.nextInt();

            if (a+b>c && a+c>b && b+c>a) System.out.println("you can");*/
       /* System.out.println(3/10);
        int a= input.nextInt();
        int sum =1;
        int x;
        for (int i = 0; true; i++) {
            x=a/10 ;
            if (x<1) sum+=1;
        }
        System.out.println(sum);*/

       /* String ani1="bee";
        String ani2= input.next();
        System.out.println(ani1.equalsIgnoreCase(ani2));*/

       /* int a = 1, b = 1, c = 0, n;

        System.out.println("Enter n:");
        n = input.nextInt();

        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);*/

       /* int s =126,x;
        for (int i = 0; i < 3; i++) {
            x=s%10;
            System.out.print(x);
            s/=10;
        }*/

        /*String str ="33";
        int num = Integer.parseInt(str);
        System.out.println(num);*/

        DecimalFormat format= new DecimalFormat("000,000.00");
        String str = format.format(1000000000);
        System.out.println(str);

        }
    }