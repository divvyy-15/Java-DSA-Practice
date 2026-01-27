package com.practice;

import java.util.*;

public class Mixed_topics_practice {

    public static void main(String[] args) {

//1.Find Max & Min in the given array
        int[] a1 = {3, 5, 1, 8, 2, 9};
        maxMinArray(a1);

//2.Reverse a string
        String s1 = "Heathrow";
        System.out.println("The reversed string is: " + reverseStringSB(s1));
        System.out.println("The reversed string is: " + reverseStringAlternateApproach(s1));

//3.Find frequency of elements
        int[] a2 = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Frequency of all elements is: " + findFreq(a2));

//4.Fibonacci series upto n terms
        fiboSeries(7);
        System.out.println();

//5.Count occurences of an element
        int[] a3 = {1, 2, 3, 2, 4, 2, 5};
        int ele = 2;
        System.out.println("Element " + ele + " occurs " + eleOccCount(a3, ele) + " times in the array");

//6.Count number of words in a Sentence
        String s2 = "I have a class today";
        String s3 = "   Java    programming   ";
        System.out.println("Total number of words in the sentence: " + wordCountInSentence(s2));

//7.First non-repeating element
        int[] a4 = {4, 5, 1, 2, 5, 4, 1};
        int[] a5 = {1, 1, 2, 2, 3, 3};
        System.out.println("First non-repeating element in the array: " + findFirstNonRepeatingEle(a5));

//8.Check whether the given number is prime
        System.out.println("The given number is a prime: " + isPrime(10));

//9.Find smallest number in the array
        int[] a6 = {5, 3, 8, 1, 9, 2};
        int[] a7 = {-5, 0, 3, -2};
        System.out.println("Smallest number in the array is: " + smallestInTheArray(a7));

//10.Check if String Contains Only Digits
        String s4 = "12345";
        String s5 = "123abc";
        System.out.println("String contains only digits? " + hasOnlyDigits(s5));

//11.Find indices of two numbers that add up to target
        int[] a8 = {2, 7, 11, 15};
        System.out.println("The indices of the numbers adding up to the target: " + Arrays.toString(twoSum(a8, 9)));

//12.Reverse digits of an integer
        int num = -12345;
        System.out.println("The number reversed is: " + reverseDigits(num));

//13.Find second-largest element in the array
        int[] a9 = {5, 3, 8, 1, 9, 2};
        int[] a10 = {10, 10, 8, 7};
        System.out.println("The second largest element in the array is: " + secLargest(a10));

//14.Character occurrence in a String
        String s6 = "java";
        char target = 'z';
        System.out.println(target + " appears in " + s6 + " " + charOcc(s6, target) + " times! ");

//15.Remove duplicates in the array
        int[] a11 = {1, 2, 3, 2, 4, 1, 5};
        System.out.println("After removing duplicates: " + Arrays.toString(removeDupes(a11)));

//16.Check if the given number is an Armstrong number
//a number that equals the sum of its own digits, each raised to the power of the total number of digits
// in the number
        int n1 = 153;
        System.out.println("Given number is an Armstrong number? " + isArmstrongNumber(n1));

//17.Find third-largest element in the array
        int[] a12 = {5, 3, 8, 1, 9, 2, 7};
        int[] a13 = {10, 10, 8, 7, 7, 5};
        int[] a14 = {5, 3};
        System.out.println("Third largest element in the array is: " + thirdLargest(a14));

//18.Find duplicate characters in a string i.e. characters that appear more than once
        String s7 = "";//"hello","programming";
        System.out.print("Duplicate characters are: ");
        dupeCharsInAString(s7);

//19.Find most frequent element
        int[] a15 = {5, 5, 5, 5};//{1, 3, 2, 3, 4, 3, 5};
        System.out.println("The most frequently occuring element in the array is: " + mostFreqEle(a15));

//20.Count digits in a number
        int n2 = 12345;
        System.out.println("Number of digits in the given number is: " + countNumOfDigits(n2));

//21.Remove duplicates from a sorted array
        int[] a16 = {1, 1, 2, 2, 3, 4, 4, 5};
        System.out.println("After removing duplicates,the modified length of the array is: " + removeDupesFromArray(a16));

//22.Remove duplicate words from a sentence
        String s8 = "java is great and java is powerful";
        String s9 = "the the the cat sat";
        System.out.println("After removing duplicates: " + removeDupesFromSentence(s9));

//23.Find word occurrence in a string
        String s10 = "java is great and java is fun";
        System.out.println("Word occurrence of the stirng: " + wordOccurrenceIntheString(s10));

//24.Swap Two Numbers Without Temp Variable
        int a = 5,b=10;
        swapNums(a,b);

//25.Move all zeros to the end
        int[] a17 = {0, 1, 0, 3, 12};
        System.out.println("After moving the zeros to the end: "+Arrays.toString(moveZeroes(a17)));

//26.Count vowels and consonants
        String s11 = "Programming123";
        countVowelsConsonants(s11);

//27.Find the FIRST element that appears more than once."First" means the element whose second occurrence
// comes earliest i.e. Find the element that appears earliest in the array and has a duplicate somewhere
        int[] a18 = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("The first duplicate in the array is: "+firstDupeIntheArray(a18));

//28.Check if the given number is a palindrome
        int n3 = 12321;
        System.out.println("Is the given number a palindrome: "+isPalindrome(n3));

//29.Rotate array to the left by K positions
        int[] a19 = {1, 2, 3, 4, 5};
        int k = 2;
        rotateLeftByK(a19,k);

//30.Reverse each word individually, maintain word order
        String s12 = "I have a class today";
        System.out.println("After reversing each word: "+reverseEachWord(s12));

//31.Print frequency of each element
        int[] a20 = {1, 2, 2, 3, 3, 3, 4};
        freqOfEachEleInArray(a20);

//32.Find factorial of a number using iterative approach
        System.out.println("Factorial of the number is: "+findFactorialIterative(1));

//33.Find factorial of a number using recursive appraoch
        System.out.println("Factorial of the number is: "+findFactorialRecursively(5));
    }

