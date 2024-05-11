package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] a = new int[3], b = new int[3], c = new int[6];
//        int s = 0;
//        for (int i=0;i<a.length;i++) {
//            a[i] = input.nextInt();
//        }
//        System.out.println("----------");
//        for (int i=0;i<b.length;i++) {
//            b[i] = input.nextInt();
//
//        }
//
//        for (int i=0;i<a.length;i++) {
//            boolean flag=true;
//            for (int j=0;j<b.length;j++) {
//                if (a[i] == b[j]) {
//                   flag=false;
//                    break;
//                }
//
//            }
//            if (flag) {
//                c[s] = a[i];
//                s++;
//            }
//
//        }
//
//        for (int i=0;i<b.length;i++) {
//            boolean flag=true;
//            for (int j=0;j<a.length;j++) {
//                if (b[i] == a[j]) {
//                    flag=false;
//                    break;
//                }
//
//            }
//            if (flag) {
//                c[s] = b[i];
//                s++;
//            }
//
//        }
//        System.out.println("--------");
//        for (int i=0; i< c.length;i++) {
//           if (c[i]!=0)System.out.print(c[i]+"  ");
//
//        }

        int[] a=new int[3];
        int []b= new int [3];
        boolean s=false;
        for (int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        System.out.println("-------");
        for (int i=0;i<b.length;i++){
            b[i]=input.nextInt();
        }
        for (int i=0;i<a.length;i++){
            for (int j = 0; j <b.length; j++){
                if (a[i]==b[j]) { s=true;
                    break;
                }
                else s=false;
            }
            if (!s)break;
        }
         System.out.println(s);

    }
}
