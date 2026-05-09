package com.SDET_Interview_Prep;

import java.util.*;

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

        //Que 5: Find all duplicates in an array
        int[] arr3 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("All duplicates in an array: "+ allDuplicatesInArray(arr3));

        //Que 6: Find first unique/non-repeating character in the string
        String s3 = "leetcode";
        System.out.println("First unique character of the string is: "+firstUniqueCharacter(s3));

        //Que 7: Given an array of integers and an integer target, return indices of the two numbers such that they add up to target.
        int[] arr4 = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Indices of the numbers that add up to target: "+ Arrays.toString(twoSum(arr4,target)));

        //Que 8: Given two arrays, find the numbers that appear in both
        int[] arr5 = {1, 2};
        int[] arr6 = {2, 3};
        System.out.println("The elements that appear in both input arrays: "+intersectionOfArrays(arr5,arr6));

        //Que 9: Remove duplicate words from the string
        String s4 = "alpha beta alpha";
        System.out.println("After removing duplicate words: "+removeDuplicateWords(s4));

        //Que 10: Check if the given Strings are valid anagrams
        String s5 = "Listen";
        String s6 = "Silent";
        System.out.println("The given input Strings are Anagrams? "+areAnagrams(s5,s6));

        //Que 11: Group the Anagrams
        String[] arr7 = {"eat", "tea", "tan"};
        System.out.println("Anagrams grouped: "+groupAnagrams(arr7));

        //Que 12: Sort Map by value
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('A',3);
        hm.put('B',1);
        hm.put('C',2);
        System.out.println("After sorting: "+sortMapByValue(hm));
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

    public static HashSet<Integer> allDuplicatesInArray(int[] a)
    {
        //1.Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is empty");
        }
        //2.Declare a List to store duplicates
        HashSet<Integer> seen = new HashSet<>();
        //3.Declare a hashset to filter the duplicates
        HashSet<Integer> duplicates = new HashSet<>();
        //4.Loop through entire array
        for(int num:a)
        {
            //4.Wherever we fail to add the integer in the hashset that is our duplicate, add to the second hashset
            if(!seen.add(num))
            {
                duplicates.add(num);
            }
        }
        //5.Return the list
        return duplicates;
        //return new ArrayList<>(duplicates);  --if list is asked to be reduced
    }

    public static char firstUniqueCharacter(String s)
    {
        //1.Check String is null or empty
        if(s==null || s.isEmpty())
        {
            throw new IllegalArgumentException("Empty or null input string");
        }
        //2.Declare a hashMap to store character and it's count
        HashMap<Character,Integer> hm = new HashMap<>();
        //3.Loop through the String to populate character and it's count in the hashMap
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        //4.Now loop through the string again and check count of character in map, as soon as value is 1 return the character
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(hm.get(c)==1)
            {
                return c;
            }
        }
        throw new RuntimeException("No Unique character found!");
    }

    public static int[] twoSum(int[] a,int target)
    {
        //1.Check if input array is null or has lesser than 2 elements
        if(a==null || a.length<2)
        {
            throw new IllegalArgumentException("Input array is null or empty!");
        }
        //2.Initialize a map to store value, indices
        HashMap<Integer,Integer> hm = new HashMap<>();
        //3.Traverse the entire array and populate map
        for(int i=0;i<a.length;i++)
        {
            int complement = target - a[i];
            if(hm.containsKey(complement))
            {
                return new int[] {hm.get(complement),i};
            }
            else
            {
                hm.put(a[i],i);
            }
        }
        throw new RuntimeException("No pair found!");
    }

    public static ArrayList<Integer> intersectionOfArrays(int[] a, int[] b)
    {
        //1.Check if array is null or empty
        if(a==null || b==null || a.length==0 || b.length==0)
        {
            throw new IllegalArgumentException("Input array is null or empty!");
        }
        //2.Initialize a hashSet for storing unique elements from first array
        HashSet<Integer> hsFirst = new HashSet<>();
        //3.Initialize another HashSet to store unique result elements
        HashSet<Integer> result = new HashSet<>();
        //4.Traverse first array to store it in the set
        for(int num:a)
        {
            hsFirst.add(num);
        }
        //5.Traverse second array and check which elements are present in hashSet storing first array elements
        for(int num:b)
        {
            if(hsFirst.contains(num))
            {
                result.add(num);
            }
        }
        //5.Return the result
        return new ArrayList<>(result);
    }

    public static String removeDuplicateWords(String s)
    {
        //1.Check if string is null or empty
        if(s==null || s.isEmpty())
        {
            throw new IllegalArgumentException("Input String is empty!");
        }
        //2.Initialize a linkedHashSet to store ordered unique words from the string
        LinkedHashSet<String> result = new LinkedHashSet<>();
        //3.Create an array of words
        String[] words = s.split("\\s+");
        //4.Initialize a StringBuilder
        StringBuilder sb = new StringBuilder();
        //5.Traverse through the entire array and add to the set
        for(String w:words)
        {
            result.add(w);
        }
        //6.Create a String from the set elements and return it
        for(String word:result)
        {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }

    public static boolean areAnagrams(String s1,String s2)
    {
        //1.Check if string is null, empty
        if(s1==null || s2==null || s1.isEmpty() || s2.isEmpty())
        {
            throw new IllegalArgumentException("Input Strings are empty or null!");
        }
        //2.Check whether the length of both the strings are same
        if(s1.length()!=s2.length())
        {
            return false;
        }
        //3.Normalise the case of both the strings
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //4.Initialize a map to store characters and their counts
        HashMap<Character,Integer> hm = new HashMap<>();
        //5.Loop through first string to store chars and count in the map [Add]
        for(int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //6.Loop through second string [Subtract]
        for(int i=0;i<s2.length();i++)
        {
            char c = s2.charAt(i);
            if(!hm.containsKey(c))
            {
                return false; //Character doesn't exist in s1 at all
            }
            else {
                hm.put(c,hm.get(c)-1);
                if(hm.get(c)<0)
                {
                    return false;
                }
            }
        }
        //7.If length was equal and both the strings had exact same characters - it is an anagram!
        return true;
    }

    public static ArrayList<List<String>> groupAnagrams(String[] s)
    {
        //1.Check if the array is null or empty
        if(s==null || s.length==0)
        {
            throw new IllegalArgumentException("Input array is null or empty!");
        }
        //2.Declare a Map of String,List of string
        HashMap<String, List<String>> hm = new HashMap<>();
        //3.Loop through word in your array
        for(String w:s)
        {
            //4.Convert the word to character array and sort it
            char[] alphabets = w.toCharArray();
            Arrays.sort(alphabets);
            //5.Then turn it back to string - becomes key
            String key = new String(alphabets); // This turns [a, e, t] into "aet"
            //6.Populate the map, if the sorted word isn't there, put empty arraylist there and
            if(!hm.containsKey(key))
            {
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(w); // Add the ORIGINAL word (w)
        }
        //7.Return only the groups (values)
        return new ArrayList<>(hm.values());
    }

    public static LinkedHashMap<Character, Integer> sortMapByValue(HashMap<Character,Integer> hm)
    {
        //1.Convert the entrySet to a list
        List<Map.Entry<Character,Integer>> entrySetList = new ArrayList<>(hm.entrySet());
        //2.Sort this list based on values using comparator
        Collections.sort(entrySetList,(e1,e2) ->e1.getValue().compareTo(e2.getValue()));
        //3.Initialize a linkedHashMap to remember the order
        LinkedHashMap<Character,Integer> result = new LinkedHashMap<>();
        //4.Loop through the list and put each pair in the linkedHashMap
        for(Map.Entry<Character,Integer> e:entrySetList)
        {
            result.put(e.getKey(),e.getValue());
        }
        //5.Return it
        return result;
    }
}
