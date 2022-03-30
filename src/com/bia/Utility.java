package com.bia;

import java.util.Scanner;

public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public static String getString(){
        String value = scanner.nextLine();
        return value;
    }
}
