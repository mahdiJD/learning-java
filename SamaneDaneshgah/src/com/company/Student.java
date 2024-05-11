package com.company;
import java.util.Arrays;
public class Student extends Human{
    private int vahed;
private double nomre[];
private double avg;

public void insert(){
    super.insert();
   vahed=input.nextInt();
    for (int i = 0; i < vahed; i++) {
        nomre[i]=input.nextInt();
        avg+=nomre[i];
    }
    avg/=vahed;
}
public void print(){
    super.print();
    System.out.println(vahed);
    for (int i = 0; i < vahed; i++) {
        System.out.println(nomre[i]);
    }
    System.out.println(avg);
}

}
