package com.company;

public class Teacher extends human {
    public int Salari;

    public void insert() {
        super.insert();
        System.out.print("teacher Salari: ");
        Salari = input.nextInt();
    }

    public void print() {
        super.print();
        System.out.println("teacher Salari: " +Salari);

    }
}
