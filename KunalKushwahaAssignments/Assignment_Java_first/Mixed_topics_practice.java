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

//33.Find factorial of a number using recursive approach
        System.out.println("Factorial of the number is: "+findFactorialRecursively(5));

//34.Find the missing number from 1 to N in an unsorted array
        int[] a21 = {1, 2, 4, 5, 6};
        System.out.println("Missing number in the series is: "+findMissingNum(a21,6));

//35.Compress string by showing character + count
//If compressed string is NOT shorter than original, return original
        String s13 = "aabcccccaaa";
        System.out.println("After compression: "+compressString(s13));

//36.Merge two sorted arrays into one sorted array. Both input arrays are already sorted
        int[] a22 = {1, 5, 9};
        int[] a23 = {2, 3, 10, 11};
        System.out.println("After merging: "+Arrays.toString(mergeTwoSortedArrays(a22,a23)));

//37.Remove all special characters, keep only letters and digits
        String s14 = "Hello@World!123"; //Java#Programming$2024
        System.out.println("After removing special characters: "+removeSplChars(s14));

//38.Find intersection of two arrays (common elements). Result should contain unique elements only
        int[] a24 = {1, 2, 2, 1};
        int[] a25 = {2, 2};
        System.out.println("Common elements in the arrays are: "+Arrays.toString(findIntersectionOfArrays(a24,a25)));

//39.Find GCD of two numbers using Euclidean Algorithm [iteratively and recursively]
        System.out.println("The Greatest common divisor for the given two numbers is: "+findGCDIter(48,18));
        System.out.println("The Greatest common divisor for the given two numbers is: "+findGCDRecur(100,50));

//40.Check if array is sorted in ascending order
        int[] a26 = {1, 2, 3, 4, 5};
        System.out.println("The given array is sorted in ascending order: "+isArrayAscSorted(a26));

//41.Count words handling multiple/leading/trailing spaces
        String s15 = "  Java   Programming  "; //"Hello World"
        System.out.println("Total number of words in the string is: "+countWordsInString(s15));

//42.Calculate LCM using GCD
        System.out.println("Least common multiple of the two given numbers is: "+findLCM(12,18));

//43.Find ALL pairs in array whose sum equals target. Print all pairs, not just first one
        int[] a27 = {2, 4, 3, 6, 8};//{1, 5, 7, -1, 5};
        int target1 = 7; //6;
        findAllPairsWithSum(a27,target1);

//44.Check if second string is a rotation of first string
        String s16 = "waterbottle";
        String s17 = "erbottlewat";
        System.out.println("Second string is a rotation of first string: "+isStringRotation(s16,s17));

//45.Sort a HashMap by its values in ascending order
        HashMap<Character,Integer> m1 = new HashMap<>();
        m1.put('a',5);
        m1.put('b',2);
        m1.put('c',8);
        m1.put('d',1);
        sortMapinAscByValues(m1);

//46.Array has N+1 numbers in range [1, N]. One number is duplicated, find it.
        int[] a28 = {1, 3, 4, 2, 2};
        System.out.println("The duplicate in the array is: "+findDuplicateInArray(a28));
        System.out.println("The duplicate in the array is: "+findDuplicateInArrayMath(a28));

//47.String decompression - Expand each character by its count
//Note: This assumes single-digit counts only
        String s18 = "a3b2c1";
        System.out.println("Decompressed string: "+decompressString(s18));

//48.Sort HashMap by keys alphabetically
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("cherry",2);
        hm.put("apple",3);
        hm.put("banana",1);
        System.out.println("After sorting: "+sortMapbyKeys(hm));

//49.Check Armstrong number for N digits [generalization]
        int num1 = 1634;
        System.out.println("Is the given number Armstrong: "+isArmstrongGen(num1));

//50.Find leaders in the array. Element is a LEADER if it is greater than ALL elements to its RIGHT
//Note: Last element is ALWAYS a leader!        
        int[] a29 = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders in the array are: "+leadersInArray(a29));

