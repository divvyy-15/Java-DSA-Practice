package com.SDET_Interview_Prep;

import java.util.Arrays;
import java.util.HashSet;

public class Week4_slidingWindowAndOtherMiscPrbs {
    public static void main(String[] args) {
        //Que 1: Find a subarray with given sum, return the indices
        int[] arr1 = {1, 2, 3, 7, 5};
        int targetSum = 12;
        findSubArrWithGivenSum(arr1, targetSum);

        //Que 2: Find the longest substring without repeating characters
        String s1 = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: "+findLongestSubstring(s1));

        //Que 3: Find the contiguous subarray (at least one number) which has the largest sum.
        int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Largest sum of the contiguous sub-array is: "+findContiguousSubArrWithLargestSum(arr2));

        //Que 4: Given prices on different days, find the max profit you can make by buying once and selling once in the future.

        //Que 5: You are given an array of size $n-1$ containing distinct numbers in the range $[1, n]$. Find the one missing number.

        //Que 6: Given a sorted array and a target, return the index if found. If not, return the index where it would be if inserted in order.

        //Que 7: A sorted array was rotated at some pivot (e.g., [4,5,6,7,0,1,2]). Search for a target in $O(\log n)$ time.

        //Que 8: Find the longest common prefix string amongst an array of strings.

        //Que 9: Compress a string by replacing consecutive duplicate characters with the character followed by the count.
    }

    public static void findSubArrWithGivenSum(int[] a,int target)
    {
        //1.Check if input array is null or empty or target is a negative number
        if(a==null || a.length==0 || target<0)
        {
            throw new IllegalArgumentException("Input array is null/empty or the given sum is invalid!");
        }
        //2.Declare a variable that tracks the number that are to be kicked out form the window
        int start = 0;
        //3.Declare another variable that keeps track of the current sum
        int currSum = 0;
        //4.A flag to track if we ever found a match
        boolean found = false;
        //5.Expand the window: by adding current element to the current sum
        for(int i=0;i<a.length;i++)
        {
            currSum = currSum+a[i];
            //4.Shrinking: if the sum is too big, we need to remove element to shrink our window
            while(currSum>target && start<i)
            {
                currSum = currSum - a[start];
                start++;
            }
            //6.Check: if we found our desired window with required sum
            if(currSum==target)
            {
                found = true;
                System.out.println("Indices of the sub-array with given sum are: "+start+ " and " +i);
                return; //if not added, will return all the possible subarrays: 1 and 3, 3 and 4
            }
        }
        if(!found)
        {
            System.out.println("No sub-array with given sum was found!");
        }
    }

    public static int findLongestSubstring(String s) {
        //1.First check if input string is null or empty
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Input String is null/empty!");
        }
        //2.Initialize the left boundary variable of the window: start=0
        int start = 0;
        //3.Declare a maxLength variable to track the length of the substring
        int maxLength = 0;
        //4.Also declare a hashset that will store our characters
        HashSet<Character> hs = new HashSet<>();
        //5.Run a for loop, counter of which will act as the right boundary of the window,to get a character to look at
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //6.Shrink the window: inside the for loop itself, we check if the character for loop just showed us is inside the hashset,
            // if yes remove this character from the hashset and increment start
            while (hs.contains(c)) {
                hs.remove(c);
                start++;
            }
            //7.Expand the window: if no, add the character in the hashset
            hs.add(c);
            //8.We update maxLength as whichever is max between maxlength and difference of length in the window(i,start)+1
            // --> +1 to get the actual count of characters cuz indices+1 will give us actual count
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static int findContiguousSubArrWithLargestSum(int[] a)
    {
        
    }
}
