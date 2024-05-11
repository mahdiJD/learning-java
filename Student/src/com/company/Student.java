package com.company;
import java.util.Scanner;
public class Student {
    private String name;
    private String family;
    private String stnumber;
    private int age;
    private double avg;
    Scanner input = new Scanner(System.in);
    public Student()
    {
        name = "mohammad";
        family = "hassani";
        stnumber = "9412325024";
        age = 25;
        avg = 17.5;
    }
    public Student(Student in)
    {
        name = in.name;
        family = in.family;
        stnumber = in.stnumber;
        age = in.age;
        avg = in.avg;
    }
    public void setAge(int a) {
        age = a;
    }

    public void setAvg(double a) {
        avg = a;
    }

    public int getAge() {
        return age;
    }

    public double getAvg() {
        return avg;
    }

    public void insert() {
        name = input.next();
        family = input.next();
        stnumber = input.next();
    }

    public void print() {
        System.out.println(name);
        System.out.println(family);
        System.out.println(stnumber);
        System.out.println(getAge());
        System.out.println(getAvg());
    }
}