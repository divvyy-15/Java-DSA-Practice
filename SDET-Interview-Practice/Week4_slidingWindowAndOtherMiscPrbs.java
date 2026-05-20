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
        int[] arr3 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit that can be made by buying and selling once is: "+profitAfterSellingStocks(arr3));
        //Que 5: You are given an array of size n-1 containing distinct numbers in the range [1, n]. Find the one missing number.
        int[] arr4 = {1, 2, 4, 6, 3, 7};
        System.out.println("The missing number is: "+findMissingNumber(arr4,7));
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
        //1)Check if array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is null or empty!");
        }
        //2)Initialize a variable currentSum to track the running total=arr[0]
        int currentSum = a[0];
        //3)Then initialize another variable maxSoFar to track what is the highest sum we have gotten so far=arr[0]
        int maxSoFar = a[0];
        //4)Start a for loop from 1 upto length of the array
        for(int i=1;i<a.length;i++)
        {
            //5)Check if currentSum is a negative number, if so reset it
            if(currentSum<0)
            {
                currentSum=0;
            }
            //6.Now add current element to currSUm and compare it with maxSoFar --> if it's bigger update maxSoFar
            currentSum = currentSum + a[i];
            if(currentSum>maxSoFar)
            {
                maxSoFar = currentSum;
            }
        }
        //7)At the end we need to return the maxSoFar i.e. the maximum we could get from the given array that was contiguous
        return maxSoFar;
    }

    public static int profitAfterSellingStocks(int[] a)
    {
        //1)Check if the array of prices is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is null or empty!");
        }
        //2)initialize a variable currCostPrice to a[0], to keep track of the minimum price to maximize profit we have got so far
        int currCostPrice = a[0];
        //3)Initialize a variable maxProfit to 0, that tracks the profit we will make
        int maxProfit = 0;
        //4)start a for loop from 1 upto the array length
        for(int i=1;i<a.length;i++)
        {
            //5.Initialize another variable that will track current profit
            int currProfit = 0;
            //6)check if a[i]<currCostPrice, then reset currCostPrice to a[i]
            if(a[i]<currCostPrice)
            {
                currCostPrice = a[i];
            }
            //7)if a[i]>currCostPrice, then calculate profit for current iteration
            else {
                currProfit = a[i] - currCostPrice;
            }
            //8)if it is greater than maxProfit, update maxProfit
            if(currProfit>maxProfit)
            {
                maxProfit = currProfit;
            }
        }
        //9)Finally return the maxProfit
        return maxProfit;
    }

    public static int findMissingNumber(int[] a,int n)
    {
        //1)Check if the array is null or empty
        if(a==null || a.length==0)
        {
            throw new IllegalArgumentException("Input array is null or empty!");
        }
        //2)We initialize an expSum variable that will be the mathematical formula of first n natural numbers i.e. n(n+1)/2
        int expSum = (n*(n+1))/2;
        //3)Also initialize a variable actualSum to 0
        int actualSum = 0;
        //4)Start a for loop on the array from 0 upto array length
        for(int i=0;i<a.length;i++)
        {
            //5)Add all the numbers to actualSum
            actualSum = actualSum + a[i];
        }
        //6)return the difference between expSum and actualSum
        return expSum - actualSum;
    }
}
