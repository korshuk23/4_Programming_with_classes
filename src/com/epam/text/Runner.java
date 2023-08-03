package com.epam.text;

/*
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Runner {
    public static void main(String[] args) {
        Text text = new Text("\t\t\t\t\t\tThis is text header");
        Sentence sentence1 = new Sentence();
        sentence1.addWord(new Word("This"));
        sentence1.addWord(new Word("is"));
        sentence1.addWord(new Word("the"));
        sentence1.addWord(new Word("first"));
        sentence1.addWord(new Word("sentence"));
        text.addSentence(sentence1);

        Sentence sentence2 = new Sentence();
        sentence2.addWord(new Word("This"));
        sentence2.addWord(new Word("is"));
        sentence2.addWord(new Word("the"));
        sentence2.addWord(new Word("second"));
        sentence2.addWord(new Word("sentence"));
        text.addSentence(sentence2);

        text.printText();
    }
}
