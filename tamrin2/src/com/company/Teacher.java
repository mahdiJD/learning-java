package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher {
    public String name;
    public String family;
    public String pcode;
    public int swork;
    public double salary;
    public String[] lessonsName;
    public int[] vahed;

    public Teacher() {
        name = "Ali";
        family = "Rezaei";
        pcode = "91123";
        swork = 18;
        salary = 100;
        lessonsName = new String[]{"DataStructure", "AdvancedProgramming", "NetworkSequrity", "MicroProssesor"};
        vahed = new int[]{3, 3, 3, 3};
    }

    Scanner input = new Scanner(System.in);

    public void insert() {
        name = input.next();
        family = input.next();
        pcode = input.next();
        swork = input.nextInt();
        salary = input.nextInt();
        lessonsName[0] = input.next();
        lessonsName[1] = input.next();
        lessonsName[2] = input.next();
        lessonsName[3] = input.next();
        vahed[0] = input.nextInt();
        vahed[1] = input.nextInt();
        vahed[2] = input.nextInt();
        vahed[3] = input.nextInt();
    }

    public int x;

    public void calculation() {
        for (int i = 0; i < 4; i++) {
            x += vahed[i];
        }
        salary += x * 50;
    }

    public void print() {
        System.out.println(name);
        System.out.println(family);
        System.out.println(pcode);
        System.out.println(swork);
        System.out.println(salary);
        System.out.println(Arrays.toString(lessonsName));
        System.out.println(Arrays.toString(vahed));


    }

}
