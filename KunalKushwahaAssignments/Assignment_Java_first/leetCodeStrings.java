package com.practice;

import java.util.Arrays;

public class leetCodeStrings {
    public static void main(String[] args) {
//1.Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.
        char[] a1 = {'h','e','l','l','o'};
        reverseString(a1);
//2.A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
// all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
// letters and numbers.Given a string s, return true if it is a palindrome, or false otherwise.
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is a valid palindrome? "+validPalindrome(s));

//3.Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        String s1 = "anagram";
        String t = "nagaram";
        System.out.println("Is an anagram? "+isAnagram(s1,t));

//4.Given a string s, find the first non-repeating character in it and return its index. If it does not
// exist, return -1.
        String s2 = "leetcode";
        System.out.println("The index at which the first unique character occurs is: "+firstUniqChar(s2));

//5.

//6.

//7.

//8.

//9.

//10.

//11.

//12.

//13.

//14.

//15.
    }

    public static void reverseString(char[] a)
    {
        int left = 0;
        int right = a.length-1;
        while(left<=right)
        {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }

    public static boolean validPalindrome(String s)
    {
        s = s.toLowerCase();
        if(s.equals(""))
        {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0' && s.charAt(i)<='9'))
            {
                sb.append(s.charAt(i));
            }
        }
        int left = 0;
        int right = sb.length()-1;
        while(left<right)
        {
            if(sb.charAt(left)!=(sb.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAnagram(String s,String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            char c1 =t.charAt(i);
            int index = c - 'a';
            int index1 = c1 - 'a';
            freq[index]++;
            freq[index1]--;
        }
        for(int f:freq){
            if(f!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static int firstUniqChar(String s)
    {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int index = c - 'a';
            freq[index]++;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int index = c - 'a';
            if(freq[index]==1)
            {
                return i;
            }
        }
        return -1;
    }
}
