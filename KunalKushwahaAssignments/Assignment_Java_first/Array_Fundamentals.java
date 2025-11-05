package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Fundamentals {

    public static void main(String[] args) {
//Create array of 10 numbers and print all elements
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr1);

//Take array input from user (using Scanner)
        takeArrayInpFromUserAndPrint(4);

//Print array in reverse order
        printInRevOrder(arr1);

//Find max and min element in array
        int[] arr3 = {2,33,66,6,15};
        System.out.println("The max element in the array is: "+findMaxInArray(arr3));
        System.out.println("The min element in the array is: "+findMinInArray(arr3));

//Calculate sum and average of array elements
        findSumAndAvgOfEleInArray(arr3);
    }

    public static void printArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void takeArrayInpFromUserAndPrint(int size)
    {
        int[] arr = new int[size];
        Scanner inp = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++)
        {
            System.out.println("Enter a number for the array: ");
            arr[i] = inp.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printInRevOrder(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static int findMaxInArray(int[] a)
    {
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>maxVal)
            {
                maxVal = a[i];
            }
        }
        return maxVal;
    }

    public static int findMinInArray(int[] a)
    {
        int minVal = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<minVal)
            {
                minVal = a[i];
            }
        }
        return minVal;
    }

    public static void findSumAndAvgOfEleInArray(int[] a)
    {
        int sum = 0;
        double avg = 0.0;
        for(int i=0;i< a.length;i++)
        {
            sum = sum + a[i];
        }
        avg = (double) sum/a.length;
        System.out.println("Sum of all the elements in the array: "+sum);
        System.out.println("Average of all the elements in the array: "+avg);
    }
}
