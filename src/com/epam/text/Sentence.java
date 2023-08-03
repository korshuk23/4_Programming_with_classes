package com.epam.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Word> words;

    public Sentence() {
        this.words = new ArrayList<>();
    }

    public void addWord(Word word) {
        this.words.add(word);
    }

    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();
        for (Word word : words) {
            sentence.append(word).append(" ");
        }
        sentence.setLength(sentence.length() - 1);
        sentence.append(".");
        return sentence.toString();
    }
}