//51.Split string into 3 categories and find count of letters,numbers,special characters
        String s19 = "priyanka123@#";
        categoriseString(s19);

//52.Remove duplicates WITHOUT using HashSet
        int[] a30 = {1, 2, 3, 2, 4, 1, 5};
        System.out.println("After removing duplicates: "+removeDuplicatesWithoutSet(a30));

//53.Write recursive Function for Fibonacci series upto given terms
        int num2 = 10;
        //fibonacciRecursive(num2);

//54.Rearrange array so all odd numbers come first, then all even numbers.
//Maintain relative order within odd and even groups
        int[] a31 = {1, 2, 7, 8, 4, 10, 5, 3};
        System.out.println("After rearranging: "+Arrays.toString(oddFirstEvenLast(a31)));

//55.Count words MANUALLY without using split()
        String s20 = " Java  Programming ";  //"Good morning friends";
        System.out.println("Total number of words: "+countWordsInStringManually(s20));

//56.Find all words that appear more than once
        String s21 = "java is great and java is fun";
        System.out.println("Words appearing more than once: "+wordOccurringMoreThanOnceInString(s21));

//57.Sort array using Bubble Sort algorithm
        int[] a32 = {5, 3, 8, 1, 2};
        System.out.println("Sorted array: "+Arrays.toString(bubbleSort(a32)));

//58.Check if two arrays are exactly equal
        int[] a33 = {1,2,3};
        int[] a34 = {1,2,3};
        System.out.println("Are both the Arrays equal? "+checkArraysEquality(a33,a34));

//59.Extract all numbers from string and sum them. Numbers can be multi-digit!
        String s22 = "abc123def45";
        System.out.println("The sum of numbers in String is: "+extractAndSumNumsInString(s22));

//60.Sort string array alphabetically using Bubble Sort
        String[] a35 = {"banana", "apple", "cherry", "date"};
        System.out.println("After alphabetic sorting: "+Arrays.toString(bubbleSortOnStringArray(a35)));

//61.Task: Print this pattern:
//
//*
//**
//***
//****
//****
//***
//**
//*
//
//Input: n = 4 (max stars per row)

//62.Simply merge two arrays into one. NOT sorted merge - just concatenate.
        int[] a36 = {1,2,3};
        int[] a37 = {4,5,6};
        System.out.println("After merging: "+Arrays.toString(mergeTwoUnsortedArrays(a36,a37)));

//63.Find ALL missing numbers in range. Range is from min to max of array
        int[] a38 = {1, 2, 4, 5, 7};
        System.out.println("Missing numbers in the range are: "+findMissingNumFromArray(a38));

//64.Print characters at even indices
        String s23 = "automation";
        System.out.println("Even indexed characters in the string are: "+printEvenIndexedStringChar(s23));

//65.Reverse words in a sentence
        String s24 = "I have a class today";
        System.out.println("After reversing: "+reverseWordsInSentence(s24));

//66.Remove duplicate characters, keep first occurence
        String s25 = "programming";
        System.out.println("After removing duplicates: "+removeDuplicateChars(s25));

//67.Manually replace all occurrences of a specific character with another one
        String s26 = "hello";
        System.out.println("After replacement: "+replaceChars(s26,'l','x'));

//68.Separate lowercase, uppercase, digits. Sort each group, concatenate
        String s27 = "aBcA1bC2";
        System.out.println("After sorting: "+sortStringByGroups(s27));

//69.Calculate count of numbers in the string
        String s28 = "12abc34xyz5";
        System.out.println("Total number in the string: "+countNumericBlocks(s28));

//70.String decompression - Parse multi-digit numbers
        String s29 = "a12b3";
        System.out.println("After decompression: "+decompressStringForMultiDigitNums(s29));

//71.Find the longest common prefix
        String[] a39 = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix is: "+longestCommonPrefix(a39));

