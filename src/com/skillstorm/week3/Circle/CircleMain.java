package com.skillstorm.week3.Circle;
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle (or leave blank for default): ");
        String scan = scanner.nextLine();
        scanner.close();

        int r;//radius
        if (scan.equals("")) {
            r = 3; // default radius if none is input
        } else {
            r = Integer.parseInt(scan);
        }

        Circle.draw(r);
    }
}
