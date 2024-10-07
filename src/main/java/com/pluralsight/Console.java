package com.pluralsight;

import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);

    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String promptForString() {
        return scanner.nextLine();
    }

    // Method for Boolean
    public static boolean promptForBoolean(String prompt) {
        System.out.print(prompt + "Y for Yes, N for No: ");
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase (("Y")) || userInput.equalsIgnoreCase(("yes")));
    }

    // Method for Short
    public static short promptForShort(String prompt) {
        System.out.print(prompt);
        short value = scanner.nextShort();
        scanner.nextLine();
        return value;
    }
    public static byte PromptForByte(String prompt){
        System.out.print(prompt);
        byte userByte =scanner.nextByte();
        return userByte;
    }
}
