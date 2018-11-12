package com.codecool;

import com.codecool.stringHashers.BetterStringHasher;
import com.codecool.stringHashers.DegenerateStringHasher;
import com.codecool.stringHashers.LousyStringHasher;

import java.util.Scanner;

public class SpellCheck {

    public Object getProperHasher() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your option: ");
        String option = scanner.next();

        switch (option){
            case "-degenerate":
                return new DegenerateStringHasher();

            case "-lousy":
                return new LousyStringHasher();

            case "-better":
                return new BetterStringHasher();
        }

        return false;
    }
}
