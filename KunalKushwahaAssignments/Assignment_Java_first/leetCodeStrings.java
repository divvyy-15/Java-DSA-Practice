package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class leetCodeStrings {
    public static void main(String[] args) {
//1.Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.
        char[] a1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(a1);
//2.A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
// all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
// letters and numbers.Given a string s, return true if it is a palindrome, or false otherwise.
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is a valid palindrome? " + validPalindrome(s));

//3.Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Is an anagram? " + isAnagram(s1, t1));

//4.Given a string s, find the first non-repeating character in it and return its index. If it does not
// exist, return -1.
        String s2 = "leetcode";
        System.out.println("The index at which the first unique character occurs is: " + firstUniqChar(s2));

//5.Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix is: " + longestCommonPrefixHorizontalScan(strs));
        System.out.println("Longest common prefix is: " + longestCommonPrefixVerticalScan(strs));
        System.out.println("Longest common prefix is: " + longestCommonPrefixVerticalScan2(strs));

//6.Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
// string is valid. An input string is valid if:
//i)Open brackets must be closed by the same type of brackets.
//ii)Open brackets must be closed in the correct order.
//ii)Every close bracket has a corresponding open bracket of the same type.
        String s3 = "()[]{}";
        System.out.println("Is a valid string?: " + isValid(s3));

//7.Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println("The index of first occurence of needle in Haystack: " + strStr(haystack, needle));

//8.Given a string s, find the length of the longest substring without duplicate characters.
//s consists of English letters, digits, symbols and spaces.
        String s4 = "abcabcbb";
        System.out.println("Longest substring length: "+lengthOfLongestSubstring(s4));

//9.Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//A subsequence of a string is a new string that is formed from the original string by deleting some
// (can be none) of the characters without disturbing the relative positions of the remaining characters.
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
        String s5 = "abc";
        String t2 = "ahbgdc";
        System.out.println("Is a subsequence? "+isSubSequence(s5,t2));

//10.Given a string s, reverse the order of characters in each word within a sentence while still
// preserving whitespace and initial word order.
        String s6 = "Let's take LeetCode contest";
        System.out.println("Result of reversing is: "+reverseWordsUsingBuiltinFunc(s6));
        System.out.println("Result of reversing is: "+reverseWordsWithoutBuiltinFunc(s6));

//11.We define the usage of capitals in a word to be right when one of the following cases holds:
//a) All letters in this word are capitals, like "USA".
//b) All letters in this word are not capitals, like "leetcode".
//c) Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.
        String word = "FFFFFFFFFFFFFFFFf"; //FlaG, USA
        System.out.println("Is the capital usage correct? "+detectCapitalUse(word));
        
//12.

//13.

//14.

//15.
    }

    public static void reverseString(char[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }

    public static boolean validPalindrome(String s) {
        s = s.toLowerCase();
        if (s.equals("")) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(s.charAt(i));
            }
        }
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != (sb.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            int index = c - 'a';
            int index1 = c1 - 'a';
            freq[index]++;
            freq[index1]--;
        }
        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }
        return true;
    }

    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            freq[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (freq[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static String longestCommonPrefixHorizontalScan(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefixVerticalScan(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        // Iterate through the characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i); // The character we are checking

            // Check this character against all other strings
            for (int j = 1; j < strs.length; j++) {
                // STOP if: we reached the end of word 'j' OR characters don't match
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    // Return everything we've matched up to this point
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0]; // If we finish the loop, the first word is the prefix
    }

    public static String longestCommonPrefixVerticalScan2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return prefix.toString();
                }
            }
            prefix.append(c);
        }
        return prefix.toString();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topEle = stack.pop();
                if ((c == ')' && topEle != '(') || (c == ']' && topEle != '[') || (c == '}' && topEle != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int strStr(String haystack,String needle)
    {
        for(int i=0;i<=haystack.length()-needle.length();i++) //i<= is very imp!
        {
            int j;
            for(j=0;j<needle.length();j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break; // Stop checking this starting position
                }
            }
            // If the loop finished naturally, j will equal needle.length()
            if(j==needle.length())
            {
                return i;
            }
        }
        return -1;
    }

    public static int lengthOfLongestSubstring(String s)
    {
        int windowStart=0;
        int windowEnd=0;
        int maxLen = Integer.MIN_VALUE;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        while(windowEnd<n)
        {
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch) && map.get(ch)>=windowStart)
            {
                windowStart = map.get(ch)+1;
            }
            map.put(ch,windowEnd);
            maxLen = Math.max(maxLen,windowEnd-windowStart+1);
            windowEnd++;
        }
        return (maxLen==Integer.MIN_VALUE)?0:maxLen;
    }

    public static boolean isSubSequence(String s,String t)
    {
        //an empty string is considered a subsequence of any string
        if(s.length()==0)
        {
            return true;
        }
        int ptr = 0;
        for(int i=0;i<t.length();i++)
        {
            if(ptr<s.length() && t.charAt(i) ==s.charAt(ptr))
            {
                ptr++;
            }
        }
        return ptr==s.length();// If pt equals s.length(), it means we found every character in order
    }

    public static String reverseWordsUsingBuiltinFunc(String s)
    {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            for(int j=words[i].length()-1;j>=0;j--)
            {
                sb.append(words[i].charAt(j));
            }
            if(i<words.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static String reverseWordsWithoutBuiltinFunc(String s)
    {
        char[] chars = s.toCharArray();
        int start=0; //tracks the index for the start of a word
        for(int i=0;i<=chars.length;i++)
        {
            if(i==chars.length || chars[i]==' ') //importance of order of these conditions! reversing this order would result in index out of bounds exception!
            {
                int left = start;
                int right = i-1;
                while(left<right)
                {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                start = i+1;
            }
        }
        return new String(chars);
    }

    public static boolean detectCapitalUse(String s)
    {
        int count = 0;
        boolean isFirstCap = false;
        if(s.charAt(0)>='A' && s.charAt(0)<='Z')
        {
            isFirstCap = true;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
                count++;
            }
        }
        return (count==s.length()) || count==0 || (count==1 && isFirstCap);
    }
}
