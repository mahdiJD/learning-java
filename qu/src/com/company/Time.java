package com.company;
import java.util.Scanner;
public class Time {

    private int day;
    private int mon;
    private int year;
    private int sum;
    public Time(int d,int m,int y)
    {
        day = d;
        mon = m;
        year = y;
    }
    public void func()
    {
        year-=1;
        mon-=12;
        sum=year*365+mon*30+day;

    }
    void print()
    {
        System.out.printf("%d",sum);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        Time T = new Time(a,b,c);
        T.func();
        T.print();
    }
}
