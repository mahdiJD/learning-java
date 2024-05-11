package com.company;

public class Student extends human {
    public int sId;

    public void insert() {
        super.insert();
        System.out.print("student ID: ");
        sId = input.nextInt();

    }

    public void print() {
        super.print();
        System.out.print("student ID: ");
        System.out.println(sId);
    }
}
