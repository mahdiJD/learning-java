package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.insert();
        student.insert();
        teacher.print();
        student.print();
    }
}
