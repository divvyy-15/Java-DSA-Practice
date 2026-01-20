package com.practice;

import java.util.*;

public class Mixed_topics_practice {

    public static void main(String[] args) {

//1.Find Max & Min in the given array
        int[] a1 = {3, 5, 1, 8, 2, 9};
        maxMinArray(a1);

//2.Reverse a string
        String s1 = "Heathrow";
        System.out.println("The reversed string is: "+ reverseStringSB(s1));
        System.out.println("The reversed string is: "+reverseStringAlternateApproach(s1));

//3.Find frequency of elements
        int[] a2 = {1, 2, 2, 3, 3, 3, 4};
        System.out.println("Frequency of all elements is: "+findFreq(a2));

//4.Fibonacci series upto n terms
        fiboSeries(7);
        System.out.println();

//5.Count occurences of an element
        int[] a3 = {1, 2, 3, 2, 4, 2, 5};
        int ele = 2;
        System.out.println("Element "+ele+" occurs "+eleOccCount(a3,ele)+ " times in the array");

//6.Count number of words in a Sentence
        String s2 = "I have a class today";
        String s3 = "   Java    programming   ";
        System.out.println("Total number of words in the sentence: "+wordCountInSentence(s2));

//7.First non-repeating element
        int[] a4 = {4, 5, 1, 2, 5, 4, 1};
        int[] a5 = {1, 1, 2, 2, 3, 3};
        System.out.println("First non-repeating element in the array: "+findFirstNonRepeatingEle(a5));

//8.Check whether the given number is prime
        System.out.println("The given number is a prime: "+isPrime(10));

//9.Find smallest number in the array
        int[] a6 = {5, 3, 8, 1, 9, 2};
        int[] a7 = {-5, 0, 3, -2};
        System.out.println("Smallest number in the array is: "+smallestInTheArray(a7));

//10.Check if String Contains Only Digits
        String s4 = "12345";
        String s5 = "123abc";
        System.out.println("String contains only digits? "+hasOnlyDigits(s5));

//11.Find indices of two numbers that add up to target
        int[] a8 = {2,7,11,15};
        System.out.println("The indices of the numbers adding up to the target: "+ Arrays.toString(twoSum(a8,9)));

//12.Reverse digits of an integer
        int num = -12345;
        System.out.println("The number reversed is: "+reverseDigits(num));

//13.Find second largest element in the array
        int[] a9 = {5, 3, 8, 1, 9, 2};
        int[] a10 = {10, 10, 8, 7};
        System.out.println("The second largest element in the array is: "+secLargest(a10));

//14.Character occurrence in a String
        String s6 = "java";
        char target = 'z';
        System.out.println(target+ " appears in "+s6+" "+charOcc(s6,target)+ " times! ");

//15.Remove duplicates in the array
        int[] a11 = {1, 2, 3, 2, 4, 1, 5};
        System.out.println("After removing duplicates: "+Arrays.toString(removeDupes(a11)));

//16.
    }

    public static void maxMinArray(int[] a)
    {
        //empty array check
        if(a.length==0)
        {
            return; //no value would be returned just the func will exit!
        }
        int maxEle = Integer.MIN_VALUE; //instead of setting it to 0 which would give out incorrect results if all the values in thw array are say negative,then result would become 0 which is not even present in the array!!
        int minEle = Integer.MAX_VALUE;
        for(int num:a)
        {
            if(num>maxEle)
            {
                maxEle = num;
            }
            if(num<minEle)
            {
                minEle = num;
            }
        }
        System.out.println("Maximum element in the array: "+maxEle);
        System.out.println("Minimum element in the array: "+minEle);
    }

    public static String reverseStringSB(String s)
    {
        if(s == null || s.isEmpty())
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseStringAlternateApproach(String s)
    {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static HashMap<Integer, Integer> findFreq(int[] a)
    {
        if(a==null)
        {
            return new HashMap<>();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
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
        for(int i:a)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        return hm;
    }

    public static void fiboSeries(int n)   //0,1,1,2,3,5,8
    {
        if(n<=0)
        {
            return;
        }
        int firstTerm = 0;
        if(n==1)
        {
            System.out.println(firstTerm);
            return;
        }
        int secTerm = 1;
        System.out.print(firstTerm+ " , "+secTerm);
        int i=2;
        while(i<n)
        {
            int next = firstTerm+secTerm;
            System.out.print(" , "+next);
            firstTerm = secTerm;
            secTerm = next;
            i++;
        }
    }

    public static int eleOccCount(int[] a,int e)
    {
        //empty array check
        if(a.length==0)
        {
            return 0;
        }
        int count = 0;
        for(int i:a)
        {
            if(i==e)
            {
                count++;
            }
        }
        return count;
    }

    public static int wordCountInSentence(String s)
    {
        //I have a class today
        String[] word = s.split(" ");
        return word.length;
    }

    public static int findFirstNonRepeatingEle(int[] a)
    {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i:a)
        {
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        /*for(Map.Entry<Integer, Integer> entry:freqMap.entrySet()) //to use this,use linkedHashMap to maintain order
        {
            if(entry.getValue()==1)
            {
                return entry.getKey();
            }
        }*/
        for(int i:a)
        {
            if(freqMap.get(i)==1)
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static Integer smallestInTheArray(int[] a)
    {
        if(a==null || a.length==0)
        {
            return null;
        }
        int minEle = Integer.MAX_VALUE;
        for(int i:a)
        {
            if(i<minEle)
            {
                minEle = i;
            }
        }
        return minEle;
    }

    public static boolean hasOnlyDigits(String s)
    {
        if(s==null || s.isEmpty())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c<'0' || c>'9')
            {
                return false;
            }
        }
        return true;
    }

    public static int[] twoSum(int[] a,int target)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int complement = target - a[i];
            if(hm.containsKey(complement))
            {
                return new int[]{hm.get(complement),i};
            }
            hm.put(a[i],i);
        }
        return new int[]{-1,-1};
    }

    public static int reverseDigits(int n)
    {
        int sum = 0; //either make this long type to avoid integer overflow
        while(n!=0)
        {
            int rem = n%10;
            if(sum>Integer.MAX_VALUE/10 ||(sum==Integer.MAX_VALUE/10 && rem>7)) //check for positive overflow
            {
                return 0;
            } else if (sum<Integer.MIN_VALUE/10 || (sum==Integer.MIN_VALUE/10 && rem<-8)) {
                return 0;
            }
            sum = sum*10+rem;
            n = n/10;
        }
        return sum; //return (int) sum;
    }

    public static int secLargest(int[] a)
    {
        if(a.length==1)
            return -1;
        int largest = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int i:a)
        {
            if(i>largest)
            {
                secLar = largest;
                largest = i;
            } else if (i>secLar && i!=largest) {
                secLar = i;
            }
        }
        return (secLar==Integer.MIN_VALUE)?-1:secLar;
    }

    public static int charOcc(String s,char t)
    {
        s = s.toLowerCase();
        t = Character.toLowerCase(t);
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==t) {
                count++;
            }
        }
        return count;
    }

    public static Integer[] removeDupes(int[] a)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:a)
        {
            hs.add(i);
        }
        Integer[] result = new Integer[hs.size()];
        hs.toArray(result);
        return result;
    }
}
