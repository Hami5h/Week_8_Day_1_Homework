package com.example.hamishstewart.wordcounter;

/**
 * Created by hamishstewart on 13/11/2017.
 */

public class Counter {
    private String sentence;

    public Counter(String sentence) {
        this.sentence = sentence;
    }

    public int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }

}