    public static void maxMinArray(int[] a) {
        //empty array check
        if (a.length == 0) {
            return; //no value would be returned just the func will exit!
        }
        int maxEle = Integer.MIN_VALUE; //instead of setting it to 0 which would give out incorrect results if all the values in thw array are say negative,then result would become 0 which is not even present in the array!!
        int minEle = Integer.MAX_VALUE;
        for (int num : a) {
            if (num > maxEle) {
                maxEle = num;
            }
            if (num < minEle) {
                minEle = num;
            }
        }
        System.out.println("Maximum element in the array: " + maxEle);
        System.out.println("Minimum element in the array: " + minEle);
    }

    public static String reverseStringSB(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseStringAlternateApproach(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static HashMap<Integer, Integer> findFreq(int[] a) {
        if (a == null) {
            return new HashMap<>();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        /*for(int i:a)
        {
            if(!hm.containsKey(i))
            {
               hm.put(i,1);
            }
            else {
                hm.put(i,hm.get(i)+1);
            }
        }*/
        for (int i : a) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        return hm;
    }

    public static void fiboSeries(int n)   //0,1,1,2,3,5,8
    {
        if (n <= 0) {
            return;
        }
        int firstTerm = 0;
        if (n == 1) {
            System.out.println(firstTerm);
            return;
        }
        int secTerm = 1;
        System.out.print(firstTerm + " , " + secTerm);
        int i = 2;
        while (i < n) {
            int next = firstTerm + secTerm;
            System.out.print(" , " + next);
            firstTerm = secTerm;
            secTerm = next;
            i++;
        }
    }

    public static int eleOccCount(int[] a, int e) {
        //empty array check
        if (a.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i : a) {
            if (i == e) {
                count++;
            }
        }
        return count;
    }

    public static int wordCountInSentence(String s) {
        //I have a class today
        String[] word = s.split(" ");
        return word.length;
    }

    public static int findFirstNonRepeatingEle(int[] a) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i : a) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        /*for(Map.Entry<Integer, Integer> entry:freqMap.entrySet()) //to use this,use linkedHashMap to maintain order
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }*/
        for (int i : a) {
            if (freqMap.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer smallestInTheArray(int[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        int minEle = Integer.MAX_VALUE;
        for (int i : a) {
            if (i < minEle) {
                minEle = i;
            }
        }
        return minEle;
    }

    public static boolean hasOnlyDigits(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];
            if (hm.containsKey(complement)) {
                return new int[]{hm.get(complement), i};
            }
            hm.put(a[i], i);
        }
        return new int[]{-1, -1};
    }

    public static int reverseDigits(int n) {
        int sum = 0; //either make this long type to avoid integer overflow
        while (n != 0) {
            int rem = n % 10;
            if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && rem > 7)) //check for positive overflow
            {
                return 0;
            } else if (sum < Integer.MIN_VALUE / 10 || (sum == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return sum; //return (int) sum;
    }

    public static int secLargest(int[] a) {
        if (a.length == 1)
            return -1;
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for (int i : a) {
            if (i > largest) {
                secLar = largest;
                largest = i;
            } else if (i > secLar && i != largest) {
                secLar = i;
            }
        }
        return (secLar == Integer.MIN_VALUE) ? -1 : secLar;
    }

    public static int charOcc(String s, char t) {
        s = s.toLowerCase();
        t = Character.toLowerCase(t);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                count++;
            }
        }
        return count;
    }

    public static Integer[] removeDupes(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : a) {
            hs.add(i);
        }
        Integer[] result = new Integer[hs.size()];
        hs.toArray(result);
        return result;
    }

    public static boolean isArmstrongNumber(int n) {
        String numString = String.valueOf(n);
        int noOfDigits = numString.length();
        int ori = n;
        double sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + Math.pow((double) rem, (double) noOfDigits);
            n = n / 10;
        }
        return (int) sum == ori;
    }

