package com.practice;

import org.w3c.dom.ls.LSOutput;

public class String_and_StringBuilder {
    public static void main(String[] args) {
//1.Reverse the given string
    String str = "Universe";
    System.out.println("String reversed is: "+revString(str));

//2.Check if the given String is a palindrome
    String s1 = "racecar";
    System.out.println("Given String is a palindrome - "+isPalindrome(s1));

//3.Count vowels/consonants in the string
    String s2 = "hello";
    countVowelsConsonants(s2);

//4.Check if the given String is an anagram
    String s3 = "Silent";
    String s4 = "Listen";
    System.out.println("Strings are anagram: "+isAnagram(s3,s4));

//5.Remove non-letters from the string
    String s5 = "Hello, world! 123";
    System.out.println("Result: "+removeNonLetters(s5));

//6.Print first non-repeating character
    String s6 = "swiss";
    System.out.println("First non-repeating character is: "+firstNonRepeating(s6));

//7.String compression
    String s7 = "aaabbcccc";
    System.out.println("Compressed string is: "+compressString(s7));

//8.Check if string contains only digits
    String s8 = "$100";
    System.out.println("The string contains only digits: "+checkContainsOnlyDigits(s8));

//9.Convert string to integer
    String s9 = "12345";
    System.out.println("The integer value of the string is: "+stringToInteger(s9));

//10.Count words in a string
    String s10 = "The quick brown fox";
    System.out.println("Total number of words in the String: "+countWords(s10));

//11.Reverse words in a string
    String s11 = "The quick brown fox";
    System.out.println("Reversed: "+reverseWords(s11));

//12.Remove duplicate characters
        String s12 = "ccoodde";
        System.out.println("After duplicates removed: "+removeDuplicateChars(s12));
    }

    public static String revString(String s)
    {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String isPalindrome(String s)
    {
        if(s.length() == 0)
        {
            return "No";
        }

        int start = 0;
        int end = s.length() -1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return "No";
            }
            start++;
            end--;
        }
        return "Yes";
    }

    public static void countVowelsConsonants(String s)
    {
        s = s.toLowerCase();
        int vowels = 0;
        int conso = 0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                vowels++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                conso++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+conso);
    }

    public static boolean isAnagram(String s1,String s2)
    {
        //check if lengths of string are equal
        if(s1.length()!=s2.length())
        {
            return false;
        }
        //normalise the strings
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //count frequency of each character in str1
        int[] freq1 = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i); //silent:s
            //convert chars to index of the array like a->0,b->1,c->2..
            int index = ch - 'a'; //ASCII for s-115,ASCII for a-97 so 18
            freq1[index]++;
        }

        //count frequency of each character in str2
        int[] freq2 = new int[26];
        for(int i=0;i<s2.length();i++)
        {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            freq2[index]++;
        }
        //compare the frequency arrays
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                return false;
            }
        }
        return true;
    }

    public static String removeNonLetters(String s)
    {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compressString(String s)
    {
        if(s.length()==0)
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else {
                sb.append(s.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        return sb.toString();
    }

    public static char firstNonRepeating(String s)
    {
        //count frequency of each letter
        int[] freq = new int[26];
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int index = ch - 'a';
            freq[index]++;
        }
        //find first character with freq = 1
        for(int j=0;j<s.length();j++)
        {
            char ch = s.charAt(j);
            int index = ch - 'a';
            if(freq[index]==1)
            {
                return ch;
            }
        }
        return '\0'; //char literal with a value of zero
    }

    public static boolean checkContainsOnlyDigits(String s)
    {
        if(s.length()==0)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

    public static int stringToInteger(String s)
    {
        int result = 0;
        for(int i=0;i<s.length();i++)
        {
            //result = result*10+ Character.getNumericValue(s.charAt(i)); OR
            result = result*10 + (s.charAt(i) - '0');
        }
        return result;
    }

    public static int countWords(String s)
    {
        int count = 1;
        boolean inWord = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
            {
                if(!inWord)
                {
                    count++;
                    inWord = true;
                }
            }
            else {
                inWord = false;
            }
        }
        return count;
    }

    public static String reverseWords(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            //Append a space after every word EXCEPT the last one.The last word appended is when i=0
            if(i>0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String removeDuplicateChars(String s)
    {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int[] a = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int index = ch - 'a';
            a[index]++;

            if(a[index]==1)
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
