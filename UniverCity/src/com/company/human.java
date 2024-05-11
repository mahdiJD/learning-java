package com.company;

import java.util.Scanner;

public class human {
    public String name;
    public String family;

    Scanner input = new Scanner(System.in);

    public void insert() {
        System.out.print("name: ");
        name = input.next();
        System.out.print("family: ");
        family = input.next();

    }

    public void print() {
        System.out.print("name: ");
        System.out.println(name);
        System.out.print("family: ");
        System.out.println(family);

    }

}
