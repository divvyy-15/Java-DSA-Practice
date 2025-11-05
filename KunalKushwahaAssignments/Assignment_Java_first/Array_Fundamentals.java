package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Fundamentals {

    public static void main(String[] args) {
//1. Create array of 10 numbers and print all elements
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr1);

//2. Take array input from user (using Scanner)
        takeArrayInpFromUserAndPrint(4);

//3. Print array in reverse order
        printInRevOrder(arr1);

//4. Find max and min element in array
        int[] arr3 = {2,33,66,6,15};
        System.out.println("The max element in the array is: "+findMaxInArray(arr3));
        System.out.println("The min element in the array is: "+findMinInArray(arr3));

//5. Calculate sum and average of array elements
        findSumAndAvgOfEleInArray(arr3);

//6. Print all even numbers from array
        int[] arr4 = {2,22,13,11,15,66,19,96};
        printEvenNumsFromArray(arr4);

//7. Print all odd numbers
        printOddNumsFromArray(arr4);

//8. Count how many positive vs negative numbers
        int[] arr5 = {-1,15,-15,2,3,-100,56,67,78,-98,-99};
        findCountOfPosNegInArray(arr5);

//9. Find if specific element exists
        int findEle = 5;
        System.out.println(findEle + " exists in the array? "+doesEleExistInArray(arr5,findEle));

//10.Print elements at even indices only
        printEvenIndicesEle(arr5);

//11.Print elements at odd indices only
        printOddIndicesEle(arr5);

//12.Print only numbers greater than 10
        int[] arr6 = {6,2,5,12,13,15,1};
        printNumsGreaterThan(arr6,10);

//13.Find second largest element
        System.out.println("Second largest number in the array is: "+ findSecLargestFromArray(arr6));

//14.Count how many numbers are divisible by 3
        System.out.println("There are "+countNumsDivBy(arr6,3)+ " numbers in the array that are divisible by 3!");

//15.Print all elements except the first and last
        printExcludingPositions(arr6,0,arr6.length-1);

//16.Find the sum of all negative numbers
        System.out.println("Sum of all the negative numbers in the array: "+sumOfNegNums(arr5));

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

    public static void printEvenNumsFromArray(int[] a)
    {
        System.out.print("Even numbers in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void printOddNumsFromArray(int[] a)
    {
        System.out.print("Odd numbers in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void findCountOfPosNegInArray(int[] a)
    {
        int posCount = 0;
        int negCount = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                negCount++;
            }
            else {
                posCount++;
            }
        }
        System.out.println("Count of negative numbers in the array: "+ negCount);
        System.out.println("Count of positive numbers in the array: "+posCount);
    }

    public static boolean doesEleExistInArray(int[] a,int ele)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==ele)
            {
                return true;
            }
        }
        return false;
    }

    public static void printEvenIndicesEle(int[] a)
    {
        System.out.println("Elements at the even indices in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void printOddIndicesEle(int[] a)
    {
        System.out.println("Elements at the odd indices in the array are: ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2!=0)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void printNumsGreaterThan(int[] a,int check)
    {
        System.out.print("Numbers greater than " +check+ " in the given array are:");
        for(int i:a)
        {
            if(i>check)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static int findSecLargestFromArray(int[] a)
    {
        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int i:a)
        {
            if(i>lar)
            {
                secLar = lar;
                lar = i;
            }
        }
        return secLar;
    }

    public static int countNumsDivBy(int[] a,int divisor)
    {
        int countDiv = 0;
        for(int i:a)
        {
            if(i%divisor==0)
            {
                countDiv++;
            }
        }
        return countDiv;
    }

    public static void printExcludingPositions(int[] a, int pos1, int pos2)
    {
        for(int i=0;i<a.length;i++)
        {
            if(i!=pos1 && i!=pos2)
            {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static int sumOfNegNums(int[] a)
    {
        int sumNegNums = 0;
        for(int i:a)
        {
            if(i<0)
            {
                sumNegNums = sumNegNums+i;
            }
        }
        return sumNegNums;
    }
}