//72.Reverse specific words in a sentence
        String s30 = "I have a class today";
        System.out.println("After reversing specific words: "+reverseSpecificWords(s30,3));

//73.Reverse first & last word in the string
        String s31 = "writing java code";
        System.out.println("First and last word reversed: "+reverseFirstAndLastWords(s31));

//74.Given an array, a first index, and a second index, swap the values sitting at those two positions.
        int[] a40 = {10, 20, 30, 40, 50};
        swapArrayElements(a40,1,4);

//75.Switch the values of two string variables without creating a third variable
        String s32 = "Hello";
        String s33 = "World";
        swapTwoString(s32,s33);

//76.The full reflection: Take a string of words and append the same words in reverse order to the end
        String s34 = "welcome world";
        System.out.println("After reflection: "+printFullReflectedString(s34));

//77.The last word echo: Take a string of words and repeat the very last word one extra time
        System.out.println("Last word echoed: "+printLastWordEchoed(s34));

//78.Find common elements in two arrays
        int[] a41 = {1,2,3,4};
        int[] a42 = {3,4,5,6};
        System.out.println("Common elements in both arrays: "+findCommonEleInTwoArrays(a41,a42));

//79.Write a function that takes an integer array and returns a list of all elements that have a frequency of exactly 1
        int[] a43 = {1,2,3,2,4,1};
        System.out.println("Unique elements in the array: "+printUniqueArray(a43));

