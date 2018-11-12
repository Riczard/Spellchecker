package com.codecool.checkers;

import com.codecool.WordList;
import com.codecool.stringHashers.StringHasher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Checker {

    public Checker() {

    }

    public void check(StringHasher stringHasher) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String fileName = "wordlist.txt";
        ArrayList sugestionWords;

        System.out.println("Enter your word: ");
        String inputWord = scanner.next().toUpperCase();

        WordList wordList = new WordList(stringHasher, fileName);

        WordChecker wordChecker = new WordChecker(wordList);

        sugestionWords = wordChecker.getSuggestions(inputWord);
        System.out.println(inputWord + "     word not found: ");

        Collections.sort(sugestionWords);
        System.out.println("  perhaps you mean: ");

        for (Object word : sugestionWords) {
            System.out.println("     " + word);
        }

    }
}
