package com.practice;

import java.util.Arrays;

public class Assignment_05_Arrays {

    public static void main(String[] args) {
//1. Given an array, write a function that swaps any two indices in the array
        int[] arr = {1,3,25,9,18};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));

//2. Print the maximum element from the array
        //int[] arr = {1,3,25,9,18};
        //System.out.println(maxEle(arr));

//3. Print the maximum element in the range of indices passed, from the array
        int[] arr1 = {1,3,5,7,10,15,33,66};
        System.out.println(maxInRange(arr1,2,6));

//4. Reverse the array
        int[] arr2 = {1,3,23,9,18,56};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr2));

//5. Given a zero-based permutation nums (0-indexed), build an array ans of the same length
// where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
//Example:

    /*Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows:
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
            = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
            = [0,1,2,4,5,3]*/
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));

//6. Given an integer array nums of length n, you want to create an array ans of length 2n where
// ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays. Return the array ans.
//Example:
/* Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
int[] nums = {1,3,2,1};*/
        int[] nums1 = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums1)));

//7. Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
//Example:
/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
        int[] nums2 = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums2)));
    }

    public static void swap(int[] a,int index1,int index2)
    {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static int maxEle(int[] a)
    {
        //edge cases
        if(a==null)
        {
            return -1;
        }
        if(a.length==0)
        {
            return -1;
        }
        int maxEle = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>maxEle)
            {
                maxEle = a[i];
            }
        }
        return maxEle;
    }

    public static int maxInRange(int[] a,int start,int end)
    {
        int maxEle = a[start];
        //edge cases:
        if(end>start)
        {
            return -1;
        }

        if(a==null)
        {
            return -1;
        }
        if(a.length==0)
        {
            return -1;
        }
        for(int i=start;i<=end;i++)
        {
            if(a[i]>maxEle)
            {
                maxEle = a[i];
            }
        }
        return maxEle;
    }

    public static void reverseArray(int[] a)
    {
        //using two pointers method(start,end)
        int start = 0;
        int end = a.length-1;
        while (start<end)
        {
            swap(a,start,end);
            start++;
            end--;
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i=1;i<=nums.length-1;i++)
        {
            runningSum[i] = runningSum[i-1]+nums[i];
        }
        return runningSum;
    }



}


