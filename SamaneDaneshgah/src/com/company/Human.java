package com.company;

import java.util.Scanner;

public class Human {
    private String name;
    private String family;
    private int id;

    Scanner input = new Scanner(System.in);

    public void insert() {
        name = input.next();
        family = input.next();
        id = input.nextInt();

    }

    public void print() {
        System.out.println(name);
        System.out.println(family);
        System.out.println(id);

    }


}
