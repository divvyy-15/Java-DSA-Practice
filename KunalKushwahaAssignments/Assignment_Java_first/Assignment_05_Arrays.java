package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_05_Arrays {

    public static void main(String[] args) {
//1. Given an array, write a function that swaps any two indices in the array
        int[] arr = {1,3,25,9,18};
        swap(arr,1,4);
        //System.out.println(Arrays.toString(arr));

//2. Print the maximum element from the array
        //int[] arr = {1,3,25,9,18};
        //System.out.println(maxEle(arr));

//3. Print the maximum element in the range of indices passed, from the array
        int[] arr1 = {1,3,5,7,10,15,33,66};
        //System.out.println(maxInRange(arr1,2,6));

//4. Reverse the array
        int[] arr2 = {1,3,23,9,18,56};
        reverseArray(arr2);
        //System.out.println(Arrays.toString(arr2));

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
        //System.out.println(Arrays.toString(buildArray(nums)));

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
        //System.out.println(Arrays.toString(getConcatenation(nums1)));

//7. Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
//Example:
/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
        int[] nums2 = {1,1,1,1,1};
        //System.out.println(Arrays.toString(runningSum(nums2))); //used when req is to print an array

//8. You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith
// customer has in the jth bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts.
// The richest customer is the customer that has the maximum wealth.
//Example:
/*Input: accounts = [[1,5],[7,3],[3,5]]
        Output: 10
        Explanation:
        1st customer has wealth = 1 + 5 = 6
        2nd customer has wealth = 7 + 3 = 10
        3rd customer has wealth = 3 + 5 = 8
        The 2nd customer is the richest man with a wealth of 10, so return 10.*/
        int[][] nums3 = {{2,8,7},{7,1,3},{1,9,5}};
        //System.out.println(maximumWealth(nums3));

//9. Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//Example:
        /*Input: nums = [2,5,1,3,4,7], n = 3
        Output: [2,3,5,4,1,7]
        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/
        int[] nums4 = {2,5,1,3,4,7};
        //System.out.println(Arrays.toString(shuffle(nums4,3)));

//10. There are n kids with candies. You are given an integer array candies, where each candies[i]
// represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of
// extra candies that you have.Return a boolean array result of length n, where result[i] is true if,
// after giving the ith kid all the extraCandies, they will have the greatest number of candies among all
// the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.
//Example:
        /*Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]
        Explanation: If you give all extraCandies to:
        - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
        - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
        - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
        - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        Example 2:
        Input: candies = [4,2,1,1,2], extraCandies = 1
        Output: [true,false,false,false,false]
        Explanation: There is only 1 extra candy.
        Kid 1 will always have the greatest number of candies, even if a different kid is given the
        extra candy.*/
        int[] candies = {2,3,5,1,3};
        //System.out.println(kidsWithCandies(candies,3));
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

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++) //0,1
        {
            int currentWealth = 0;
            for(int j=0;j<accounts[i].length;j++) //0,1,2
            {
                currentWealth = currentWealth + accounts[i][j];
            }
            if(currentWealth>maxWealth)
            {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }

    public static int[] shuffle(int[] nums,int n)
    {
        int[] result = new int[nums.length];
        for(int i=0;i<n;i++)
        {
            int sourcex = nums[i];
            int sourcey = nums[i+n];
            int destx = 2*i;  //two steps apart because we are placing two elements (xi and yi) in every iteration
            int desty = 2*i+1;
            result[destx] = sourcex;
            result[desty] = sourcey;
        }
        return result;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int maxCandies = 0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>maxCandies)
            {
                maxCandies = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=maxCandies)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
        }
        return res;
    }
}


