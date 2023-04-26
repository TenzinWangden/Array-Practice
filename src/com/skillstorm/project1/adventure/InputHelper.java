package com.skillstorm.project1.adventure;

import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;

    public InputHelper() {
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    public int getInt(String prompt) {
        System.out.print(prompt + " ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(prompt + " ");
        }
        return scanner.nextInt();
    }
}
