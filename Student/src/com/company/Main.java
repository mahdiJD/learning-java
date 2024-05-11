package com.company;

public class Main {

    public static void main(String[] args) {
        Student S = new Student();
        S.print();
        S.insert();
        S.setAge(25);
        S.setAvg(19.5);
        S.print();
        Student V =new Student(S);
        V.print();
    }
}
