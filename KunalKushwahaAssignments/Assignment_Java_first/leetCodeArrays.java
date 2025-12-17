package com.practice;

import java.util.Arrays;
import java.util.HashMap;

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
        int[] nums3 = {1,2,1}; //[1,2,1,1,2,1]
        System.out.println("Resultant array: "+Arrays.toString(getConcatenation(nums3)));

//5.You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer
// has in the jth bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Maximum wealth is: "+maximumWealth(accounts));

//6.There are n kids with candies. You are given an integer array candies, where each candies[i] represents
// the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies
// that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the
// extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.
        int[] candies = {2,3,5,1,3};
        int extraCandies  = 3;
        System.out.println("Result: "+Arrays.toString(kidsWithCandies(candies,extraCandies)));

//7.Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
        int[] nums4 = {1,2,3,1,1,3};
        System.out.println("Number of good pairs: "+goodPairsCount(nums4));

//8.Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//Return the answer in an array.
        int[] nums5 = {8,1,2,2,3};
        System.out.println("Result: "+Arrays.toString(smallerNumbersThanCurrent(nums5)));

//9.Given an array nums of integers, return how many of them contain an even number of digits.
        int[] nums6 = {12,345,2,6,7896};
        System.out.println("Total numbers with even no. of digits in the array: "+findNumbers(nums6));

//10.Given an array arr of integers, check if there exist two indices i and j such that:
//i != j
//0 <= i, j < arr.length
//arr[i] == 2 * arr[j]
        int[] nums7 = {3,1,7,11};
        System.out.println("There exists a number whose double is also present in the array: "+checkIfExist(nums7));

//11.Given an array of integers nums and an integer target, return indices of the two numbers such that they
// add up to target.You may assume that each input would have exactly one solution, and you may not use the
// same element twice. You can return the answer in any order.
        int[] nums8 = {2,7,11,15};
        System.out.println("Indices are: "+Arrays.toString(twoSum(nums8,9)));

//12.Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
// each unique element appears only once. The relative order of the elements should be kept the same.
//Consider the number of unique elements in nums to be k. After removing duplicates, return the number of
// unique elements k.The first k elements of nums should contain the unique numbers in sorted order.
// The remaining elements beyond index k - 1 can be ignored.
        int[] nums9 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Number uf unique elements are: "+removeDuplicates(nums9));

//13.Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed. Then return the number of elements in nums which are not equal
// to val.Consider the number of elements in nums which are not equal to val be k, to get accepted, you need
// to do the following things:
//A] Change the array nums such that the first k elements of nums contain the elements which are not equal to
// val. The remaining elements of nums are not important as well as the size of nums.
//B] Return k.
        int[] nums10 = {0,1,2,2,3,0,4,2};
        System.out.println("Number of unique elements are: "+removeElement(nums,2));

//14.Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
        int[] nums11 = {1,3,5,6};
        System.out.println("Number is found/can be inserted at: "+searchInsert(nums11,2));

//15.You are given a large integer represented as an integer array digits, where each digits[i] is the ith
// digit of the integer. The digits are ordered from most significant to least significant in left-to-right
// order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
        int[] nums12 = {1,2,3};
        System.out.println("The larger integer becomes: "+Arrays.toString(plusOne(nums12)));

//16.You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
// and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array
// nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements
// that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of
// n.

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

    public static int[] getConcatenation(int[] a)
    {
        int n = a.length;
        int[] result = new int[2*n];
        for(int i=0;i<n;i++)
        {
            result[i] = a[i];
            result[i+n] = a[i];
        }
        return result;
    }

    public static int maximumWealth(int[][] a)
    {
        int m = a.length;
        //int n = a[0].length;
        int[] wealth = new int[m];
        int sum = 0;
        int index = 0;
        for(int i=0;i<a.length;i++)//0,1
        {
            sum=0;
            for(int j=0;j<a[i].length;j++)//0,1,2
            {
                sum = sum + a[i][j];
            }
            wealth[index] = sum;
            index++;
        }
        int max=Integer.MIN_VALUE;
        for(int k=0;k<wealth.length;k++)
        {
            if(wealth[k]>=max)
            {
                max = wealth[k];
            }
        }
        return max;
    }

    public static boolean[] kidsWithCandies(int[] a,int n)
    {
        boolean[] result = new boolean[a.length];
        int max = Integer.MIN_VALUE;
        int[] extraCandiesGiven = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            extraCandiesGiven[i] = a[i]+n;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=max)
            {
                max = a[i];
            }
            if(extraCandiesGiven[i]>=max)
            {
                result[i] = true;
            }
        }
        return result;
    }

    public static int goodPairsCount(int[] a)
    {
        int count = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] smallerNumbersThanCurrent(int[] a)
    {
        int[] result = new int[a.length];
        int index = 0;
        for(int i=0;i<a.length;i++)
        {
            int count = 0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]>a[j] && i!=j)
                {
                    count++;
                }
            }
            result[index] = count;
            index++;
        }
        return result;
    }

    public static int findNumbers(int[] a)
    {
        int count = 0;
        int result = 0;
        for(int i=0;i<a.length;i++)
        {
            count = 0;
            int num = a[i];
            while(num>0)
            {
                int rem = num%10;
                num = num/10;
                count++;
            }
            if(count%2==0)
            {
                result++;
            }
        }
        return result;
    }

    public static boolean checkIfExist(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j]*2 && i!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] twoSum(int[] a,int target)
    {
        int[] result = new int[2];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]+a[j]==target && i!=j)
                {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public static int removeDuplicates(int[] a)
    {
        int writePos = 1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1])
            {
                a[writePos]=a[i];
                writePos++;
            }
        }
        return writePos;
    }

    public static int[] twoSumOptimized(int[] a,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int complement = target - a[i];

            if(map.containsKey(complement))
            {
                return new int[]{map.get(complement),i}; //array is created as:[index_of_complement, current_index_i]
            }
            map.put(a[i],i);//store number,its index
        }
        return null;
    }

    public static int removeElement(int[] a,int val)
    {
        int writePos = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {
                a[writePos]=a[i];
                writePos++;
            }
        }
        return writePos;
    }

    public static int searchInsert(int[] a,int target)
    {
        int left = 0;
        int right = a.length-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            else if(a[mid]<target)
            {
                left = mid+1;
            }
            else if(a[mid]>target)
            {
                right = mid-1;
            }
        }
        return left;
    }

    public static int[] plusOne(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]<9)
            {
                a[i]=a[i]+1;
                return a;
            }
            else
            {
                a[i] = 0;
            }
        }
        int[] result = new int[a.length+1];
        result[0] = 1;
        return result;
    }
}
