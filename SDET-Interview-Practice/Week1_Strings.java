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

        //Que3: Check whether the number is a palindrome without converting it to a String
        int num1 = 121;
        System.out.println("The given number is a Palindrome? "+isNumPalindrome(num1));

        //Que4: Swap two integers & String without a third variable
        int num2 = 50;
        int num3 = 100;
        String s3 = "Hello";
        String s4 = "World";
        swapIntegers(num2,num3);
        swapStrings(s3,s4);

        //Que5: Count vowels and consonants in the given string
        String s5 = "Universe 15 listens";
        countVowelsConsonants(s5);

        //Que6: Remove non-letter characters from the string
        String s6 = "Divyanshi123@";
        System.out.println("After removing non-letter characters: "+removeNonLetter(s6));

        //Que7: Print even-indexed characters of the string
        String s7 = "Automation";
        System.out.println("Even indexed characters of the string: "+printEvenIndexedChars(s7));
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

    public static boolean isNumPalindrome(int n)
    {
        //1.Store the original in an integer variable so that it remains unchanged for comparison
        int original = n;
        int rev = 0;
        //2.Handle negative numbers
        if(n<0)
        {
            return false;
        }
        //3.reverse the number mathematically (modulo-division)
        while(n>0)
        {
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        //4.If the reverse of the number == original number, return true else false
        return rev == original;
    }

    public static void swapIntegers(int n1,int n2)
    {
        System.out.println("Before swap, value of first variable: "+n1);
        System.out.println("After swap, value of second variable: "+n2);
        //1.Combine: Add both numbers and store the total in the first variable
        n1 = n1 + n2;
        //2.Isolate First: Subtract the second variable from the total to get the original first value; store this in the second variable
        n2 = n1 - n2;
        //3.Isolate Second: Subtract the new second variable from the total to get the original second value; store this in the first variable
        n1 = n1 - n2;
        System.out.println("After swap, value of first variable: "+n1);
        System.out.println("After swap, value of second variable: "+n2);
    }

    public static void swapStrings(String s1,String s2)
    {
        System.out.println("Before swap, value of first variable: "+s1);
        System.out.println("After swap, value of second variable: "+s2);
        //1.Append both the strings into one
        s1 = s1 + s2; //JavaAutomation, s1.length=14,s2=10
        //2.Extract first part of the new String to store in second variable
        s2 = s1.substring(0,s1.length()-s2.length());
        //3.Now take the remaining part of the string and store in first variable
        s1 = s1.substring(s2.length());
        System.out.println("After swap, value of first variable: "+s1);
        System.out.println("After swap, value of second variable: "+s2);
    }

    public static void countVowelsConsonants(String s)
    {
        //1.declare the variables that will hold the vowels and consonants count
        int vowelsCount = 0;
        int consonantCount = 0;
        //2.Traverse the entire string
        for(int i=0;i<s.length();i++)
        {
            char c = s.toLowerCase().charAt(i);
            //3.Check whether the character in the string is a vowel, if so we increase the count stored in vowelsCount variable
            if(Character.isLetter(c))
            {
                switch(c)
                {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                        vowelsCount++;
                        break;
                    default:
                        consonantCount++; //4.If not vowel,it should be a valid letter so then we can increase consonants count variable
                }
            }
        }
        //5.Print the final counts for vowels and consonants
        System.out.println("Number of vowels in the String: "+vowelsCount);
        System.out.println("Number of consonants in the String: "+consonantCount);
    }

    public static String removeNonLetter(String s)
    {
        //can directly solve with regex:
        //return s.replaceAll("[^a-zA-Z]","");

        //1.Declare a stringBuilder that will store the resultant string
        StringBuilder sb = new StringBuilder();
        //2.Traverse the entire string
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            //3.Check if the character is letter, then add it to the stringbuilder
            if(Character.isLetter(c))
            {
                sb.append(c);
            }
        }
        //4.Return the final string
        return sb.toString();
    }

    public static String printEvenIndexedChars(String s)
    {
        //1.Declare a stringBuilder which will hold the final output string
        StringBuilder sb = new StringBuilder();
        //2.Traverse the entire string
        for(int i=0;i<s.length();i++)
        {
            //3.Check if the index is even, then add it to stringBuilder
            if(i%2==0)
            {
                sb.append(s.charAt(i));
            }
        }
        //4.return the final string
        return sb.toString();
    }
}