//80.Count the occurrence of a character in the given string
        String s35 = "java programming";
        System.out.println("Occurrence of the character: "+findOccOfCharInString(s35,'a'));
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

    public static int findMissingNum(int[] a,int n)
    {
        int expSum = (n * (n+1))/2;
        int actualSum = 0;
        for(int i:a)
        {
            actualSum = actualSum+i;
        }
        return expSum - actualSum;
    }

    public static String compressString(String s)
    {
        StringBuilder result = new StringBuilder();
        int charCount = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                charCount++;
            }
            else
            {
                result.append(s.charAt(i-1)).append(charCount);
                charCount = 1;  //reset count for new char streak
            }
        }
        //for the last character
        result.append(s.charAt(s.length()-1)).append(charCount);

        //length check: return the compressed string only if it is lesser than the original
        return result.length()<s.length()?result.toString():s;
    }

    public static int[] mergeTwoSortedArrays(int[] a,int[] b)
    {
        int[] merged = new int[a.length+b.length];
        int pos=0;
        int aPos=0;
        int bPos=0;
        while(aPos<a.length && bPos<b.length)
        {
            if(a[aPos]<b[bPos])
            {
                merged[pos] = a[aPos];
                pos++;
                aPos++;
            }
            else {
                merged[pos] = b[bPos];
                pos++;
                bPos++;
            }
        }
        while(bPos<b.length)
        {
            merged[pos]=b[bPos];
            pos++;
            bPos++;
        }
        while(aPos<a.length)
        {
            merged[pos]=a[aPos];
            pos++;
            aPos++;
        }
        return merged;
    }

    public static String removeSplChars(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int[] findIntersectionOfArrays(int[] a, int[] b)
    {
        HashSet<Integer> interim = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            interim.add(a[i]);
        }
        for(int j=0;j<b.length;j++)
        {
            if(interim.contains(b[j]))
            {
                result.add(b[j]);
            }
        }
        //creating resultant int[] from hashset
        int[] resultant = new int[result.size()];
        int k = 0;
        for(int num:result)
        {
            resultant[k] = num;
            k++;
        }
        return resultant;
    }

    public static int findGCDIter(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static int findGCDRecur(int a,int b)
    {
        if(b==0)
            return a;
        else
        {
            return findGCDRecur(b,a%b);
        }
    }

    public static boolean isArrayAscSorted(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<a[i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static int countWordsInString(String s)
    {
        if(s==null || s.trim().isEmpty())
            return 0;
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static int findLCM(int a,int b)
    {
        int gcd = findGCDRecur(a,b);
        return (a/gcd)*b;
    }

    public static void findAllPairsWithSum(int[] a,int t)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int j : a) {
            int complement = t - j;
            if (set.contains(complement)) {
                System.out.println("(" + j + "," + complement + ")");
            }
            set.add(j);
        }
    }

    public static boolean isStringRotation(String a,String b)
    {
        if(a.length()==b.length())
        {
            return (a+a).contains(b);
        }
        return false;
    }

    /*public static boolean isStringRotationManual(String a,String b)
    {

    }*/

    public static void sortMapinAscByValues(HashMap<Character,Integer> m)
    {
        List<Map.Entry<Character,Integer>> entries = new ArrayList<>(m.entrySet());
        entries.sort((e1,e2) -> e1.getValue().compareTo(e2.getValue()));
        for(Map.Entry<Character,Integer> e:entries)
        {
            System.out.println(e.getKey() + " = "+ e.getValue());
        }
    }

    public static int findDuplicateInArray(int[] a)
    {
        HashSet<Integer> s = new HashSet<>();
        for(int n:a)
        {
            if(s.contains(n))
            {
               return n;
            }
            s.add(n);
        }
        return -1;
    }

    public static int findDuplicateInArrayMath(int[] a)
    {
        int sum = 0;
        int nums = a.length - 1;
        for(int n:a)
        {
            sum = sum+n;
        }
        int expSum = (nums*(nums+1))/2;
        return sum - expSum;
    }

    public static String decompressString(String s)
    {
        if(s.length()%2 != 0)
            return "Invalid Input";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=2)
        {
            char c = s.charAt(i);
            int digit = s.charAt(i+1) - '0';
            while(digit!=0)
            {
                sb.append(c);
                digit--;
            }
        }
        return sb.toString();
    }

    public static TreeMap<String, Integer> sortMapbyKeys(HashMap<String,Integer> h)
    {
        TreeMap<String,Integer> sorted = new TreeMap<>(h);
        return sorted;
    }

    public static boolean isArmstrongGen(int n)
    {
        int pow = String.valueOf(n).length();
        int temp = n;
        double sum = 0;

        while(n>0)
        {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem,pow);
            n = n/10;
        }
        return temp == sum;
    }
    
    public static List<Integer> leadersInArray(int[] a)
    {
        if(a ==null || a.length==0)
            return new ArrayList<>(); //return empty list
        List<Integer> result = new ArrayList<>();
        int maxFromRight = a.length - 1;
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]>maxFromRight)
            {
                maxFromRight = a[i];
                result.add(a[i]);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void categoriseString(String s)
    {
        StringBuilder letters = new StringBuilder();
        StringBuilder splChars = new StringBuilder();
        StringBuilder nums = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='0' && c<='9')
            {
                nums.append(c);
            }
            else if(c>='a' && c<='z' || c>='A' && c<='Z')
            {
                letters.append(c);
            }
            else
            {
                splChars.append(c);
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("Numbers: "+nums);
        System.out.println("Special: "+splChars);
    }

    public static List<Integer> removeDuplicatesWithoutSet(int[] a)
    {
        Arrays.sort(a);
        List<Integer> nonDupes = new ArrayList<>();
        nonDupes.add(a[0]);
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                nonDupes.add(a[i]);
            }
        }
        return nonDupes;
    }

    public static int[] oddFirstEvenLast(int[] a)
    {
        //{1, 2, 7, 8, 4, 10, 5, 3} --> [1, 7, 5, 3, 2, 8, 4, 10]
        List<Integer> oddGroup = new ArrayList<>();
        List<Integer> evenGroup = new ArrayList<>();

        for(int num:a)
        {
            if(num%2==0)
            {
                evenGroup.add(num);
            }
            else {
                oddGroup.add(num);
            }
        }
        oddGroup.addAll(evenGroup);
        //return oddGroup;   --if asked to return an array of int
        int[] result = new int[oddGroup.size()];
        for(int i=0;i< oddGroup.size();i++)
        {
            result[i] = oddGroup.get(i);
        }
        return result;
    }

    public static int countWordsInStringManually(String s)
    {
        boolean isWord = false;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!=' ')
            {
                if(!isWord)
                {
                    isWord = true;
                    count++;
                }
            }
            else {
                isWord = false;
            }
        }
        return count;
    }

    public static List<String> wordOccurringMoreThanOnceInString(String s)
    {
        if(s==null || s.trim().isEmpty())
            return new ArrayList<>();
        HashMap<String,Integer> countFreq = new HashMap<>();
        List<String> duplicateWords = new ArrayList<>();
        for(String word:s.trim().split("\\s+"))
        {
            countFreq.put(word,countFreq.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> m:countFreq.entrySet())
        {
            if(m.getValue()>1)
            {
                duplicateWords.add(m.getKey());
            }
        }
        return duplicateWords;
    }

    public static int[] bubbleSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static boolean checkArraysEquality(int[] a,int[] b)
    {
        if(a.length != b.length)
        {
            return false;
        }
        else {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static int extractAndSumNumsInString(String s)
    {
        int sum = 0;
        int currentNum = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='0' && c<='9')
            {
                currentNum = currentNum*10 + (c - '0');
            }
            else {
                sum = sum + currentNum;
                currentNum = 0;
            }
        }
        sum = sum + currentNum;
        return sum;
    }

    public static String[] bubbleSortOnStringArray(String[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] mergeTwoUnsortedArrays(int[] a,int[] b)
    {
        int[] result = new int[a.length+b.length];
        int writePos = 0;
        for(int num:a)
        {
            result[writePos] = num;
            writePos++;
        }
        for(int num:b)
        {
            result[writePos] = num;
            writePos++;
        }
        return result;
    }

    public static String printEvenIndexedStringChar(String s)
    {
        StringBuilder sb = new StringBuilder();
        /*for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                sb.append(s.charAt(i));
            }
        }*/
        //or take even leap steps:
        for(int i=0;i<s.length();i+=2)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static List<Integer> findMissingNumFromArray(int[] a)
    {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> allNums = new HashSet<>();
        for(int num:a)
        {
            allNums.add(num);
            if(num>maxNum) maxNum = num;
            if(num<minNum) minNum = num;
        }
        for(int i=minNum;i<=maxNum;i++)
        {
            if(!allNums.contains(i))
            {
                result.add(i);
            }
        }
        return result;
    }

    public static String reverseWordsInSentence(String s)
    {
        if(s.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static String removeDuplicateChars(String s)
    {
        StringBuilder sb = new StringBuilder();
        char[] alphas = s.toCharArray();
        int[] freqCount = new int[26];
        for(int i=0;i<alphas.length;i++)
        {
            char c = alphas[i];
            int ind = c - 'a';
            if(freqCount[ind]==0)
            {
                sb.append(c);
                freqCount[ind]++;
            }
        }
        return sb.toString();
    }

    public static String replaceChars(String s,char oldChar,char newChar)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=oldChar)
            {
                sb.append(s.charAt(i));
            }
            else {
                sb.append(newChar);
            }
        }
        return sb.toString();
    }

    public static String sortStringByGroups(String s)
    {
        List<Character> lowerCase = new ArrayList<>();
        List<Character> upperCase = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c<='z')
            {
                lowerCase.add(c);
            }
            else if(c>='A' && c<='Z')
            {
                upperCase.add(c);
            }
            else if(c>='0' && c<='9')
            {
                digits.add(c);
            }
        }
        Collections.sort(lowerCase);
        Collections.sort(upperCase);
        Collections.sort(digits);
        //concatenate: lower+upper+digits
        for(Character c:lowerCase)
        {
            sb.append(c);
        }
        for(Character c:upperCase)
        {
            sb.append(c);
        }
        for(Character c:digits)
        {
            sb.append(c);
        }
        return sb.toString();
    }

    public static int countNumericBlocks(String s)
    {
        boolean inNum = false;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                if(!inNum)
                {
                    inNum = true;
                    count++;
                }
            }
            else {
                inNum = false;
            }
        }
        return count;
    }

    public static String decompressStringForMultiDigitNums(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char lastChar = s.charAt(i);
            if(lastChar>='a' && lastChar<='z')
            {
                StringBuilder numStr = new StringBuilder();
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1)))
                {
                    numStr.append(s.charAt(i+1));
                    i++;
                }
                int digit = Integer.parseInt(numStr.toString());
                for(int j=0;j<digit;j++)
                {
                    sb.append(lastChar);
                }
            }
        }
        return sb.toString();
    }

    public static String longestCommonPrefix(String[] a)
    {
        String ref = a[0];
        for(int i=0;i<ref.length();i++)
        {
            char c = ref.charAt(i);
            for(int j=1;j<a.length;j++)
            {
                // If the word is too short OR the character doesn't match...
                if(a[j].length()==i || a[j].charAt(i)!=c)
                {
                    return ref.substring(0,i);
                }
            }
        }
        return ref;
    }

    public static String reverseStr(String s)
    {
        StringBuilder reversed = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            reversed.append(c);
        }
        return reversed.toString();
    }

    public static String reverseSpecificWords(String s,int index)
    {
        String[] words = s.split("\\s+");
        String rev = reverseStr(words[index]);
        words[index] = rev;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            result.append(words[i]);
            if(i<words.length-1)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String reverseFirstAndLastWords(String s)
    {
        StringBuilder result = new StringBuilder();
        String[] words = s.split("\\s+");
        if(words.length==1)
            return reverseStr(words[0]);

        String firstRev = reverseStr(words[0]);
        String lastRev = reverseStr(words[words.length-1]);
        words[0] = firstRev;
        words[words.length-1] = lastRev;
        for(int i=0;i<words.length;i++)
        {
            result.append(words[i]);
            if(i<words.length-1)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void swapArrayElements(int[] a,int c,int d)
    {
        int temp = a[c];
        a[c] = a[d];
        a[d] = temp;
        System.out.println("After swapping: "+Arrays.toString(a));
    }

    public static void swapTwoString(String s1,String s2)
    {
        System.out.println("Initially first string is: "+s1);
        System.out.println("Initially second string is: "+s2);
        int firstLen = s1.length();
        s1 = s1+s2;
        s2 = s1.substring(0,firstLen);
        s1 = s1.substring(firstLen);
        System.out.println("After swap first string is: "+s1);
        System.out.println("After swap second string is: "+s2);
    }

    public static String printFullReflectedString(String s)
    {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w:words)
        {
            sb.append(w).append(" ");
        }
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            if(i>0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String printLastWordEchoed(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split("\\s+");
        for(int i=0;i<words.length;i++)
        {
            sb.append(words[i]);
            if(i<words.length-1)
            {
                sb.append(" ");
            }
        }
        sb.append(" ").append(words[words.length-1]);
        return sb.toString();
    }

    public static List<Integer> findCommonEleInTwoArrays(int[] a,int[] b)
    {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int num:a)
        {
            hs.add(num);
        }
        for(int i=0;i<b.length;i++)
        {
            if(hs.contains(b[i]) && !result.contains(b[i]))
            {
                result.add(b[i]);
            }
        }
        return result;
    }

    public static List<Integer> printUniqueArray(int[] a)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int num:a)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                result.add(m.getKey());
            }
        }
        return result;
    }

    public static int findOccOfCharInString(String s,char c)
    {
        int count = 0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==c)
            {
                count++;
            }
        }

        return count;
    }
}
