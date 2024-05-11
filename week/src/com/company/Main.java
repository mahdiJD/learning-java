package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        double b = 20;
        double[] numbers = {a, b, a + b, a - b, a * b, a / b};

        System.out.println(Arrays.toString(numbers));
        a+= 10;
        b *= 10;
        double[] num2= {a, b, a + b, a - b, a * b, a / b}; ;
        System.out.println(Arrays.toString(num2));
    }
}
