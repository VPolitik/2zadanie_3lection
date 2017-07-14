package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 3, b = -5;
        double y;
        for (double x = 1; x < 5; x += 0.5) {
            y = a * (x * x) + b;
            System.out.println("Решение на этом шаге будет y = " + y);
        }
    }
}
