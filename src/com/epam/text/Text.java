package com.epam.text;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private final String header;
    private final List<Sentence> sentences;

    public Text(String header) {
        this.header = header;
        sentences = new ArrayList<>();
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    public void printText() {
        System.out.println(header);
        for (Sentence sentence : sentences) {
            System.out.print(sentence);
        }
    }
}
