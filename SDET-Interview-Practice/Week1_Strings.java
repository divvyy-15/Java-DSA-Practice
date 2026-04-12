package com.SDET_Interview_Prep;

import java.util.Arrays;

public class Week1_Strings {
    public static void main(String[] args) {
        //Que1: Reverse a String - Approach 1:Use StringBuilder, Approach 2:Two-pointer approach
        String s1 = "Automation";
        System.out.println("Reversed String (Approach 1): "+revStringApp1(s1));
        System.out.println("Reversed String (Approach 2): "+revStringApp2(s1));

        //Que2: Check if string is a valid palindrome - Approach 1:reverse the entire string, Approach 2:Two-pointer approach
        String s2 = "madam";
        String st2 = "A man, a plan, a canal: Panama";
        System.out.println("The given string is a valid palindrome? "+isPalindrome(s2));
        System.out.println("The given string is a valid palindrome? "+isPalindromeMemoryOptimised(st2));
    }

    public static String revStringApp1(String s)
    {
        //1.Create a string builder to store final result. mutability.
        StringBuilder sb = new StringBuilder();

        //2.Check if string is empty(content) or null(length)
        if(s==null || s.isEmpty())
        {
            return "String is empty or null!";
        }
        //3.If not, Traverse the input string starting from the last character
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            //4.Append until we have character in the string, to stringbuilder
            sb.append(c);
        }
        //5.Print the stringbuilder/return it
        return sb.toString();
    }

    public static String revStringApp2(String s)
    {
        //1.Convert the input string to character array
        char[] arr = s.toCharArray();
        //2.Declare two pointers that swap the characters at their position and move inward
        int i = 0;
        int j = s.length()-1;
        char temp;
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        //3.Convert the character back to String and return it
        //return Arrays.toString(arr); --> returns: [n, o, i, t, a, m, o, t, u, A]
        return new String(arr);
    }

    public static boolean isPalindrome(String s)
    {
        //1.normalize the string - should not have lowercase/uppercase issues,ignore space/special characters
        String normalizedStr = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        /*If regex not allowed
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                sb.append(c);
            }
        }
        String normalizedStr = sb.toString();*/
        //2.convert to character array
        char[] ch = normalizedStr.toCharArray();
        //3.Take two pointers at the start and end of the string
        int i = 0;
        int j = ch.length - 1;
        //4.Compare characters at these two pointers & return false the moment they aren't equal else true
        while(i<j)
        {
            if(ch[i] != ch[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindromeMemoryOptimised(String s)
    {
        //1.Normalise case
        s = s.toLowerCase();
        //2.Convert to character array
        char[] ch = s.toCharArray();
        //3.Take two pointers at the start and end of the string
        int i = 0;
        int j = ch.length - 1;
        //4.Compare characters at these two pointers & return false the moment they aren't equal else true
        while(i<j)
        {
            if(!Character.isLetterOrDigit(ch[i]))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(ch[j]))
            {
                j--;
            }
            else
            {
                if(ch[i]!=ch[j])
                {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
