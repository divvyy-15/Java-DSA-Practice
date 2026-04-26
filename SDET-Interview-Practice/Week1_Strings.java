package com.SDET_Interview_Prep;

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

        //Que8: Print each character twice
        String s8 = "Java";
        System.out.println("All characters printed twice in the string: "+printTwice(s8));

        //Que9: Separate letters, digits & special characters from string
        String s9 = "Divy123@!";
        separateLettersDigitsSplChars(s9);

        //Que10: Check if String contains only digits
        String s10 = "2026a";
        System.out.println("The string contains only digits: "+ containsOnlyDigits(s10));

        //Que11: Prime number check
        int num4 = 25;
        System.out.println("Given number is Prime? "+isPrimeNum(num4));

        //Que12: GCD of two numbers
        int num5 = 12;
        int num6 = 8;
        System.out.println("Greatest common divisor of the given numbers is: "+gcdNums(num5,num6));
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

    public static String printTwice(String s)
    {
        //1.Declare a string builder to hold the final string
        StringBuilder sb = new StringBuilder();
        //2.Check if the string is null or empty
        if(s==null || s.isEmpty())
        {
            return "";
        }
        //3.Traverse the entire string
        for(int i=0;i<s.length();i++)
        {
            //4.Append each character twice to the stringBuilder
            char c = s.charAt(i);
            sb.append(c).append(c);
        }
        //5.return the String
        return sb.toString();
    }

    public static void separateLettersDigitsSplChars(String s)
    {
        //1.Check if the string is null or empty
        if(s==null || s.isEmpty())
        {
            System.out.println("The String is null or empty!");
        }
        //2.Declare 3 different string builder to store the characters separately
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder splChars = new StringBuilder();
        //3.Traverse the entire string
        for(int i=0;i<s.length();i++)
        {
            //4.Check and separate based on conditions, append to the appropriate string builder accordingly
            char c = s.charAt(i);
            if(Character.isLetter(c))
            {
                letters.append(c);
            } else if (Character.isDigit(c)) {
                digits.append(c);
            }
            else {
                splChars.append(c);
            }
        }
        //5.Print the Stringbuilders
        System.out.println("The letters in the String: "+letters.toString());
        System.out.println("The digits in the String: "+digits.toString());
        System.out.println("The special characters in the String: "+splChars.toString());
    }

    public static boolean containsOnlyDigits(String s)
    {
        //1.check if String is empty or null
        if(s==null || s.isEmpty())
        {
            return false;
        }
        //2.Traverse the entire string from start to end
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            //3.Check each character if it is not a digit immediately return false
            if(!Character.isDigit(c))
            {
                return false;
            }
        }
        //4. else return true
        return true;
    }

    public static boolean isPrimeNum(int n)
    {
        //1.Initialise a boolean flag variable
        boolean result = true;
        //2.check if number is less than 1
        if(n<=1)
        {
            result = false;
        }
        //2.Now in a for loop we check the divisibility of the number: if divisible by number other than 1 and itself we make flag false
        //Optimisation: we start for loop from 2 up to square root of the given number because a number that is greater than the sq root
        //of the given number will never divide the number anyway
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                result = false;
                break;
            }
        }
        //3.else make flag true and return it
        return result;
    }

    public static int gcdNums(int n1,int n2)
    {
        //1.check if number is less than 0
        if(n1<0 || n2<0)
        {
            return 0;
        }
        //2.To find HCF we use Euclidean algo which says:
        //GCD(a,b) = GCD(b,a%b) -- take it as shrinking game: we shrink the number unless one of them becomes zero (remainder) and if one
        //becomes 0, another is the answer!
        while(n2!=0)
        {
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        return n1;
    }
}
