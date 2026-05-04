package com.SDET_Interview_Prep;

import java.util.HashMap;

public class Week3_FrequencyMaps {
    public static void main(String[] args) {
        //Que 1: Count occurrence of each character in the String
        String s1 = "fascination";
        System.out.println("Occurrence of each character: "+charOccCount(s1));

        //Que 2: Count word occurrence in a sentence
        String s2 = "java is java";
        System.out.println("Word occurrence in the sentence: "+wordsCountInSentence(s2));
    }

    public static HashMap<Character, Integer> charOccCount(String s)
    {
        //1.Check if string is null or empty
        if(s==null || s.isEmpty())
        {
            throw new IllegalArgumentException("Input string is empty!");
        }
        //2.Initialize a hashmap to store the counts
        HashMap<Character,Integer> hm = new HashMap<>();
        //3.Traverse the entire string and store the count of character in the map
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //4.Return the map
        return hm;
    }

    public static HashMap<String, Integer> wordsCountInSentence(String s)
    {
        //1.Check if string is null or empty
        if(s==null || s.isEmpty())
        {
            throw new IllegalArgumentException("Input string is empty!");
        }
        //2.Initialize a hashmap to store the counts
        HashMap<String,Integer> hm = new HashMap<>();
        //3.Create an array of Strings
        String[] words = s.split("\\s+");
        //4.Traverse the entire array and store count of words in the map
        for(String s1:words)
        {
            hm.put(s1,hm.getOrDefault(s1,0)+1);
        }
        //5.Return the map
        return hm;
    }
}
