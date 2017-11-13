package com.example.hamishstewart.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 13/11/2017.
 */

public class CounterTest {
    Counter counter;

    @Test
    public void getWordCount() {
        this.counter = new Counter("I want to count");
        assertEquals(4, counter.getWordCount("I want to count"));
    }


}
