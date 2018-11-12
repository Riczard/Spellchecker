package com.codecool;


import com.codecool.checkers.Checker;
import com.codecool.stringHashers.StringHasher;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        SpellCheck spellCheck = new SpellCheck();

        SimpleMenu.showUsageMessage();

        Object hasher = spellCheck.getProperHasher();

        long startBenchmarkTime = System.currentTimeMillis();

        Checker checker = new Checker();
        checker.check((StringHasher) hasher);

        long endBenchmarkTime = System.currentTimeMillis();

        System.out.println("Checker benchmark time: " + (endBenchmarkTime - startBenchmarkTime) + "ms");
    }
}
