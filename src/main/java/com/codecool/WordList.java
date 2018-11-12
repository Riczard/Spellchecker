package com.codecool;

import com.codecool.stringHashers.StringHasher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordList {

    private final HashTable hashTable;

    public WordList(StringHasher stringHasher, String fileName) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        int tableSize = Integer.parseInt(reader.readLine());
        this.hashTable = new HashTable((int)((double)tableSize * 1.2D), stringHasher);

        for(int i = 0; i < tableSize; i++){
            this.hashTable.add(reader.readLine().trim().toUpperCase());
        }

        reader.close();
    }

    public boolean lookup(String string) {
        return this.hashTable.lookup(string.toUpperCase());
    }
}
