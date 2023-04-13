package com.skillstorm.week3;


public class Circle {

    public static void draw(int radius) {
        int diameter = radius * 2;
        int center = radius;
        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                int distance = (int) Math.sqrt((i-center)*(i-center) + (j-center)*(j-center));
                if (distance == radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}