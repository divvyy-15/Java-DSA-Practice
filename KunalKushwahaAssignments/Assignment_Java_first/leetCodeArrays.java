package com.practice;

import java.util.Arrays;

public class leetCodeArrays {

    public static void main(String[] args) {
//1.Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
        int[] nums = {1,2,3,4}; //[1,3,6,10]
        System.out.println("Running sum of the array: "+Arrays.toString(runningSum(nums)));

//2.Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
        int[] nums1 = {2,5,1,3,4,7}; //[2,3,5,4,1,7]
        System.out.println("Resultant array: "+Arrays.toString(shuffleArray(nums1,3)));

//3.Given a zero-based permutation nums (0-indexed),build an array ans of the same length
// where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive)
        int[] nums2 = {0,2,1,5,3,4}; //[0,1,2,4,5,3]
        System.out.println("Resultant array: "+Arrays.toString(buildArray(nums2)));

//4.Given an integer array nums of length n, you want to create an array ans of length 2n where
// ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays.
//Return the array ans.
    }

    public static int[] runningSum(int[] a)
    {
        int[] result = new int[a.length];
        result[0] = a[0];
        for(int i=1;i<a.length;i++)
        {
            result[i] = result[i-1]+a[i];
        }
        return result;
    }

    public static int[] shuffleArray(int[] a,int  n)
    {
        int[] result = new int[a.length];
        int left = 0;
        int right = n;
        int index = 0;
        while(left<n)
        {
            result[index] = a[left];
            index++;
            left++;
            result[index] = a[right];
            index++;
            right++;
        }
        return result;
    }

    public static int[] buildArray(int[] a)
    {
        int[] result = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            result[i] = a[a[i]];
        }
        return result;
    }
}