    public static int thirdLargest(int[] a) {
        if (a.length < 3)
            return -1;
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        int thirdLar = Integer.MIN_VALUE;
        for (int n : a) {
            if (n > largest) {
                thirdLar = secLar;
                secLar = largest;
                largest = n;
            } else if (n > secLar && n < largest) {
                thirdLar = secLar;
                secLar = n;
            } else if (n > thirdLar && n < secLar) {
                thirdLar = n;
            }
        }
        return (thirdLar == Integer.MIN_VALUE) ? -1 : thirdLar;
    }

    public static void dupeCharsInAString(String s) {
        if (s.isEmpty()) {
            System.out.println("No duplicate characters found!");
        }
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> e : freqMap.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + " ");
            }
        }
    }

    public static int mostFreqEle(int[] a) {
        if (a.length == 0)
            return -1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : a) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int maxFreq = 0;
        int maxEle = a[0]; //assuming first element is the most freq one
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                maxEle = e.getKey();
            }
        }
        return maxEle;
    }

    public static int countNumOfDigits(int n) {
        //Mathematical approach for counting digits:
        //return (int) Math.log10(n) + 1;
        //Another way-
        int digits = 0;
        while (n > 0) {
            digits++;
            n = n / 10;
        }
        return digits;
    }

    public static int removeDupesFromArray(int[] a) {
        int writePos = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[writePos - 1]) {
                a[writePos] = a[i];
                writePos++;
            }
        }
        System.out.println("Array: " + Arrays.toString(a));
        return writePos;
    }

    public static String removeDupesFromSentence(String s) {
        String[] words = s.split(" ");
        HashSet<String> nonDupeWords = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!nonDupeWords.contains(words[i])) {
                nonDupeWords.add(words[i]);
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static HashMap<String, Integer> wordOccurrenceIntheString(String s)
    {
        HashMap<String,Integer> wordOcc = new HashMap<>();
        String[] words = s.split(" ");
        for(String w:words)
        {
            wordOcc.put(w,wordOcc.getOrDefault(w,0)+1);
            /*if(!wordOcc.containsKey(w))
            {
                wordOcc.put(w,1);
            }
            else {
                wordOcc.put(w,wordOcc.get(w)+1);
            }*/
        }
        return wordOcc;
    }

    public static void swapNums(int x,int y)
    {
        System.out.println("Value of first variable before swapping: "+x);
        System.out.println("Value of second variable before swapping: "+y);
        /*x = x+y;
        y = x-y;
        x = x-y;*/

        x = x*y; //50 prev 5
        y = x/y; //now 5
        x = x/y;
        System.out.println("Value of first variable after swapping: "+x);
        System.out.println("Value of second variable after swapping: "+y);
    }

    public static int[] moveZeroes(int[] a)
    {
        int writePos = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0) {
                a[writePos] = a[i];
                writePos++;
            }
        }
        for(int i=writePos;i<a.length;i++)
        {
            a[i] = 0;
        }
        return a;
    }

    public static void countVowelsConsonants(String s)
    {
        s = s.toLowerCase();
        int vowelsCount = 0;
        int consonantCount = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='z')
            {
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    vowelsCount++;
                }
                else
                {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: "+vowelsCount);
        System.out.println("Consonants: "+consonantCount);
    }

    public static int firstDupeIntheArray(int[] a)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(int j=0;j<a.length;j++)
        {
            if(hm.containsKey(a[j]) && hm.get(a[j])>1)
            {
                return a[j];
            }
        }
        return -1;
    }

    public static String isPalindrome(int n)
    {
        int temp = n;
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum = sum*10 + rem;
            n = n/10;
        }
        if(sum==temp)
        {
            return "Yes!";
        }
        else {
            return "No!";
        }
    }

    public static void reverseArray(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeftByK(int[] a,int k)
    {
        //Reversal algorithm
        k = k % a.length;
        reverseArray(a,0,k-1); //reverse first two elements
        reverseArray(a,k,a.length-1); //reverse remaining elements
        reverseArray(a,0,a.length-1); //reverse the entire array
        System.out.println("After rotation: "+Arrays.toString(a));
    }

    public static String reverseEachWord(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String w:words)
        {
            for(int i=w.length()-1;i>=0;i--)
            {
                char c = w.charAt(i);
                sb.append(c);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void freqOfEachEleInArray(int[] a)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e :hm.entrySet())
        {
            System.out.println(e.getKey()+" appears "+e.getValue()+ (e.getValue()==1? " time" : " times"));
        }
        //To print in sorted order of keys
        /*List<Integer> sortedKeys = new ArrayList<>(hm.keySet());
        Collections.sort(sortedKeys);
        for(Integer ele:sortedKeys)
        {
            System.out.println(ele +" appears "+hm.get(ele) + (hm.get(ele)==1? " time": " times"));
        }*/
    }

    public static int findFactorialIterative(int num)
    {
        int i = 1;
        int fact = 1;
        while(i<=num)
        {
            fact = fact*i;
            i++;
        }
        return fact;
    }

    public static int findFactorialRecursively(int num)
    {
        if(num==0 || num==1)
            return 1;
        else
        {
            return num * findFactorialRecursively(num-1);
        }
    }
}
