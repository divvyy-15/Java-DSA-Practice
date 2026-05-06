package com.SDET_Interview_Prep;

import java.util.HashMap;
import java.util.HashSet;

public class Week3_FrequencyMaps {
    public static void main(String[] args) {
        //Que 1: Count occurrence of each character in the String
        String s1 = "fascination";
        System.out.println("Occurrence of each character: "+charOccCount(s1));

        //Que 2: Count word occurrence in a sentence
        String s2 = "java is java";
        System.out.println("Word occurrence in the sentence: "+wordsCountInSentence(s2));

        //Que 3: Find first duplicate element
        int[] arr1 = {2, 5, 1, 2, 3, 5}; //2
        System.out.println("First duplicate element is: "+firstDuplicate(arr1));

        //Que 4: Check if the array contains duplicate i.e. Return true if any value appears at least twice
        int[] arr2 = {1, 2, 3, 1}; //true
        System.out.println("Does array contain any duplicate element: "+containsDuplicate(arr2));
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
        //2.Handle case sensitivity
        s = s.toLowerCase();
        //3.Initialize a hashmap to store the counts
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

    public static int firstDuplicate(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is empty");
        }
        //2.Declare a Hashset to store integers
        HashSet<Integer> hs = new HashSet<>();
        //3.Loop through the array
        for(int i=0;i<a.length;i++)
        {
            //4.Wherever we fail to add the integer in the hashset that is our duplicate, return it
            if(!hs.add(a[i]))
            {
                return a[i];
            }
        }
        //5.If no duplicate found, return a value or exception
        return -1;
    }

    public static boolean containsDuplicate(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is empty!");
        }
        //2.Declare a Hashset to store the numbers
        HashSet<Integer> hs = new HashSet<>();
        //3.Loop through the entire array
        for(int num:a)
        {
            //4.Wherever we fail to add the integer in the hashset that is our duplicate, return true
            if(!hs.add(num))
            {
                return true;
            }
        }
        //5.Else return false
        return false;
    }
}
