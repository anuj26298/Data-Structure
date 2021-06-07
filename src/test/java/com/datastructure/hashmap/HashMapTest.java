package com.datastructure.hashmap;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {
    @Test
    public void givenSentence_WordsAreAddedToList_ReturnFrequencyOfWords() {
        String phrase = "To be or not to be";
        HashMap<String, Integer> hashMap = new HashMap<>();

        String[] words = phrase.split(" ");
        for (String word : words){
            Integer value = hashMap.get(word.toLowerCase());
            if (value == null)
                value = 1;
            else
                value++;
            hashMap.add(word.toLowerCase(), value);
        }
        int frequency = hashMap.get("to");
        Assert.assertEquals(2,frequency);
    }
}
