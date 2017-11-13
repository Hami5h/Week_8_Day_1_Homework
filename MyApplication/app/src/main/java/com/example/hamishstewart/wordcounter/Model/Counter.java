package com.example.hamishstewart.wordcounter.Model;

/**
 * Created by hamishstewart on 13/11/2017.
 */

public class Counter {

    public static int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }

}
