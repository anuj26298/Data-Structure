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

    @Test
    public void givenSentence_WhenWordsAreAddedToList_ReturnFrequencyOfParanoidWord() {
        String phrase = "Paranoids are not paranoid because they are paranoid but because " +
                "they keep putting themselves into paranoid avoidable situations";

        HashTable<String , Integer> hashTable = new HashTable<>();
        String[] words = phrase.toLowerCase().split(" ");
        for (String word : words){
            Integer value = hashTable.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            hashTable.add(word, value);
        }
        int frequency = hashTable.get("paranoid");
        Assert.assertEquals(3,frequency);
    }

    @Test
    public void givenSentence_WhenRemovedAWordFrom_ReturnNullFrequencyForWord() {
        String phrase = "Paranoids are not paranoid because they are paranoid but because " +
                "they keep putting themselves into paranoid avoidable situations";
        HashTable<String ,Integer> hashTable = new HashTable<>();
        String[] words = phrase.toLowerCase().split(" ");
        for (String word : words){
            Integer value = hashTable.get(word);
            if (value == null)
                value = 1;
            else
                value++;
            hashTable.add(word, value);
        }

        hashTable.remove("avoidable");
        Integer frequency = hashTable.get("avoidable");
        Assert.assertEquals(null,frequency);
    }
}
