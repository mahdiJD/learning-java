package com.company;
import java.lang.String;
import java.util.Scanner;
public class Student {
    private String name;
    private String family;
    private String stnumber;
    private int age;
    private double avg;
    Scanner input = new Scanner(System.in);
    public void setAge(int a)
    {
        age = a;
    }
    public void setAvg(double a)
    {
        avg = a;
    }
    public int getAge()
    {
        return age;
    }
    public double getAvg()
    {
        return avg;
    }
    public void insert()
    {
        name = input.next();
        family = input.next();
        stnumber = input.next();
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(family);
        System.out.println(stnumber);
        System.out.println(getAge());
        System.out.println(getAvg());
    }
    public static void main(String[] args)
    {
        Student S = new Student();
        S.insert();
        S.setAge(25);
        S.setAvg(19.5);
        S.print();
    }
Student S=new Student();
    S.name ="mahmod"(String);
    S.family= bijari;

}
