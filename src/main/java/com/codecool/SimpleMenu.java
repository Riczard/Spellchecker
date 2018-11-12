package com.codecool;

public class SimpleMenu {

    public static void showUsageMessage() {
        System.out.println("    options");
        System.out.println("    -------");
        System.out.println("    -degenerate");
        System.out.println("        runs the spell checker with the degenerate word hashing algorithm");
        System.out.println();
        System.out.println("    -lousy");
        System.out.println("        runs the spell checker with a lousy word hashing algorithm (default)");
        System.out.println();
        System.out.println("    -better");
        System.out.println("        runs the spell checker with a better word hashing algorithm");
        System.out.println();
    }
}
